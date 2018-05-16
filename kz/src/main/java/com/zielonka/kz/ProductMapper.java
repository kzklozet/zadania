package com.zielonka.kz;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper

public abstract class ProductMapper {
	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

	@Mapping(target = "bok", source = "kupka")
	abstract ProductDts mapDtsToStateBean(ProductStateBean statebean);
}
