package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lti.mypack.model.Customer;
import com.lti.mypack.model.Document;
import com.lti.mypack.service.DocumentService;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("homeloanrest/api")
public class DocumentController {
	
	@Autowired
	DocumentService dService;

	@GetMapping("/document")
	public  List<Document> getDocument(){
		return dService.getdocument();
	}

	@PostMapping("/document")
	
	public Document addDocument(@RequestBody Document document) {
		//Customer c=new Customer();
		//c.setCustomerid(@PathVariable("custid")int custid)
		//c.setCustomerid(105);
		//document.setCustomer(c);
		return dService.addDocument(document);
	}
	
	@PutMapping("/document")
	public boolean updateProduct(@RequestBody Document document) {
		return dService.updateDocument(document);
	}
	
	@DeleteMapping("/products")
	public boolean deleteProduct(@RequestBody Document document) {
		return dService.deleteDocument(document);
	}

}