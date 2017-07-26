package cn.lifeshp.gatway.server;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import cn.lifeshp.gatway.filters.AccessFilter;

@EnableZuulProxy
@SpringCloudApplication
public class GatwayApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(GatwayApplication.class).web(true).run(args);
	}
	
	@Bean
	public AccessFilter getAccessFilter() {
		return new AccessFilter();
	}
}
