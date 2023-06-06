package com.Nhom13.Lab8.servive;

import com.Nhom13.Lab8.entity.Product;
import com.Nhom13.Lab8.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> GetAll() {
        return productRepository.findAll();
    }
    public Product getProductByID (Integer id){
        Optional<Product> optional=productRepository.findById(id);
        return optional.orElse(null);
    }
    public void add(Product product){
        productRepository.save(product);
    }
    public void update(Product product){
        productRepository.save(product);
    }
    public void delete(Integer id){
        productRepository.deleteById(id);
    }
}