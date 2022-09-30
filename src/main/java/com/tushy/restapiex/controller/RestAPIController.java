package com.tushy.restapiex.controller;


import com.tushy.restapiex.entity.Task;
import com.tushy.restapiex.repository.TaskRepository;
import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestAPIController {
@Autowired
    TaskRepository taskrepo;
    @GetMapping("/msg")
    public ResponseEntity<String> getDisplay(@PathVariable String name){

        return new ResponseEntity<>("Hello "+name,HttpStatus.ACCEPTED);
    }


    @PutMapping("/utask/{id}")
    public ResponseEntity<Task> updateTask(@RequestParam(name = "id") Long id,@RequestBody Task task){
        Optional<Task> o = taskrepo.findById(id);
        if (o.isEmpty()){
            return new ResponseEntity<>(task,HttpStatus.NOT_FOUND);
        }
        Task task1 = taskrepo.save(task);


        return new ResponseEntity<>(task,HttpStatus.ACCEPTED);
    }

}
