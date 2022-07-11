/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.ayllusinchi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import upeu.ayllusinchi.entity.Usuario;

/**
 *
 * @author ethamzamora
 */

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    
}
