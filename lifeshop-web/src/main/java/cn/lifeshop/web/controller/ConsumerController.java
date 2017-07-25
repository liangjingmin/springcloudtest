package cn.lifeshop.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.lifeshop.web.feignInterface.ComputeClient;
import cn.lifeshop.web.servicecenter.ribbon.ComputeService;

@RestController
public class ConsumerController {
    @Autowired
    ComputeService computeService;
    @Autowired
    ComputeClient computeClient;
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeService.addService(10, 20);
    }
    
    @RequestMapping(value = "/add2", method = RequestMethod.GET)
    public Integer add2() {
    	return computeClient.add(10, 22);
    }
}