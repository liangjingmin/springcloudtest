package cn.lifeshop.sso.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
	
	@Value("${messagefrom}")
	private String messagefrom;
	
	@RequestMapping("/testConfig")
	public String testConfig() {
		return this.messagefrom;
	}

	public String getMessagefrom() {
		return messagefrom;
	}

	public void setMessagefrom(String messagefrom) {
		this.messagefrom = messagefrom;
	}

	
}
