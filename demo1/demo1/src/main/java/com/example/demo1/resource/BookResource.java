package com.example.demo1.resource;

import com.example.demo1.domain.Book;
import com.example.demo1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/book")
public class BookResource {

    @Autowired
    private BookService bookService;

    @GetMapping
    public Collection<Book> findAll(){
        return bookService.findAll();
    }

    @GetMapping("{id}")
   public Book findById(@PathVariable Long id){
        return bookService.findById(id);
   }

    @PostMapping
    public Book save(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping
    public Book update(@RequestBody Book book){
        return bookService.update(book);
    }

    @DeleteMapping("{id}")
    public Book deleteById(@PathVariable Long id){
        return bookService.deleteById(id);
    }

}
