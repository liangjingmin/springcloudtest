package cn.lifeshop.sso.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("cn.lifeshop.sso.controller")
public class SSOApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(SSOApplication.class).web(true).run(args);
	}
}
