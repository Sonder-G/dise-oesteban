package co.edu.eam.disenosoftware.biblioteca.repositories;

import co.edu.eam.disenosoftware.biblioteca.model.entities.Book;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Component
public class BookRepository {

  @PersistenceContext
  private EntityManager em;

  /**
   * Consulta 1: libros por una editorial
   *
   * @param codePublisher
   * @return
   */
  public List<Book> getBooksByEditorialId(Long codePublisher) {
    String queryStr = "SELECT bk FROM Book bk WHERE bk.publisher.id = :id";
    Query query = em.createQuery(queryStr);
    query.setParameter("id", codePublisher);
    return query.getResultList();


  }

  /**
   * Consulta 3: Libros de un autor
   *
   * @param authId
   * @return
   */
  public List<Book> getBooksByAuthorId(Long authId) {
    String queryStr = "SELECT ba FROM BookAuthor ba WHERE ba.book.id = :id";
    Query query = em.createQuery(queryStr);
    query.setParameter("id", authId);
    return query.getResultList();


  }

}
