package com.filo.restdocs.web.mappers;

import com.filo.restdocs.domain.Beer;
import com.filo.restdocs.web.model.BeerDto;
import org.mapstruct.Mapper;
/**
 * Created by T. Filo Zegarlicki on 06.05.2022
 **/

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}