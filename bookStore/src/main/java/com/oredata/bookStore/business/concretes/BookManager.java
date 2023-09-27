package com.oredata.bookStore.business.concretes;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.oredata.bookStore.dataAccess.abstracts.BookRepository;
import com.oredata.bookStore.business.abstracts.BookService;
import com.oredata.bookStore.business.requests.CreateBookRequest;
import com.oredata.bookStore.business.requests.UpdateBookRequest;
import com.oredata.bookStore.business.responses.GetAllBooksResponse;
import com.oredata.bookStore.business.responses.GetByIdBookResponse;
import com.oredata.bookStore.common.utilities.mappers.ModelMapperService;
import com.oredata.bookStore.entities.concretes.Book;

import lombok.AllArgsConstructor;

@Service // Business
@AllArgsConstructor
public class BookManager implements BookService{
	private BookRepository bookRepository;
	private ModelMapperService modelMapperService;
	
	@Override
	public List<GetAllBooksResponse> getAll() {	
		List<Book> books = bookRepository.findAll();	
		List<GetAllBooksResponse> booksResponse = books.stream()
			    .map(book -> this.modelMapperService.forResponse()
			            .map(book, GetAllBooksResponse.class))
			    .collect(Collectors.toList());
		return booksResponse;	
	}

	@Override
	public void add(CreateBookRequest createBookRequest) {
		// mapping
		Book book = this.modelMapperService.forRequest().map(createBookRequest, Book.class);
		
		this.bookRepository.save(book);
	}

	@Override
	public GetByIdBookResponse getById(String isbn) {
		Book book = this.bookRepository.findById(isbn).orElseThrow();
		// mapping
		GetByIdBookResponse response = this.modelMapperService.forResponse().map(book, GetByIdBookResponse.class);
		return response;
	}

	@Override		
	public void update(UpdateBookRequest updateBookRequest) {
		// mapping
		Book book = this.modelMapperService.forRequest().map(updateBookRequest, Book.class);
		this.bookRepository.save(book);
	}

	@Override
	public void delete(String isbn) {
		this.bookRepository.deleteById(isbn);
	}
}
