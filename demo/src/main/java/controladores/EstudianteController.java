package controladores;

import controladores.EstudianteDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/estudiantes")
public class EstudianteController {

    private final EstudianteService estudianteService;

    @Autowired
    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    
    @PostMapping
    public ResponseEntity<?> crearEstudiante(@Valid @RequestBody EstudianteDTO estudianteDTO) {
        try {
            Map<String, Object> resultado = estudianteService.crearEstudiante(estudianteDTO);
            String mensaje = (String) resultado.get("resultado");

            if (mensaje.startsWith("Error")) {
                // Manejo de errores de negocio (identificación/correo duplicado)
                return new ResponseEntity<>(resultado, HttpStatus.CONFLICT); // 409 Conflict
            }
            // Éxito: retorna 201 Created y el ID del nuevo estudiante
            return new ResponseEntity<>(resultado, HttpStatus.CREATED);

        } catch (Exception e) {
            // Manejo de errores internos del servidor
            return new ResponseEntity<>("Error interno al crear el estudiante", HttpStatus.INTERNAL_SERVER_ERROR); // 500
        }
    }

    
    @PutMapping("/{id}")
    public ResponseEntity<String> actualizarEstudiante(@PathVariable Long id, @Valid @RequestBody EstudianteDTO estudianteDTO) {
        // Se asegura que el ID en la ruta coincida con el ID en el cuerpo
        estudianteDTO.setEstudianteId(id);

        try {
            String resultado = estudianteService.actualizarEstudiante(estudianteDTO);

            if (resultado.startsWith("Error: El estudiante no existe")) {
                return new ResponseEntity<>(resultado, HttpStatus.NOT_FOUND); // 404 Not Found
            }
            if (resultado.startsWith("Error")) {
                return new ResponseEntity<>(resultado, HttpStatus.BAD_REQUEST); // 400 Bad Request o 500 Internal Server Error
            }

            return ResponseEntity.ok(resultado); // 200 OK

        } catch (Exception e) {
            return new ResponseEntity<>("Error interno al actualizar el estudiante", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
    @GetMapping("/buscar-por-nombre")
    public ResponseEntity<List<EstudianteDTO>> buscarEstudiantesPorNombre(@RequestParam String nombre) {
        try {
            List<EstudianteDTO> estudiantes = estudianteService.buscarEstudiantesPorNombre(nombre);
            if (estudiantes.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT); 
            }
            return ResponseEntity.ok(estudiantes); 

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
        }
    }

    
     
    @GetMapping("/identificacion/{identificacion}")
    public ResponseEntity<EstudianteDTO> buscarEstudiantePorIdentificacion(@PathVariable String identificacion) {
        try {
            EstudianteDTO estudiante = estudianteService.buscarEstudiantePorIdentificacion(identificacion);
            if (estudiante == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404 Not Found
            }
            return ResponseEntity.ok(estudiante); // 200 OK

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // 500
        }
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarEstudiante(@PathVariable Long id) {
        try {
            String resultado = estudianteService.eliminarEstudiante(id);

            if (resultado.startsWith("Error: El estudiante no existe")) {
                return new ResponseEntity<>(resultado, HttpStatus.NOT_FOUND); // 404 Not Found
            }
            if (resultado.startsWith("Error")) {
                // Posiblemente error por registros relacionados (Foreign Key)
                return new ResponseEntity<>(resultado, HttpStatus.BAD_REQUEST); // 400 Bad Request
            }

            return ResponseEntity.ok(resultado); // 200 OK

        } catch (Exception e) {
            return new ResponseEntity<>("Error interno al eliminar el estudiante", HttpStatus.INTERNAL_SERVER_ERROR); // 500
        }
    }
}