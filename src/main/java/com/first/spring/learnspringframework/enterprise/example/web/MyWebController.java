package com.first.spring.learnspringframework.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.first.spring.learnspringframework.enterprise.example.business.BusinessService;

@Component
public class MyWebController {
	
	private BusinessService Business;
	
	@Autowired
	public	MyWebController(BusinessService Business) {
		this.Business = Business;
	} 
	
	public long returnValueFromBusinessService() {
		return Business.calculateSum();
	}
}
