package cn.user.service;

import cn.common.util.Service;
import cn.user.dto.TestDto;
import cn.user.entity.Test;
import io.swagger.annotations.Api;

@Api("TestService")
public interface TestService extends Service<Test, TestDto> {

}