package com.Geekster.Mappings.Service;

import com.Geekster.Mappings.Model.Student;
import com.Geekster.Mappings.Repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public void save(Student student) {
        studentDao.save(student);
    }
}
