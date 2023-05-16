package com.Geekster.Mappings.Repository;

import com.Geekster.Mappings.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDao extends JpaRepository<Address,Long> {

}
