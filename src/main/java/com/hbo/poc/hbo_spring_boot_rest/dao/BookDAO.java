package com.hbo.poc.hbo_spring_boot_rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.hbo.poc.hbo_spring_boot_rest.model.Book;

@Repository
public class BookDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Book> getBookList() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Book> bookQuery = criteriaBuilder.createQuery(Book.class);
        Root<Book> root = bookQuery.from(Book.class);
        bookQuery.select(root);

        return entityManager.createQuery(bookQuery).getResultList();
    }
}
