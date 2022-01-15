package com.lti.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.mypack.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer>{

}
