package com.luisbenvenuto.courses.adapters.rest;


import com.luisbenvenuto.courses.domain.models.Course;
import com.luisbenvenuto.courses.domain.ports.input.CourseService;
import com.luisbenvenuto.courses.domain.models.CourseResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collections;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/courses")
    public ResponseEntity<CourseResponse> getCourses() {

        return ResponseEntity.ok(CourseResponse.builder()
                .data(courseService.getCourses())
                .notifications(Collections.emptyList())
                .build());
    }

    @PostMapping("/courses")
    public ResponseEntity<CourseResponse> saveCourse(@RequestBody Course course) {
        return ResponseEntity.ok(CourseResponse.builder()
                .data(Collections.singletonList(courseService.saveCourse(course)))
                .notifications(Collections.emptyList())
                .build());
    }
}
