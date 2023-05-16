package com.Geekster.Mappings.Controller;

import com.Geekster.Mappings.Model.Laptop;
import com.Geekster.Mappings.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @PostMapping("/add")
    public void addalaptop(@RequestBody Laptop laptop){
        laptopService.addalaptop(laptop);
    }
    @GetMapping("/fetch/{id}")
    public Laptop getalaptop(@PathVariable Long id){
        return laptopService .getalaptop(id);
    }
    @PutMapping("/update/{id}/{price}")
    public void updatebyid(@PathVariable Long id,@PathVariable Integer price){
        laptopService.updatebyid(id,price);
    }
    @DeleteMapping("/delete/{id}")
    public void deletebyid(@PathVariable Long id){
        laptopService.deletebyid(id);
    }
}
