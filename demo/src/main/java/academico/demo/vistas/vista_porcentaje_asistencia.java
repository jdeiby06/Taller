package academico.demo.vistas;



public class vista_porcentaje_asistencia {
    private int estudianteId;
    private String identificacion;
    private String estudiante;
    private int cursoId;
    private String nombreCurso;
    private Long totalClases;      // COUNT(*)
    private Long clasesPresentes;  // SUM(CASE...)
    private Long tardanzas;        // SUM(CASE...)
    private Long ausencias;        // SUM(CASE...)
    private double porcentajeAsistencia; // Campo calculado (double)
    private String cumpleAsistenciaMinima; // Campo calculado

    // Constructor (Omitido por brevedad)
    // Getters y Setters (Omitidos por brevedad)
}