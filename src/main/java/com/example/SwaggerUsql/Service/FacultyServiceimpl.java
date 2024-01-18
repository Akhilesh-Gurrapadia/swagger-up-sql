package com.example.SwaggerUsql.Service;

import com.example.SwaggerUsql.Entity.Faculty;
import com.example.SwaggerUsql.Repository.FacultyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FacultyServiceimpl  implements Facultyservice{


    @Autowired
    FacultyRepo facultyservice;

    @Override
    public Faculty saveFaculty(Faculty faculty) {
        return facultyservice.save(faculty);
    }

    @Override
    public List<Faculty> getallFaculties() {
        return facultyservice.findAll();
    }
}
