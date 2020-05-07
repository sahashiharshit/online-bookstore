package com.wraporians.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wraporians.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
