package com.kochmann.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.kochmann.domain.PostComment;

@Repository
public interface PostCommentRepository extends JpaRepository<PostComment, Long>{

}