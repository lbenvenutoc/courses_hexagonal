package com.luisbenvenuto.courses.adapters.jpa;

import com.luisbenvenuto.courses.domain.ports.output.CoursePersistence;
import com.luisbenvenuto.courses.domain.models.Course;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;

@Slf4j
@Component
@AllArgsConstructor
public class CoursePersistenceJpa implements CoursePersistence {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    @Override
    public List<Course> getCourses() {
        return courseMapper.listCoursesEntityToListCourses(courseRepository.findAll());
    }

    @Override
    public Course saveCourse(Course course) {
        CourseEntity courseEntity = courseRepository.save(courseMapper.courseToCourseEntity(course));
        return courseMapper.courseEntityToCourse(courseEntity);
    }
}
