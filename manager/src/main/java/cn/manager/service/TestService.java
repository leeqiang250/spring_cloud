package cn.manager.service;

import cn.common.util.Service;
import cn.manager.dto.TestDto;
import cn.manager.entity.Test;
import io.swagger.annotations.Api;

@Api("TestService")
public interface TestService extends Service<Test, TestDto> {

}