package hunglcb.example.aop.service;

import hunglcb.example.aop.entity.Book;

import java.util.List;

public interface LibraryService {
    List<Book> listBooks();
    Book getBook(Long id);
    String borrowBook(Long bookId);
    void returnBook(String code);
}

