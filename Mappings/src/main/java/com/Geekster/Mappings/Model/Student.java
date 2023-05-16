package com.Geekster.Mappings.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String age;

    private String phoneNumber;

    private String branch;

    private String department;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Course> courselist;

    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "student")
    private List<Book> book;
}
