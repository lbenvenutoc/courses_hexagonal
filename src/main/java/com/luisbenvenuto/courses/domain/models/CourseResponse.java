package com.luisbenvenuto.courses.domain.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class CourseResponse {
    private List<Course> data;
    private List<Notification> notifications;
}
