package com.ead.course.repositories;

import com.ead.course.models.ModuleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ModuleRepository extends JpaRepository<ModuleModel, UUID>, JpaSpecificationExecutor<ModuleModel> {

//    @EntityGraph(attributePaths = {"course"})
//    ModuleModel findByTitle(String name);

    @Query(value = "select * from tb_modules where course_course_id = :courseId", nativeQuery = true)
    List<ModuleModel> findallModulesIntoCourse (@Param("courseId") UUID courseId);

    @Query(value = "select * from tb_modules where course_course_id = :courseId and module_id = :moduleId", nativeQuery = true)
    List<ModuleModel> findModuleIntoCourse(@Param("courseId") UUID courseId,
                                           @Param("moduleId") UUID moduleId);
}
