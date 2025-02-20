package com.ead.course.services;

import com.ead.course.models.CourseModel;
import com.ead.course.models.CourseUserModel;

import java.util.UUID;

public interface CourseUserService {
    boolean existByCourseAndUserId(CourseModel courseModel, UUID userId);
    CourseUserModel saveAndSendSubscriptionUserInCourse(CourseUserModel courseUserModel);

    boolean existByUserId(UUID userId);

    void deleteAllByUserId(UUID userId);
}
