package com.example.NurseryManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.NurseryManagementSystem.model.plantModel;
//import com.example.NurseryManagementSystem.model.plantModel;
import com.example.NurseryManagementSystem.repository.plantRepository;
import com.example.StudentManagement0.model.studentAttribute;

//@Controller
@RestController
public class plantControlller {

	@Autowired
	plantRepository plant;

	@GetMapping("/index")
	public String welComePage() {
		return "index";
	}

	// APi for Enter data Of flower
	@GetMapping("/registration")
	public String registered() {
		return "registration";
	}

	// API responsible for insert data into database
	@PostMapping("/HomePage")
	public String home(@ModelAttribute plantModel plt) {
		plant.save(plt);
		return "Insertion Successful";
	}
	// Its show data on Browser , first i need use @RestController instead of
	// @Controller

	@GetMapping("/showOnBrowser")
	public List<plantModel> getformvalue1() {
		 System.out.println(plant.findAll());
		return plant.findAll();
	}
	// its shows data on console
		@GetMapping("/get")
		public String userInput() {
			System.out.println(plant.findAll());
			return "index";
		}
		 @DeleteMapping("/deleteData/{id}")
		    public String deleteStudentByEmail(@PathVariable String id) {
		        plant.deleteById(id);
		        return "Deletion Successful";
		    }   
		 
		 @PutMapping("/update")
		 public plantModel update(@RequestBody plantModel plt) {
			return plant.save(plt);
			 
		 }
}
