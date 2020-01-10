package com.example.exampleMybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.example.exampleMybatis.repository.mapper")
public class ExampleMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleMybatisApplication.class, args);
	}

}
