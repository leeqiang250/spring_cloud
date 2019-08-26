package cn.manager.service;

import cn.common.util.ServiceImpl;
import cn.manager.dto.LogDto;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl extends ServiceImpl<LogDto> implements LogService {

    @Override
    public LogDto getOne() {
        return new LogDto();
    }

}