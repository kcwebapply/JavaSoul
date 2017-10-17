package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ScopedProxyMode;

@SpringBootApplication
@ComponentScan(
		scopedProxy = ScopedProxyMode.TARGET_CLASS,
		basePackages = {"javasoul"}
		)
public class JavaSoulApplication {
    public static ConfigurableApplicationContext context; 
	public static void main(String[] args) {
		 context = SpringApplication.run(JavaSoulApplication.class, args);
	}
}
