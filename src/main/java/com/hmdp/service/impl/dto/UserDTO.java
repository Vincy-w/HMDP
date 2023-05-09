package com.hmdp.service.impl.dto;

import lombok.Data;

@Data
public class UserDTO extends com.hmdp.dto.UserDTO {
    private Long id;
    private String nickName;
    private String icon;
}
