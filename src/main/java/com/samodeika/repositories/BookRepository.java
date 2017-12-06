package com.samodeika.repositories;

import com.samodeika.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Alexander Nikolov on 5.12.2017 г..
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
