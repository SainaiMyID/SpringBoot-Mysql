package com.mycom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycom.pojo.UserPojo;

@Repository
public interface UserRepository extends JpaRepository<UserPojo,Long>{
}
