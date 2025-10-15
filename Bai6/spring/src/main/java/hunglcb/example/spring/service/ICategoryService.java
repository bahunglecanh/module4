package hunglcb.example.spring.service;

import hunglcb.example.spring.entity.Category;

import java.util.List;

public interface ICategoryService {
    List<Category>findAll();
    Category findById(int id);
}
