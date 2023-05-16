package com.Geekster.Mappings.Service;

import com.Geekster.Mappings.Model.Laptop;
import com.Geekster.Mappings.Repository.LaptopDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    LaptopDao laptopDao;

    public void addalaptop(Laptop laptop) {
        laptopDao.save(laptop);
    }

    public Laptop getalaptop(Long id) {
       Optional<Laptop>laptop= laptopDao.findById(id);
       return laptop.get();
    }

    public void updatebyid(Long id, Integer price) {
        Optional<Laptop>laptop= laptopDao.findById(id);
        Laptop laptop1=laptop.get();
        laptop1.setPrice(price);
    }

    public void deletebyid(Long id) {
        laptopDao.deleteById(id);
    }
}
