package repositorios;

import java.util.List;

import academico.demo.modelo.Estudiantes; // Importa tu clase de modelo (en plural)

import org.springframework.stereotype.Repository;
/**
 * Interfaz que extiende JpaRepository para manejar las operaciones CRUD 
 * sobre la entidad Estudiantes.
 * T: Estudiantes (La clase de la entidad)
 * ID: Integer (El tipo de dato de la clave primaria estudiante_id)
 */

 
@Repository
public interface EstudianteRepository extends JpaRepository<Estudiantes, Integer> {

    public Estudiantes save(Estudiantes estudiante);
    
    // Spring Data JPA provee automáticamente todos los métodos CRUD básicos:
    // .findAll(), .findById(), .save(), .delete(), etc.

    public Object findById(Integer id);

    public List<Estudiantes> findAll();
}