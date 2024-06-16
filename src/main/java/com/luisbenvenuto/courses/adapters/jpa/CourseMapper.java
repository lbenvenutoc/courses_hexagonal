package com.luisbenvenuto.courses.adapters.jpa;

import com.luisbenvenuto.courses.domain.models.Course;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    CourseEntity courseToCourseEntity(Course course);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    Course courseEntityToCourse(CourseEntity courseEntity);

    List<Course> listCoursesEntityToListCourses(List<CourseEntity> listCoursesEntity);

}
