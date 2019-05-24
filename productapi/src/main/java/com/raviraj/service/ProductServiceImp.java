package com.raviraj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raviraj.dao.ProductDao;
import com.raviraj.model.Product;


@Service
@Transactional(readOnly = true)
public class ProductServiceImp implements ProductService {

   @Autowired
   private ProductDao ProductDao;

   @Transactional
   @Override
   public long save(Product Product) {
      return ProductDao.save(Product);
   }

   @Override
   public Product get(long id) {
      return ProductDao.get(id);
   }

   @Override
   public List<Product> list() {
      return ProductDao.list();
   }

   @Transactional
   @Override
   public void update(long id, Product Product) {
      ProductDao.update(id, Product);
   }

   @Transactional
   @Override
   public void delete(long id) {
      ProductDao.delete(id);
   }



}
