package com.example.SwaggerUsql.Repository;

import com.example.SwaggerUsql.Entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacultyRepo extends JpaRepository<Faculty,Long> {



}
