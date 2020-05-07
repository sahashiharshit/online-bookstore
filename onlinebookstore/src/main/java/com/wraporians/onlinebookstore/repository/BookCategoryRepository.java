package com.wraporians.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wraporians.onlinebookstore.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
