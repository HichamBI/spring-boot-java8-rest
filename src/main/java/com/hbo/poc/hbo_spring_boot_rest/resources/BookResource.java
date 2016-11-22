package com.hbo.poc.hbo_spring_boot_rest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hbo.poc.hbo_spring_boot_rest.model.Book;
import com.hbo.poc.hbo_spring_boot_rest.service.BookService;

@RestController
@RequestMapping("book")
public class BookResource {

    @Autowired
    private BookService bookService;

    @RequestMapping("/all")
    public List<Book> getAllBooks() {
        return bookService.getBookList();
    }
}
