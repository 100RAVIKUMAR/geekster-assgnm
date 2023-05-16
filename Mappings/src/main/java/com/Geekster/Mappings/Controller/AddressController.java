package com.Geekster.Mappings.Controller;

import com.Geekster.Mappings.Model.Address;
import com.Geekster.Mappings.Repository.AddressDao;
import com.Geekster.Mappings.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("/add")
    public void addaddress(@RequestBody Address address){
        addressService.save(address);
    }

    @GetMapping("/fetchadress")
    public Address getanadress(@PathVariable Long id){
       return addressService.getanadress(id);
    }
    @PutMapping("/update/{id}/{zipcode}")
    public void updatebyid(@PathVariable Long id,@PathVariable String zipcode){
        addressService.updatebyid(id,zipcode);
    }
    @DeleteMapping("/delete/{id}")
    public void deletebyid(@PathVariable Long id){
        addressService.deletebyid(id);
    }
}
