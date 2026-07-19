package com.testing.testing.controller;

import com.testing.testing.entity.BookEntity;
import com.testing.testing.repository.BookRepository;
import com.testing.testing.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")// 🟢 1. Yeh batayega ki yeh ek REST Controller hai
@RequestMapping("/api/books")
public class BookController {

    //create book
    // 1. Controller ke andar hamesha BookService ka use karein
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // 🟢 1. CREATE BOOK
    @PostMapping
    public ResponseEntity<BookEntity> createBook(@RequestBody BookEntity bookEntity) {
        BookEntity savedBook = bookService.createBook(bookEntity);
        return ResponseEntity.ok(savedBook);
    }

    // 🔵 2. GET ALL BOOKS (Fixed List type and empty brackets)
    @GetMapping
    public ResponseEntity<List<BookEntity>> getAllBooks() {
        List<BookEntity> books = bookService.getAllBooks(); // Service se list li
        return ResponseEntity.ok(books); // Box mein pack karke bhej diya
    }

    // 🔴 3. DELETE BOOK (Fixed to use PathVariable ID and fixed void return)
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id); // Pehle service se delete karwaya
        return ResponseEntity.ok("Book deleted successfully with id: " + id); // Fir message bheja
    }

}
