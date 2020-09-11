package co.edu.eam.disenosoftware.biblioteca.model.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "autor")
public class Author implements Serializable {

  /**
   * Id Author
   */
  @Id
  @Column(name="id")
  private Long id;

  /**
   * Lastname Author
   */
  @Column(name="apellido")
  private String lastName;

  /**
   * Name Author
   */
  @Column(name="nombre")
  private String name;

}
