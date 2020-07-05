package com.andreea.onlinecatalog.controller;
import com.andreea.onlinecatalog.model.Professor;
import com.andreea.onlinecatalog.model.Student;
import com.andreea.onlinecatalog.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @GetMapping("allprofessors")
    public String showAllProfessors(Model model) {
        List<Professor> professorList = professorService.findAll();
        model.addAttribute("professors", professorList);
        return "professor/showallprofessors";
    }

    @GetMapping("/addprofessor")
    public String addProfessor(Model model) {
        model.addAttribute("professor", new Professor()); // initial bind with the form, to say to the webpage
        // what is the type of professor th:object
        return "professor/addprofessor";
    }

    @PostMapping("/addprofessor")
    public String addStudent(@ModelAttribute Professor professor) {
        professorService.save(professor);
        return "redirect:/allprofessors";
        //TODO: show in same page on the left all students, on the right add a new student
    }
    @GetMapping("professor/editprofessor/{id}")
    public String editStudent(Model model, @PathVariable Integer id) {
        Professor professor = professorService.findById(id);

        model.addAttribute("professor", professor); // initial bind with the form, to say to the webpage
        // what is the type of student th:object

        return "editprofessor";
    }

    @PostMapping("professor/editprofessor/{id}")
    public String editStudent(@ModelAttribute Professor professor, @PathVariable Integer id) {
        Professor database_professor=professorService.findById(id); // ti be able to update that id, get it from database
        database_professor.setLastName(professor.getLastName()); // update fields
        database_professor.setFirstName(professor.getFirstName());

        System.out.println(database_professor);
        professorService.save(database_professor); // save it again. SAVE acts as UPDATE
//        return "redirect:/editstudent/"+id;
        return "redirect:/allprofessor";
        //TODO: show in same page on the left all students, on the right add a new student
    }

}