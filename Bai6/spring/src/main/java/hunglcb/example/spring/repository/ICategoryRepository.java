package hunglcb.example.spring.repository;

import hunglcb.example.spring.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {

}
