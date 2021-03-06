package co.edu.eam.disenosoftware.biblioteca.model.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "editorial")
public class Publisher implements Serializable {

  /**
   * codigo editorial
   */
  @Id
  @Column(name="codigo_editorial")
  private Long code;

  /**
   * nombre editorial
   */
  @Id
  @Column(name="nombre_editorial")
  private String name;

  public Publisher() {

  }
}
