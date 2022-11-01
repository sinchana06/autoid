package com.mongo.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.example.models.Student4;
import com.mongo.example.rep.StudentRepository;
import com.mongo.example.service.SequenceGeneratorService;

@RestController
@RequestMapping("/student")
public class MyController {
	@Autowired
	private StudentRepository studentRepository;
    @PostMapping("/")
	public ResponseEntity<?> addStudent(@RequestBody Student4 student )
	{ 
	student.setId("DSCE"+SequenceGeneratorService.generateSequence(Student4.SEQUENCE_NAME));
		Student4 save = this.studentRepository.save(student);
		return ResponseEntity.ok(save);
	}
    
    @GetMapping("/")
	public ResponseEntity<?> getStudents()
	{
		
		return ResponseEntity.ok(this.studentRepository.findAll());
	}
}
