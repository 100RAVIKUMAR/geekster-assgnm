package com.Geekster.Restaurant.Service;

import com.Geekster.Restaurant.Model.restaurentmodel;
import com.Geekster.Restaurant.Repository.restaurantdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class restaurentservice {
    @Autowired
    restaurantdao restaurantrepo;

    public String addarest(restaurentmodel restaurent) {
        return restaurantrepo.add1rest(restaurent);
    }

    public restaurentmodel getarest(String id) {
        List<restaurentmodel>reference=restaurantrepo.getallrest();
        for(restaurentmodel rest:reference){
            if(rest.getId().equals(id)){
                return rest;
            }
        }
        return null;
    }

    public List<restaurentmodel> getrestlist() {
        List<restaurentmodel>reference=restaurantrepo.getallrest();
        return reference;
    }

    public String updtrest(String special, String speciality) {
        return restaurantrepo.updatearest(special,speciality);
    }

    public String deletearest(String id) {
        return restaurantrepo.delete1rest(id);
    }
}
