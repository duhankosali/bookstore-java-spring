package com.oredata.bookStore.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oredata.bookStore.entities.concretes.Book;


public interface BookRepository extends JpaRepository<Book, String>{
	
}
