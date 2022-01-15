package com.lti.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.model.Document;
import com.lti.mypack.repository.DocumentRepository;

@Service
@Transactional
public class DocumentServiceimpl implements DocumentService {
	
	@Autowired
	DocumentRepository docRepo;
	
	@Override
	public Document addDocument(Document document) {
		return  docRepo.save(document);
		
	}

	@Override
	public List<Document> getdocument() {
		
		return docRepo.findAll();
	}

	@Override
	public boolean updateDocument(Document document) {
		Document newd=docRepo.findById(document.getDocid()).get();
		newd=document;
		docRepo.save(newd);
		return false;
	}

	@Override
	public boolean deleteDocument(Document document) {
		docRepo.delete(document);
		return false;
	}

}
