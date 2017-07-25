package cn.lifeshop.web.feignInterface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.lifeshop.web.feignInterface.hytrixfb.ComputeClientHytrix;
 
@FeignClient(value="SSO-SERVICE",fallback=ComputeClientHytrix.class)
public interface ComputeClient {
	@RequestMapping(method = RequestMethod.GET, value = "/add")
	Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
