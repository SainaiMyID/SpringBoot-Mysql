package com.mycom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.daointerface.DaoInterface;
import com.mycom.pojo.UserPojo;

@Service
public class ServiceClass {

	@Autowired
	private DaoInterface daointer;
	
	public List<UserPojo> addData(UserPojo upojo) {
		return daointer.addtoDB(upojo);
	}
	
	public List<UserPojo> getData() {
		return daointer.getDataFromDB();
	}

}
