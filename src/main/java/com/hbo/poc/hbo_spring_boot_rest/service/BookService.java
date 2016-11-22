package com.hbo.poc.hbo_spring_boot_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hbo.poc.hbo_spring_boot_rest.dao.BookDAO;
import com.hbo.poc.hbo_spring_boot_rest.model.Book;

@Service
public class BookService {

    @Autowired
    BookDAO bookDAO;

    @Transactional(readOnly = true)
    public List<Book> getBookList() {
        return bookDAO.getBookList();
    }
}
