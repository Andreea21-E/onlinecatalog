package com.andreea.onlinecatalog.repository;

import com.andreea.onlinecatalog.model.Professor;
import com.andreea.onlinecatalog.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {


}
