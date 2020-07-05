package com.andreea.onlinecatalog.repository;

import com.andreea.onlinecatalog.model.Discipline;
import com.andreea.onlinecatalog.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DisciplineRepository extends JpaRepository<Discipline,String> {

}
