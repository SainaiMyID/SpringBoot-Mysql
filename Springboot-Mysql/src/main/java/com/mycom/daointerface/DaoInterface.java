package com.mycom.daointerface;

import java.util.List;

import com.mycom.pojo.UserPojo;

public interface DaoInterface {

	public List<UserPojo> addtoDB(UserPojo upojo);
	public List<UserPojo> getDataFromDB();

}
