package com.oredata.bookStore.business.requests;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest {

    private Long userId;  

    private List<BookOrder> books;  
}


