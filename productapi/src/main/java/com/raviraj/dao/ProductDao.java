package com.raviraj.dao;

import java.util.List;

import com.raviraj.model.Product;

public interface ProductDao {

   long save(Product Product);

   Product get(long id);

   List<Product> list();

   void update(long id, Product Product);

   void delete(long id);

}