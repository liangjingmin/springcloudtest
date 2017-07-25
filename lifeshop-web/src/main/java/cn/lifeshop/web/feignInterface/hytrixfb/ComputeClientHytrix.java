package cn.lifeshop.web.feignInterface.hytrixfb;

import org.springframework.stereotype.Component;

import cn.lifeshop.web.feignInterface.ComputeClient;

@Component
public class ComputeClientHytrix implements ComputeClient{

	@Override
	public Integer add(Integer a, Integer b) {
		
		return -9999999;
	}

}
