package cn.common.util;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import java.lang.reflect.ParameterizedType;
import java.util.Optional;

@Api("Service")
public abstract class ServiceImpl<E extends Entity, D extends Dto> {

    private Class<E> eClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    private Class<D> dClass = (Class<D>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];

    public abstract JpaRepository getRepository();

    @Transactional
    @ApiOperation("增加或修改数据")
    public boolean addOrUpdate(D d) {
        if (d == null)
            throw BusinessException.exception(Error.ParamError);

        E e = TypeConvert.get(d, eClass);
        getRepository().save(e);
        return true;
    }

    @Transactional
    @ApiOperation("删除数据通过id")
    public boolean deleteById(Long id) {
        if (id == null)
            throw BusinessException.exception(Error.ParamError);

        getRepository().deleteById(id);
        return true;
    }

    @Transactional
    @ApiOperation("删除全部数据")
    public boolean deleteAll() {
        getRepository().deleteAll();
        return true;
    }

    @ApiOperation("获取数据通过id")
    public D getById(Long id) {
        if (id == null)
            throw BusinessException.exception(Error.ParamError);

        Optional<E> es = getRepository().findById(id);
        if (es == null || es.equals(Optional.empty()))
            return null;

        return TypeConvert.get(es.get(), dClass);
    }

    @ApiOperation("获取全部数据")
    public List<D> getAll() {
        List<E> es = getRepository().findAll();
        List<D> ds = new ArrayList<D>(es.size());
        es.forEach(e -> {
            ds.add(TypeConvert.get(e, dClass));
        });
        return ds;
    }

}