package cn.user.service;

import cn.common.util.BusinessException;
import cn.common.util.ServiceImpl;
import cn.user.dto.UserDto;
import cn.user.util.ErrorCode;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl extends ServiceImpl<UserDto> implements UserService {

    @Override
    public UserDto getByToken(String token) {
        if (StringUtils.isEmpty(token))
            throw new BusinessException(ErrorCode.ParamError);

        UserDto dto = new UserDto();
        dto.setToken(token);
        dto.setNickname(token);
        return dto;
    }
}