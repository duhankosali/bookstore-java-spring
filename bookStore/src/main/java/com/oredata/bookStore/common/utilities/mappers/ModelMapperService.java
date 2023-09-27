package com.oredata.bookStore.common.utilities.mappers;

import java.util.List;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
	ModelMapper forResponse();
	ModelMapper forRequest();
	<T, U> List<U> mapToList(List<T> source, Class<U> targetClass);
}
