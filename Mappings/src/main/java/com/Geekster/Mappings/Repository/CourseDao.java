package com.Geekster.Mappings.Repository;

import com.Geekster.Mappings.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course,Long>{

}
