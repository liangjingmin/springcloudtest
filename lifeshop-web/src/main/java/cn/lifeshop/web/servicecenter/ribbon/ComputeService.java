package cn.lifeshop.web.servicecenter.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ComputeService {
	@Autowired
    RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="addServiceFallBack")
	public String addService(Integer a, Integer b) {
		return restTemplate.getForEntity("http://SSO-SERVICE/add?a="+a+"&b="+b, String.class).getBody();
	}
	
	public String addServiceFallBack(Integer a, Integer b) {
		return "ribbon error";
	}
}
