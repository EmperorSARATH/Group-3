package com.example.Group3.HelloWorld.Contoller;

import com.example.Group3.HelloWorld.HelloWorldApplication;
import com.example.Group3.HelloWorld.Repository.Group3Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Group3.HelloWorld.Model.HelloWorld;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class HelloWorldController {
    @Autowired
    private Group3Repo group3;

    @GetMapping("hello")
    public List<HelloWorld> getAllHelloWorld() {
        return this.group3.findAll();
    }


    @PostMapping("hello")
    public HelloWorld createHello(@RequestBody HelloWorld helloworld) {
        return group3.save(helloworld);
    }

//    @PutMapping("/employees/{id}")
//    public ResponseEntity<HelloWorld> update(@PathVariable(value = "id") Long hid,
//                                             @RequestBody HelloWorld hello){
//        Optional<HelloWorld> hello2 = group3.findById(hid);
//        hello2.setResult(hello.getResult());
//
//        final HelloWorld updatedEmployee = group3.save(hello);
//        return ResponseEntity.ok(updatedEmployee);
//    }



}
