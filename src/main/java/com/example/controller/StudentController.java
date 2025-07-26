package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Student;
import com.example.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "index";
	}

	@PostMapping("/save")
	public String saveStudent(@ModelAttribute Student student) {
		studentService.save(student);
		return "redirect:/list";
	}

	@GetMapping("/list")
	public ModelAndView showList() {
		List<Student>  allstudents=studentService.getAllStudents();
		ModelAndView mv = new ModelAndView();
        mv.setViewName("list");
        mv.addObject("studentList", allstudents);
		return mv;	
	}
	@GetMapping("/updateStudent/{id}")
	public String updateStudent(@PathVariable("id") int id, Model model) {
		Student student = studentService.getStudentById(id);
		 student.setName( "MR."+student.getName());
        model.addAttribute("student", student);
		return "update";
		
	}
	@PostMapping("/updateStd")
	public String saveUpdate(@ModelAttribute("student") Student student) {
	   // studentService.updateStudent(student);
		 studentService.updateStudent(student);
	    System.out.println("updating std work"+student.getId());
	    return "redirect:/students"; // list page
	}
}
