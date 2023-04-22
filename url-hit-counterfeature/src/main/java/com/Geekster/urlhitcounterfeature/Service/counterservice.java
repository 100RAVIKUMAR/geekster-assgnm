package com.Geekster.urlhitcounterfeature.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class counterservice {
    private HashMap<String,Integer>map;

    public counterservice() {
        map=new HashMap<>();
        System.out.println("hashmap created");
    }

    public String gethitcount(String username) {
        if(username!=null){
            map.put(username,map.getOrDefault(username,0)+1);
            return "username :"+username+",count :"+map.get(username);
        }
        return "unsupported username..!!!!!!";
    }
}
