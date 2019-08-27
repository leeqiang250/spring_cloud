package cn.user.repository;

import cn.user.entity.Test;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;

@Api("TestRepository")
public interface TestRepository extends JpaRepository<Test, Long> {

}