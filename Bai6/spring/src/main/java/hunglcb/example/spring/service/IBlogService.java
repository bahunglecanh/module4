package hunglcb.example.spring.service;

import hunglcb.example.spring.entity.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    Blog save(Blog blog);
    List<Blog> findAll();
    Blog findById(Long id);
    void deleteById(Long id);
}
