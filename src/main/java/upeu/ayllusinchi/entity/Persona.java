/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.ayllusinchi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author ethamzamora
 */
@Data   /* Está en la clase, proporcionando los métodos de obtención y configuración de todos los atributos de la clase*/
@Entity /*La anotación @Entity especifica que la clase es una entidad y está asignada a una tabla de base de datos.*/
@Table(name = "persona")  /*La anotación @Table especifica el nombre de la tabla de la base de datos que se usará para la asignación.*/
public class Persona implements Serializable {

    @Id
    @Column(name = "pers_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long persId;

    @Column(name = "pers_ap_paterno")
    private String persApPaterno;

    @Column(name = "pers_ap_materno")
    private String persApMaterno;

    @Column(name = "pers_nombres")
    private String persNombres;

    @Column(name = "pers_dni")
    private String persDni;

    @Column(name = "pers_telefono")
    private String persTelefono;
    
    @ManyToOne
    @JoinColumn(name = "tido_id")
    private TipoDocumento tipoDocumento;
    
    @ManyToOne
    @JoinColumn(name ="user_id")
    private Usuario usuario;
    
}
