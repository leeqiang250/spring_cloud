package cn.manager.service;

import cn.common.util.Service;
import cn.manager.dto.LogDto;

public interface LogService extends Service<LogDto> {

    LogDto getOne();

}