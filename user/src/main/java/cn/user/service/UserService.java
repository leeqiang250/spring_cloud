package cn.user.service;

import cn.common.util.Service;
import cn.user.dto.UserDto;

public interface UserService extends Service<UserDto> {

    UserDto getByToken(String token);

}