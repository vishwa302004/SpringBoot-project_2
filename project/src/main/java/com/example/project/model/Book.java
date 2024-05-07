package com.example.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name  = "Library_")
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;
    @Column(name = "Book_Title")
    String Book_Title;
    @Column(name = "Publication_Year")
    int Publication_Year;
    @Column(name = "Language")
    String Language;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBook_Title() {
        return Book_Title;
    }
    public void setBook_Title(String book_Title) {
        Book_Title = book_Title;
    }
    public int getPublication_Year() {
        return Publication_Year;
    }
    public void setPublication_Year(int publication_Year) {
        Publication_Year = publication_Year;
    }
    public String getLanguage() {
        return Language;
    }
    public void setLanguage(String language) {
        Language = language;
    }
    public Book(int id, String book_Title, int publication_Year, String language) {
        this.id = id;
        Book_Title = book_Title;
        Publication_Year = publication_Year;
        Language = language;
    }
    public Book() {
    }


    
}
