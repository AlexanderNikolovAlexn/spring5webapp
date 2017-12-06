package com.samodeika.repositories;

import com.samodeika.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Alexander Nikolov on 5.12.2017 г..
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
