package co.edu.eam.disenosoftware.biblioteca.model.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "libro")
public class Book implements Serializable {

  /**
   * codigo libro
   */
  @Id
  @Column(name="codigo_libro")
  private String code;

  /**
   * nombre libro
   */
  @Id
  @Column(name="nombre_libro")
  private String name;

  /**
   * isbn libro
   */
  @Id
  @Column(name="isbn_libro")
  private String isbn;

  /**
   * ideditorial - Foreign key
   */
  @OneToMany
  @JoinColumn(name="id_editorial" , referencedColumnName = "id", nullable = false)
  private Publisher publisher;

}
