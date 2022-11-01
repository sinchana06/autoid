package com.mongo.example.rep;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.example.models.Student4;

public interface StudentRepository extends MongoRepository<Student4, Integer>{

}
