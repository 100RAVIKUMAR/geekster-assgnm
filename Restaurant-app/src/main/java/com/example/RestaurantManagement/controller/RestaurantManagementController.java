package com.example.RestaurantManagement.controller;

import com.example.RestaurantManagement.model.RestaurantManagement;
import com.example.RestaurantManagement.service.RestaurantManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurantmanagement")
public class RestaurantManagementController {

    @Autowired
    private RestaurantManagementService restaurantManagementService;

    @GetMapping("/fetch/{restaurantid}")
    public RestaurantManagement RestaurantById(@PathVariable Long restaurantid){
        return restaurantManagementService.RestaurantById(restaurantid);
    }

    @PutMapping("/update/{recordId}")
    public RestaurantManagement updateRestaurantbyId(@PathVariable Long recordId){
        return restaurantManagementService.updatebyid(recordId);
    }
}
