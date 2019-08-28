package cn.manager.service;

import cn.common.util.BusinessException;
import cn.common.util.Error;
import cn.common.util.ServiceImpl;
import cn.common.util.TypeConvert;
import cn.manager.dto.TestDto;
import cn.manager.entity.Test;
import cn.manager.repository.TestRepository;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@Api("TestServiceImpl")
public class TestServiceImpl extends ServiceImpl<Test, TestDto> implements TestService {

    @Autowired
    private TestRepository repository;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public TestRepository getRepository() {
        return repository;
    }

    @Override
    public boolean deleteAll() {
        throw new BusinessException(Error.Forbid);
    }

    @Override
    public TestDto getById(Long id) {
        String value = redisTemplate.opsForValue().get("test");
        if (!StringUtils.isEmpty(value)) {
            return TypeConvert.parse(value, TestDto.class);
        }
        TestDto dto = super.getById(id);
        if (dto != null) {
            value = JSONObject.toJSONString(dto, SerializerFeature.WriteMapNullValue);
            redisTemplate.opsForValue().set("test", value);
        }

        return dto;
    }
}