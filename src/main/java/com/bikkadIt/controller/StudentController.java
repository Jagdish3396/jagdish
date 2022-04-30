package com.bikkadIt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.bikkadIt.binding.Student;
import com.bikkadIt.service.ServiceImpl;

@Controller
public class StudentController {
	@Autowired
	ServiceImpl serviceImpl;
	

	@GetMapping("/student")
	public String loadForm(Model model) {
		List<String> gender = serviceImpl.getGenders();
		List<String> course = serviceImpl.getCourse();
		List<String> timing = serviceImpl.getTiming();

		model.addAttribute("gender", gender);
		model.addAttribute("course", course);
		model.addAttribute("timing", timing);

		model.addAttribute("student", new Student());
		return "registration";

	}
}
