package com.hbo.poc.hbo_spring_boot_rest.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "BOOK")
public class Book {

    @Id
    @Column(name= "ISBN")
    private Integer iSBN;
    
    @Column(name= "ORIGINAL_TITLE")
    private String originalTitle;
    
    @Column(name= "AUTHOR")
    private String author;
    
    @Column(name= "PUBLICATION_DATE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate publicationDate;

    public Book() {
    }
    
    public Book(Integer iSBN, String originalTitle, String author, LocalDate publicationDate) {
        this.iSBN = iSBN;
        this.originalTitle = originalTitle;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public Integer getiSBN() {
        return iSBN;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }
}
