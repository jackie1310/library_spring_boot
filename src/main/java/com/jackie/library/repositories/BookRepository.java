package com.jackie.library.repositories;

import com.jackie.library.domain.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, String>,
// Pagination
        PagingAndSortingRepository<BookEntity, String> {

}
