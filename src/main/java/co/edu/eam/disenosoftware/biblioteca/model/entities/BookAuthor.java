package co.edu.eam.disenosoftware.biblioteca.model.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "libro_autor")
public class BookAuthor implements Serializable {

  /**
   * Id autor_libro
   */
  @Id
  @Column(name="id")
  private Long id;

  /**
   * id autor - Foreign key
   */
  @ManyToOne
  @JoinColumn(name="id_autor" , referencedColumnName = "id" , nullable = false)
  private Author author;

  /**
   * id libro - Foreign key
   */
  @ManyToOne
  @JoinColumn(name="id_libro" , referencedColumnName = "id" , nullable = false)
  private Book book;
}
