package com.filo.restdocs.repositories;

import com.filo.restdocs.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by T. Filo Zegarlicki on 06.05.2022
 **/
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}