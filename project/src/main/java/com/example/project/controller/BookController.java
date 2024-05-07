package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Book;
import com.example.project.repository.BookRepo;
@RestController
public class BookController {
    @Autowired
    BookRepo repo;
    @GetMapping("/book")
    public List<Book> getAllBooks()
    {
        List<Book> students =repo.findAll();
        return students;
    }
    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable int id)
    {
        Book student = repo.findById(id).get();
        return student;
    }
    @PostMapping("/book/add")
    public void createBook(@RequestBody Book student)
    {
        repo.save(student);
    }
    @PutMapping("/book/update/{id}")
    public void updateBook(@PathVariable int id)
    {
        Book student = repo.findById(id).get();
        student.setBook_Title(" Things Fall Apart by Chinua Achebe");
        student.setLanguage("English");
        student.setPublication_Year(1958);

        repo.save(student);
    }
    @DeleteMapping("/book/delete/{id}")
    public void deleteBook(@PathVariable int id)
    {
        Book student = repo.findById(id).get();
        repo.delete(student);
    }
}