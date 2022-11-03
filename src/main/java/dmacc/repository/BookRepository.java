/**
 * @author gabel - glanphier
 * CIS175 - Fall 2022
 * Nov 3, 2022
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Book;

/**
 * @author gabel
 *
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
