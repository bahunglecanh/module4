package hunglcb.example.store.service;

import hunglcb.example.store.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(int id);
}
