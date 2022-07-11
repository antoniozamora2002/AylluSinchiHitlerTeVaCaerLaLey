/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.ayllusinchi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import upeu.ayllusinchi.entity.Persona;
import upeu.ayllusinchi.entity.Usuario;
import upeu.ayllusinchi.repository.UsuarioRepository;
import upeu.ayllusinchi.service.UsuarioService;

/**
 *
 * @author ethamzamora
 */

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Transactional(readOnly = true)
    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public Usuario save(Usuario usuario) {
       return usuarioRepository.save(usuario);
    }

    @Override
    public void delete(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

    @Override
    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }


    
}
