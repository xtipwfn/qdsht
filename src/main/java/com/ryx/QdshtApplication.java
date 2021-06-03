package com.ryx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ryx.mapper")
public class QdshtApplication {

	public static void main(String[] args) {
		SpringApplication.run(QdshtApplication.class, args);
	}

}
