package com.form.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.form.model.Lead;
import com.form.repository.LeadRepository;

@RestController
@RequestMapping("/leads")
@CrossOrigin(origins = "*")
public class LeadController {

	 	@Autowired
	    private LeadRepository leadRepository;

	    @PostMapping
	    public Map<String, Object> createLead(@RequestBody Lead lead) {
	        leadRepository.save(lead);
	        Map<String, Object> response = new HashMap<>();
	        response.put("success", true);
	        return response;
	    }
}
