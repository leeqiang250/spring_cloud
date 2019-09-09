package cn.common.util;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Api("业务异常")
public class BusinessException extends RuntimeException {

    @ApiModelProperty("异常传输DTO")
    private ErrorCodeDTO errorCodeDTO;

    public BusinessException(ErrorCodeDTO dto) {
        this.errorCodeDTO = dto;
    }

    public static BusinessException exception(ErrorCodeDTO dto) {
        return new BusinessException(dto);
    }

}