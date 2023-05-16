package com.Geekster.Mappings.Service;

import com.Geekster.Mappings.Model.Address;
import com.Geekster.Mappings.Repository.AddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    AddressDao addressDao;

    public void save(Address address) {
        addressDao.save(address);
    }

    public Address getanadress(Long id) {
        Optional<Address>address= addressDao.findById(id);
        return address.get();
    }

    public void updatebyid(Long id, String zipcode) {
       Optional <Address> address=addressDao.findById(id);
       Address address1=address.get();
       address1.setZipcode(zipcode);
    }

    public void deletebyid(Long id) {
        addressDao.deleteById(id);
    }
}
