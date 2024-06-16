package com.luisbenvenuto.courses.domain.services;

import com.luisbenvenuto.courses.domain.ports.output.CoursePersistence;
import com.luisbenvenuto.courses.domain.models.Course;
import com.luisbenvenuto.courses.domain.ports.input.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    public final CoursePersistence coursePersistence;

    @Override
    public List<Course> getCourses() {
        return coursePersistence.getCourses();
    }

    @Override
    public Course saveCourse(Course course) {
        return  coursePersistence.saveCourse(course);
    }
}
