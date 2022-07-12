/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.ayllusinchi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import upeu.ayllusinchi.entity.Asistencia;
import upeu.ayllusinchi.repository.AsistenciaRepository;
import upeu.ayllusinchi.service.AsistenciaService;

/**
 *
 * @author ethamzamora
 */
@Service
public class AsisnteciaServiceImpl implements AsistenciaService{

    @Autowired
    private AsistenciaRepository asisteciaRepository;
    
    @Transactional(readOnly = true)
    @Override
    public List<Asistencia> findAll() {
        return (List<Asistencia>) asisteciaRepository.findAll();
    }

    @Override
    public Asistencia findById(Long id) {
        return asisteciaRepository.findById(id).orElse(null);
    }

    @Override
    public Asistencia save(Asistencia asistencia) {
        return asisteciaRepository.save(asistencia);
    }

    @Override
    public void delete(Asistencia asistencia) {
        asisteciaRepository.delete(asistencia);
    }

    @Override
    public void deleteById(Long id) {
        asisteciaRepository.deleteById(id);
    }
    
}
