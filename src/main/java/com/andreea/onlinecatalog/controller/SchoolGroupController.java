package com.andreea.onlinecatalog.controller;

import com.andreea.onlinecatalog.model.SchoolGroup;
import com.andreea.onlinecatalog.model.Student;
import com.andreea.onlinecatalog.service.SchoolGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SchoolGroupController {
    @Autowired
    private SchoolGroupService schoolGroupService;

    @GetMapping("allschoolgroups")
    public String showAllSchoolGroups(Model model){
        List<SchoolGroup> schoolGroups=schoolGroupService.findAll();
        model.addAttribute("schoolgroups",schoolGroups);
        return "schoolgroup/showallschoolgroups";

    }

    @GetMapping("/addschoolgroup")
    public String addSchoolGroup(Model model) {
        model.addAttribute("schoolgroup", new SchoolGroup()); // initial bind with the form, to say to the webpage
        // what is the type of student th:object

        return "schoolgroup/addschoolgroup";
    }

    @PostMapping("/addschoolgroup")
    public String addSchoolGroup(@ModelAttribute SchoolGroup schoolGroup) {
//        System.out.println(student);
        schoolGroupService.save(schoolGroup);
        return "redirect:/allschoolgroups";
        //TODO: show in same page on the left all students, on the right add a new student
    }

}
