package com.example.SwaggerUsql.Service;

import com.example.SwaggerUsql.Entity.Faculty;

import java.util.List;

public interface Facultyservice {

    public Faculty saveFaculty(Faculty faculty);

    public List<Faculty> getallFaculties();
}
