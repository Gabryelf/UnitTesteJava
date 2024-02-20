package org.example.repository;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

public interface BookRepository {
    Optional<org.example.model.Book> findById(Long id);
    List<org.example.model.Book> findAll();
    void save(Book book);
    void deleteById(Long id);


    void save(org.example.model.Book expectedBook);
}
