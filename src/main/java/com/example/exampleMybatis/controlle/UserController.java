package com.example.exampleMybatis.controlle;

import com.example.exampleMybatis.dto.UserDto;
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

    @PostMapping()
    public void user(@RequestBody UserDto userDto){

    }
}
