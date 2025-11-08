package controladores; // Asegúrate de usar el paquete correcto

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST sencillo para verificar que el mapeo funciona.
 */
@RestController // 1. Indica que esta clase manejará peticiones REST
public class HelloWorldController {

    @GetMapping("/") // 2. Mapea la petición HTTP GET a la ruta raíz (/)
    public String decirHola() {
        // 3. Este será el cuerpo de la respuesta HTTP
        return "¡Hola Mundo! El backend de Spring Boot está funcionando correctamente.";
    }
    
    @GetMapping("/saludo") // Opcional: crea otro endpoint de prueba
    public String saludarOtro() {
        return "¡Ruta /saludo mapeada exitosamente!";
    }
}