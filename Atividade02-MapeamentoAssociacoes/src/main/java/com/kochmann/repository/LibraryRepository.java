package com.kochmann.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kochmann.domain.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library,Integer> {

}
