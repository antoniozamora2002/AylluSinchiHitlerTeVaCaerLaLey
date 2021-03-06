/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.ayllusinchi.service;

import java.util.List;
import upeu.ayllusinchi.entity.TipoPersona;

/**
 *
 * @author ethamzamora
 */
public interface TipoPersonaService {

    public List<TipoPersona> findAll();

    public TipoPersona findById(Long id);

    public TipoPersona save(TipoPersona tipoPersona);

    public void delete(TipoPersona tipoPersona);

    public void deleteById(Long id);
}
