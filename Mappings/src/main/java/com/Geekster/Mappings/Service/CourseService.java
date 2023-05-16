package com.Geekster.Mappings.Service;

import com.Geekster.Mappings.Model.Course;
import com.Geekster.Mappings.Repository.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    public void addacourse(Course course) {
        courseDao.save(course);
    }

    public Course getACOURSE(Long id) {
        Optional<Course> course=courseDao.findById(id);
       return course.get();
    }

    public void updatebyid(Long id, String title) {
        Optional<Course> course=courseDao.findById(id);
        Course course1= course.get();
        course1.setTitle(title);
    }

    public void deletebyid(Long id) {
        courseDao.deleteById(id);
    }
}
