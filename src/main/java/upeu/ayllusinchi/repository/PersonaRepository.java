/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.ayllusinchi.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import upeu.ayllusinchi.entity.Persona;

/**
 *
 * @author ethamzamora
 */
/* La anotación @Repository es una especialización de la anotación
    @Component que se utiliza para indicar que la clase proporciona
    el mecanismo para la operación de almacenamiento, recuperación,
    actualización, eliminación y búsqueda en objetos.*/
@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {
    

    Persona findByPersDni(String persDni);
    
}
