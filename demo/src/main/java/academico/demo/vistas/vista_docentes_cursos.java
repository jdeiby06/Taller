package academico.demo.vistas;



import java.sql.Date;

public class vista_docentes_cursos {
    private int docenteId;
    private String nombreDocente;
    private String correo;
    private String tituloEstudios;
    private Integer cursoId;
    private String nombreCurso;
    private Integer periodoAcademicoId;
    private String nombrePeriodo;
    private Date fechaInicio; // java.sql.Date
    private Date fechaFin;   // java.sql.Date
    private Long totalEstudiantes; // Campo calculado (COUNT)

    // Constructor (Omitido por brevedad)
    // Getters y Setters (Omitidos por brevedad)
}