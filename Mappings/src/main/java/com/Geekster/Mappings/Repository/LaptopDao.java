package com.Geekster.Mappings.Repository;

import com.Geekster.Mappings.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopDao extends JpaRepository<Laptop,Long> {

}
