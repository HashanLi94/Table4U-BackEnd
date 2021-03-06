package com.springboot.restuarant.Table4U.dao;

import com.springboot.restuarant.Table4U.entity.Booking;
import com.springboot.restuarant.Table4U.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT c.customerId FROM Customer c Where c.nic= :nic")
    Integer getCustomerIdByNIC(@Param("nic")String nic);

}
