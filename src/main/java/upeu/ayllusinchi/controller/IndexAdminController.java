/*
   En Spring Boot, la clase de controlador es responsable de procesar las solicitudes de API REST entrantes,
   preparar un modelo y devolver la vista para que se represente como respuesta. Las clases de controlador
   en Spring están anotadas por la anotación @Controller o @RestController
 */
package upeu.ayllusinchi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ethamzamora
 */
@Controller
public class IndexAdminController {

    /*Para el addAttribute: Su propósito es agregar valores en el Modelo que serán identificados globalmente.*/
    
    @GetMapping("/admin")
    public String indexAdmin(Model model) {
        model.addAttribute("titulo", "Bienvenido a Thymeleaf");
        return "indexAdmin";
    }

}
