package com.lfz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class SbDemoApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SbDemoApplication.class);
		// 关闭banner
//		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run();
	}

}
