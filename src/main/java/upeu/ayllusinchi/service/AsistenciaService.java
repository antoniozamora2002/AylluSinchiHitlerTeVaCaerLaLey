/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.ayllusinchi.service;

import java.util.List;
import upeu.ayllusinchi.entity.Asistencia;

/**
 *
 * @author ethamzamora
 */
public interface AsistenciaService {
    
    public List<Asistencia> findAll();

    public Asistencia findById(Long id);

    public Asistencia save(Asistencia asistencia);

    public void delete(Asistencia asistencia);

    public void deleteById(Long id);
    
}
