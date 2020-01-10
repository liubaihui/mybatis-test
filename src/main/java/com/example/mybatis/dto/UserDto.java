package com.example.mybatis.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author liubh
 * @date 2020/1/10
 */
@Data
@Accessors(chain = true)
public class UserDto {
    private String name;
}
