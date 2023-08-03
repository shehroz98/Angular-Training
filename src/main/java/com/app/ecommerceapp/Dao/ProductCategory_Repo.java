package com.app.ecommerceapp.Dao;

import com.app.ecommerceapp.Entity.product_category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product_category")
public interface ProductCategory_Repo extends JpaRepository<product_category,Long> {
}
