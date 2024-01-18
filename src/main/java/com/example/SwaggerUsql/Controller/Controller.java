package com.example.SwaggerUsql.Controller;


import com.example.SwaggerUsql.Entity.Faculty;
import com.example.SwaggerUsql.Service.FacultyServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {


    @Autowired
    FacultyServiceimpl facultyServiceimpl;




    @GetMapping("/Hello")
    public String sayHello(){

        return "Hello......Everyone.....FromSwaggerUsql";
    }

    @PostMapping("/saveFaculty")
    public ResponseEntity<Faculty> saveFaculty(@RequestBody Faculty faculty){

        return new ResponseEntity<Faculty>(facultyServiceimpl.saveFaculty(faculty), HttpStatus.OK) ;

    }


    @GetMapping("/getfaclties")
    public List<Faculty> allFaculties(){

        return facultyServiceimpl.getallFaculties();
    }




}
