package com.mycom.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycom.daointerface.DaoInterface;
import com.mycom.pojo.UserPojo;
import com.mycom.repository.UserRepository;

@Service
@Transactional
public class DaoImpl implements DaoInterface {//

	@Autowired
	private UserRepository userjparepo;
	
	@Override
	public List<UserPojo> addtoDB(UserPojo upojo) {
		 userjparepo.save(upojo);
		 return (List<UserPojo>) userjparepo.findAll();
	}

	@Override
	public List<UserPojo> getDataFromDB() {
		return (List<UserPojo>) userjparepo.findAll();
	}

}
