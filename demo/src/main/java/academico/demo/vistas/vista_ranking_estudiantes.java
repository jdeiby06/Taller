package academico.demo.vistas;



public class vista_ranking_estudiantes {
    // Nota: El ranking SQL (ROW_NUMBER) puede no ser trivial de mapear a un campo fijo sin un DTO,
    // pero se incluye como un campo Long o Integer.
    private Long ranking; // O Integer, dependiendo de la implementación
    private int estudianteId;
    private String estudiante;
    private int cursoId;
    private String nombreCurso;
    private double notaFinal; // Campo calculado (double)
    private String estado;    // Campo calculado

    // Constructor (Omitido por brevedad)
    // Getters y Setters (Omitidos por brevedad)
}