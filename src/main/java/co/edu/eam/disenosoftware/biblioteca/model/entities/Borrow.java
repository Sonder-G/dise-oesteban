package co.edu.eam.disenosoftware.biblioteca.model.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "prestamo")
public class Borrow implements Serializable {

  /**
   * Id prestamo
   */
  @Id
  @Column(name="id")
  private Long id;

  /**
   * fecha prestamo
   */
  @Id
  @Column(name="fecha_prestamo")
  private Date dateTime;

  /**
   * ID libro - Foreign key
   */
  @OneToMany
  @JoinColumn(name="id_libro", referencedColumnName = "id", nullable = false)
  private Book book;

  /**
   * ID usuario - Foreign key
   */
  @OneToMany
  @JoinColumn(name="id_usuario", referencedColumnName = "id" ,  nullable = false)
  private User user;

}
