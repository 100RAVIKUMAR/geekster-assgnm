package com.Geekster.Restaurant.Controller;

import com.Geekster.Restaurant.Model.restaurentmodel;
import com.Geekster.Restaurant.Service.restaurentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class restaurentcontroller {
    @Autowired
    restaurentservice restaurantserv;
    @PostMapping(value = "add")
    public String addrest(@RequestBody restaurentmodel restaurent){
        return restaurantserv.addarest(restaurent);
    }
    @GetMapping(value = "restaurant/{id}")
    public restaurentmodel getrest(@PathVariable String id){
        return restaurantserv.getarest(id);
    }
    @GetMapping(value = "allrest")
    public List<restaurentmodel> getalrest(){
        return restaurantserv.getrestlist();
    }
    @PutMapping(value = "update/{speciality}")
    public String updaterest(@RequestBody String special,@PathVariable String speciality){
        return restaurantserv.updtrest(special,speciality);
    }
    @DeleteMapping(value = "delete/{id}")
    public String deleterest(@PathVariable String id){
        return restaurantserv.deletearest(id);
    }
}
