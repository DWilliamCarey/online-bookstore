package com.obs.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obs.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
