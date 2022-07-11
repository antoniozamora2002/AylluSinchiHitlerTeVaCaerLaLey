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
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author ethamzamora
 */

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
    
    @Id
    @Column(name= "user_id")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long userId;
      
    @Column(name="user_name")
    private String userName;
    
    @Column(name="user_clave")
    private String userClave;
    
}
