package com.luisbenvenuto.courses.domain.ports.input;

import com.luisbenvenuto.courses.domain.models.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public Course saveCourse(Course course);
}
