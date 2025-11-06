package academico.demo.vistas;



import java.sql.Date;

public class vista_asistencias_detalladas {
    private int asistenciaId;
    private int estudianteId;
    private String estudianteIdentificacion;
    private String estudianteNombre;
    private int cursoId;
    private String nombreCurso;
    private String nombreDocente;
    private String nombrePeriodo;
    private Date fechaClase; // java.sql.Date
    private Integer numeroClase;
    private String temaClase;
    private String estadoAsistencia; // 'presente', 'ausente', 'tardanza'
    private String estadoTexto;    // Campo calculado
    private String novedades;

    // Constructor (Omitido por brevedad)
    // Getters y Setters (Omitidos por brevedad)
}