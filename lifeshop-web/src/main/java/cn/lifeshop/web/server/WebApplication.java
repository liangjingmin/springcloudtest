package cn.lifeshop.web.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@EnableFeignClients(basePackages= {"cn.lifeshop.web.feignInterface"})
@SpringBootApplication
@ComponentScan(basePackages= {"cn.lifeshop.web.feignInterface.hytrixfb","cn.lifeshop.web.controller","cn.lifeshop.web.servicecenter.ribbon"})
@EnableCircuitBreaker
public class WebApplication {
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
