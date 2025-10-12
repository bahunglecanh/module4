package hunglcb.example.aop.repository;

import hunglcb.example.aop.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByTitle(String title);
}


