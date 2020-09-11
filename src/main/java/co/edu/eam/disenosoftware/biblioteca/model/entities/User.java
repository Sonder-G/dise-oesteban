package co.edu.eam.disenosoftware.biblioteca.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "usuario")
public class User implements Serializable {

  /**
   * usuario identificacion
   */
  @Id
  @Column(name="user_identification")
  private String identification;

  /**
   * nombre usuario
   */
  @Id
  @Column(name="nombre_usuario")
  private String name;

  /**
   * apellido usuario
   */
  @Id
  @Column(name="apellido_usuario")
  private String lastName;

}
