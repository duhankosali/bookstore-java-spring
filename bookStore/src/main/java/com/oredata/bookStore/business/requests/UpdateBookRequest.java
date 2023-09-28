package com.oredata.bookStore.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBookRequest {
	private String title;
	private String author;
	private Double price;
	private Integer stockQuantity;
	// updatedAt auto
}
