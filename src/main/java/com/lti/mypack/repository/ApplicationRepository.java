package com.lti.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.mypack.model.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer>{


}
