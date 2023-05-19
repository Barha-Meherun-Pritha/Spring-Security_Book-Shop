package com.bjit.SpringProject.repository;

import com.bjit.SpringProject.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity,Long> {

    public BookEntity findByAuthor(String author);

}

