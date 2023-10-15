package com.bgs.bangdae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BangDaeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BangDaeApplication.class, args);
	}

}
