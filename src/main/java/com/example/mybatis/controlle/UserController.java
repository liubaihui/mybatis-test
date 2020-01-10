package com.example.mybatis.controlle;

import com.example.mybatis.dto.UserDto;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liubh
 * @date 2020/1/10
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    public void user(@RequestBody UserDto userDto){

        userService.user(userDto);
    }
}
