package org.example;

import org.example.model.Book;
import org.example.repository.BookRepository;
import org.example.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {
    @Mock
    private BookRepository bookRepository;
    @InjectMocks
    private BookService bookService;
    private Book expectedBook;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        expectedBook = new Book(1L, "Mock Book", "Mock Author");
    }

    @Test
    void testFindBookById() {
        when(bookRepository.findById(expectedBook.getId())).thenReturn(Optional.of(expectedBook));

        assertEquals(Optional.of(expectedBook), bookService.findBookById(expectedBook.getId()));
        verify(bookRepository, times(1)).findById(expectedBook.getId());
    }

    @Test
    void testFindAllBooks() {
        List<Book> expectedBooks = Arrays.asList(
                new Book(1L, "Book 1", "Author 1"),
                new Book(2L, "Book 2", "Author 2")
        );
        when(bookRepository.findAll()).thenReturn(expectedBooks);

        assertEquals(expectedBooks, bookService.findAllBooks());
        verify(bookRepository, times(1)).findAll();
    }

    @Test
    void testAddBook() {
        bookService.addBook(expectedBook);

        verify(bookRepository, times(1)).save(expectedBook);
    }

    @Test
    void testDeleteBookById() {
        bookService.deleteBookById(expectedBook.getId());

        verify(bookRepository, times(1)).deleteById(expectedBook.getId());
    }
}




