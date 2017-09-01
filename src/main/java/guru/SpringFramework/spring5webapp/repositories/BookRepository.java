package guru.SpringFramework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import guru.SpringFramework.spring5webapp.model.Book;

/**
 * Created by jt on 5/16/17.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}