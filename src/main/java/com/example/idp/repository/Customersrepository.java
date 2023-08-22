package com.example.idp.repository;

import com.example.idp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Customersrepository extends JpaRepository<Customer, Integer> {
}

