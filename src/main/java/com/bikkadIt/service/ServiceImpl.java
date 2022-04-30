package com.bikkadIt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.model.Course;
import com.bikkadIt.model.Gender;
import com.bikkadIt.model.Timing;
import com.bikkadIt.repository.CourseRepository;
import com.bikkadIt.repository.GenderRepository;

import com.bikkadIt.repository.TimeRepository;

@Service
public class ServiceImpl {

	@Autowired
	private GenderRepository gengderRepository;
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private TimeRepository timeRepository;

	public List<String> getGenders() {
		List<Gender> list = gengderRepository.findAll();

		List<String> gender = new ArrayList<String>();
		for (Gender g : list) {
			gender.add(g.getGender());

		}
		return gender;

	}

	public List<String> getCourse() {
		List<Course> list = courseRepository.findAll();

		List<String> course = new ArrayList<String>();
		for (Course c : list) {
			course.add(c.getCourse());

		}
		return course;

	}

	public List<String> getTiming() {
		List<Timing> list = timeRepository.findAll();

		List<String> timing = new ArrayList<String>();
		for (Timing t : list) {
			timing.add(t.getTiming());

		}
		return timing;

	}

}
