package com.Geekster.urlhitcounterfeature.Controller;

import com.Geekster.urlhitcounterfeature.Service.counterservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class countercontroller {
    @Autowired
    counterservice counter;
    @GetMapping(value = "count/{username}")
    public String getHitCount(@PathVariable String username){
        return counter.gethitcount(username);
    }
}
