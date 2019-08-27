package cn.user.service;

import cn.common.util.ServiceImpl;
import cn.user.dto.TestDto;
import cn.user.entity.Test;
import cn.user.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ServiceImpl<Test, TestDto> implements TestService {

    @Autowired
    private TestRepository repository;

    @Override
    public TestRepository getRepository() {
        return repository;
    }

}