/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.ayllusinchi.service;

import java.util.List;
import upeu.ayllusinchi.entity.Persona;
import upeu.ayllusinchi.entity.Usuario;

/**
 *
 * @author ethamzamora
 */
public interface UsuarioService {
    
    public List<Usuario> findAll();

    public Usuario findById(Long id);

    public Usuario save(Usuario usuario);

    public void delete(Usuario usuario);

    public void deleteById(Long id);
    
}
