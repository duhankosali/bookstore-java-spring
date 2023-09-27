package com.oredata.bookStore.business.responses;

import com.oredata.bookStore.entities.concretes.Book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByOrderIdOrderDetailsResponse {
	private Book book;
	private Integer quantity;
}
