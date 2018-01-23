package com.lrlz.springcloud.gateway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@MapperScan(basePackages = "com.lrlz.gateway.dao")
@EnableFeignClients({"com.lrlz.springcloud.gateway.*", "com.*"})
@EnableZuulProxy
public class ApplicationGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationGatewayApplication.class, args);
	}
}
