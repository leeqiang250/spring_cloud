package cn.manager.dto;

import cn.common.util.DTO;
import lombok.Data;

@Data
public class UserDto extends DTO {

    private String nickname;

    private String token;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}