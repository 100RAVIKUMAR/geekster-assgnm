package com.Geekster.Mappings.Repository;

import com.Geekster.Mappings.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student,Long> {
}
