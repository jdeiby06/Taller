package academico.demo.vistas;

import java.sql.Date; // Alternativa para LocalDate

public class vista_cursos_completa {
    private int cursoId;
    private String nombreCurso;
    private String descripcionCurso;
    private Integer docenteId;
    private String nombreDocente;
    private String correoDocente;
    private String tituloEstudios;
    private Integer periodoAcademicoId;
    private String nombrePeriodo;
    private Date periodoInicio; // java.sql.Date
    private Date periodoFin;    // java.sql.Date
    private Long totalClases;      // COUNT(*) se mapea mejor a Long
    private Long totalCortes;      // COUNT(*) se mapea mejor a Long

    // Constructor con todos los argumentos (Asumiendo que el DAO llenaría esto)
    public vista_cursos_completa(int cursoId, String nombreCurso, String descripcionCurso, Integer docenteId, String nombreDocente, String correoDocente, String tituloEstudios, Integer periodoAcademicoId, String nombrePeriodo, Date periodoInicio, Date periodoFin, Long totalClases, Long totalCortes) {
        this.cursoId = cursoId;
        this.nombreCurso = nombreCurso;
        this.descripcionCurso = descripcionCurso;
        this.docenteId = docenteId;
        this.nombreDocente = nombreDocente;
        this.correoDocente = correoDocente;
        this.tituloEstudios = tituloEstudios;
        this.periodoAcademicoId = periodoAcademicoId;
        this.nombrePeriodo = nombrePeriodo;
        this.periodoInicio = periodoInicio;
        this.periodoFin = periodoFin;
        this.totalClases = totalClases;
        this.totalCortes = totalCortes;
    }
    
    // Getters y Setters (Omitidos por brevedad, pero necesarios)
    // ...
    
    // Método de presentación de Vista (Simulando la salida a consola)
    public void mostrarDetalle() {
        System.out.println("--- CURSO DETALLADO ---");
        System.out.println("ID: " + cursoId + " - " + nombreCurso);
        System.out.println("Docente: " + (nombreDocente != null ? nombreDocente : "No Asignado"));
        System.out.println("Período: " + nombrePeriodo + " (" + periodoInicio + " a " + periodoFin + ")");
        System.out.println("Clases programadas: " + totalClases + " | Cortes de Evaluación: " + totalCortes);
        System.out.println("-----------------------");
    }
}