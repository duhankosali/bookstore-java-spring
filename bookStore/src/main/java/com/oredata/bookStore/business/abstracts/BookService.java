package com.oredata.bookStore.business.abstracts;

import java.util.List;

import com.oredata.bookStore.business.requests.CreateBookRequest;
import com.oredata.bookStore.business.requests.UpdateBookRequest;
import com.oredata.bookStore.business.responses.GetAllBooksResponse;
import com.oredata.bookStore.business.responses.GetByIdBookResponse;

public interface BookService {
	List<GetAllBooksResponse> getAll(); // response method
	GetByIdBookResponse getById(String isbn);
	
	void add(CreateBookRequest createBookRequest);
	void update(UpdateBookRequest updateBookRequest);
	void delete(String isbn);
}
