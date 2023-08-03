package com.app.ecommerceapp.Dao;

import com.app.ecommerceapp.Entity.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Product_Repository extends JpaRepository<product,Long> {
}
