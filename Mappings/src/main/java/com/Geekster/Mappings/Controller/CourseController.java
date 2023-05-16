package com.Geekster.Mappings.Controller;

import com.Geekster.Mappings.Model.Course;
import com.Geekster.Mappings.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;
    @PostMapping("/add")
    public void addacourse(@RequestBody Course course){
        courseService.addacourse(course);
    }
    @GetMapping("/fetch/{id}")
    public Course getACOURSE(@PathVariable Long id){
        return courseService.getACOURSE(id);
    }
    @PutMapping("/update/{id}/{title}")
    public void updatebyid(@PathVariable Long id,@PathVariable String title){
        courseService.updatebyid(id,title);
    }
    @DeleteMapping("/delete/{id}")
    public void deletebyid(@PathVariable Long id){
        courseService.deletebyid(id);
    }
}
