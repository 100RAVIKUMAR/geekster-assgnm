package com.Geekster.Restaurant.Repository;

import com.Geekster.Restaurant.Model.restaurentmodel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class restaurantdao {
    private List<restaurentmodel> mandates;

    public restaurantdao() {
        mandates = new ArrayList<>();
        System.out.println("list created");
    }

    public List<restaurentmodel> getallrest() {
        return mandates;
    }

    public String add1rest(restaurentmodel restaurent) {
        if (restaurent != null) {
            mandates.add(restaurent);
            return "restaurant enrollment successfull...";
        }
        return "enrollent is not valid..!!!";
    }

    public String updatearest(String special, String speciality) {
        for (restaurentmodel rest : mandates) {
            if (rest.getSpeciality().equals(speciality)) {
                rest.setSpeciality(special);
                return "updated Successfully...";
            }
        }
        return "no restaurant with such speciality exists to update...!!!!";
    }

    public String delete1rest(String id) {
        for (restaurentmodel rest : mandates) {
            if (rest.getId().equals(id)) {
                mandates.remove(rest);
                return "deleted Successfully...";
            }
        }
        return "no such restayrent exist in the list..!!!!";
    }
}
