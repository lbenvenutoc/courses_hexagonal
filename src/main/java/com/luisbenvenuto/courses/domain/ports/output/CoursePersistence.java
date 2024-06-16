package com.luisbenvenuto.courses.domain.ports.output;

import com.luisbenvenuto.courses.domain.models.Course;

import java.util.List;

public interface CoursePersistence {

    public List<Course> getCourses();
    public Course saveCourse(Course course);


}
