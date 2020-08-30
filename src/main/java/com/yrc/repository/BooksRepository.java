package com.yrc.repository;
import org.springframework.data.repository.CrudRepository;

import com.yrc.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
