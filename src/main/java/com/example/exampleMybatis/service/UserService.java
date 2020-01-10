package com.example.exampleMybatis.service;

import com.example.exampleMybatis.dto.UserDto;
import com.example.exampleMybatis.repository.entity.User;
import com.example.exampleMybatis.repository.mapper.UserMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liubh
 * @date 2020/1/10
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ModelMapper modelMapper;

    public void user(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userMapper.insert(user);
    }
}
