package com.bikkadIt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE_DTLS")
public class Course {
	@Id
	@Column(name = "COURSE_ID")
	private int CourseId;
	@Column(name = "COURSE_NAME")
	private String Course;

	public int getCourseId() {
		return CourseId;
	}

	public void setCourseId(int courseId) {
		CourseId = courseId;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourseName(String course) {
		Course = course;
	}

	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", CourseName=" + Course + "]";
	}

}
