package com.kochmann.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kochmann.domain.Book;


@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
