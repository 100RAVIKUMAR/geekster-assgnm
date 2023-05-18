package com.example.RestaurantManagement.service;

import com.example.RestaurantManagement.model.RestaurantManagement;
import com.example.RestaurantManagement.repository.IRestaurantManagementRepository;
import com.example.RestaurantManagement.repository.IRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RestaurantManagementService {

    @Autowired
    IRestaurantManagementRepository iRestaurantManagementRepository;

    @Autowired
    IRestaurantRepository iRestaurantRepository;

    public RestaurantManagement RestaurantById(Long restaurantid) {
        Optional<RestaurantManagement>rm= iRestaurantManagementRepository.findById(restaurantid);
        return rm.get();
    }

    public RestaurantManagement updatebyid(Long recordId) {
        Optional<RestaurantManagement>rm= iRestaurantManagementRepository.findById(recordId);
        RestaurantManagement restaurantManagement=rm.get();
        return iRestaurantManagementRepository.save(restaurantManagement);
    }
}

