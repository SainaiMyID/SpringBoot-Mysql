package com.mycom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycom.pojo.UserPojo;
import com.mycom.service.ServiceClass;

@RestController
@RequestMapping("/api")
public class ControllerClass {
	
	@Autowired
	private ServiceClass sclass;
	
	@RequestMapping(value="/adduser",method=RequestMethod.POST)
	public List<UserPojo> addUser(@RequestBody UserPojo upojo){
		return sclass.addData(upojo);
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String addUser(){
		return "Done..!!";
	}
	
	@RequestMapping(value="/getalluser",method=RequestMethod.GET)
	public List<UserPojo> getUser(){
		return sclass.getData();
	}
}
