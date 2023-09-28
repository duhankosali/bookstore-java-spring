package com.oredata.bookStore.business.abstracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.oredata.bookStore.business.requests.CreateBookRequest;
import com.oredata.bookStore.business.requests.UpdateBookRequest;
import com.oredata.bookStore.business.responses.GetAllBooksResponse;
import com.oredata.bookStore.business.responses.GetByIdBookResponse;

public interface BookService {
	List<GetAllBooksResponse> getAll(); // response method
	List<GetAllBooksResponse> getAllPagination(int pageNumber);
	GetByIdBookResponse getById(String isbn);
	
	ResponseEntity<String> add(CreateBookRequest createBookRequest);
	ResponseEntity<String> update(UpdateBookRequest updateBookRequest, String isbn);
	ResponseEntity<String> delete(String isbn);
}
