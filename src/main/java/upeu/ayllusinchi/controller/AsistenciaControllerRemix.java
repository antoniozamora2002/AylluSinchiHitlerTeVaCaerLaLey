/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.ayllusinchi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import upeu.ayllusinchi.entity.Asistencia;
import upeu.ayllusinchi.service.AsistenciaService;

/**
 *
 * @author ethamzamora
 */
@RestController
@RequestMapping("/asistencia")
public class AsistenciaControllerRemix {
    
    @Autowired
    private AsistenciaService asistenciaService;
    
    @GetMapping("/all")
    public List<Asistencia> findAll() {
        return asistenciaService.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Asistencia> findById(@PathVariable Long id) {
        Asistencia asistencia = asistenciaService.findById(id);
        return ResponseEntity.ok(asistencia);
    }
    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        asistenciaService.deleteById(id);
    }
    
    @PostMapping("/save")
    public Asistencia save(@RequestBody Asistencia asisntecia) {
        return asistenciaService.save(asisntecia);
    }
    
    @PutMapping("/update")
    public Asistencia update(@RequestBody Asistencia asisntecia) {
        //TipoDocumento aut = new TipoDocumento(tipoDocumento.getId(),tipoDocumento.getNombres(),tipoDocumento.getApellidos(), tipoDocumento.getEstado());        
        return asistenciaService.save(asisntecia);
    }
}
