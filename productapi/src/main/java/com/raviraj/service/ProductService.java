package com.raviraj.service;



import com.raviraj.model.Product;

import antlr.collections.List;

import com.raviraj.dao.ProductDao;

public interface ProductService {

   long save(ProductDao Product);
   ProductDao get(long id);
   List list();
   void update(long id, ProductDao Product);
   void delete(long id);
long save(ProductService Product);
void update(long id, Product Product);
}