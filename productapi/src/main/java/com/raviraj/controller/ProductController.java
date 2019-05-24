package com.raviraj.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raviraj.model.Product;
import com.raviraj.service.ProductService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ProductController {

   @Autowired
   private ProductService ProductService;

   /*---Add new Product---*/
   @PostMapping("/Product")
   public ResponseEntity<?> save(@RequestBody Product Product) {
      long id = ProductService.save(Product);
      return ResponseEntity.ok().body("New Product has been saved with ID:" + id);
   }

   /*---Get a Product by id---*/
   @GetMapping("/Product/{id}")
   public ResponseEntity<Product> get(@PathVariable("id") long id) {
      Product Product = ProductService.get(id);
      return ResponseEntity.ok().body(Product);
   }

   /*---get all Products---*/
   @GetMapping("/Product")
   public ResponseEntity<List<Product>> list() {
      List<Product> Products = ProductService.list();
      return ResponseEntity.ok().body(Products);
   }

   /*---Update a Product by id---*/
   @PutMapping("/Product/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Product Product) {
      ProductService.update(id, Product);
      return ResponseEntity.ok().body("Product has been updated successfully.");
   }

   /*---Delete a Product by id---*/
   @DeleteMapping("/Product/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
      ProductService.delete(id);
      return ResponseEntity.ok().body("Product has been deleted successfully.");
   }
}
