package academico.demo.modelo;

import java.time.LocalDate;


public class Calificaciones {
    private int claseId;             // clase_id
    private Integer cursoId;         // curso_id (puede ser NULL)
    private Integer numeroClase;     // numero_clase (puede ser NULL)
    private LocalDate fechaClase;    // fecha_clase (DATE)
    private String temaClase;        // tema_clase
    private String descripcionClase;  // descripcion_clase (TEXT)
    private String comentariosClase;  // comentarios_clase (TEXT)

    // Constructor con todos los argumentos
    public Calificaciones(int claseId, Integer cursoId, Integer numeroClase, LocalDate fechaClase, String temaClase, String descripcionClase, String comentariosClase) {
        this.claseId = claseId;
        this.cursoId = cursoId;
        this.numeroClase = numeroClase;
        this.fechaClase = fechaClase;
        this.temaClase = temaClase;
        this.descripcionClase = descripcionClase;
        this.comentariosClase = comentariosClase;
    }

    // Getters y Setters
    
    public int getClaseId() {
        return claseId;
    }

    public void setClaseId(int claseId) {
        this.claseId = claseId;
    }

    public Integer getCursoId() {
        return cursoId;
    }

    public void setCursoId(Integer cursoId) {
        this.cursoId = cursoId;
    }

    public Integer getNumeroClase() {
        return numeroClase;
    }

    public void setNumeroClase(Integer numeroClase) {
        this.numeroClase = numeroClase;
    }

    public LocalDate getFechaClase() {
        return fechaClase;
    }

    public void setFechaClase(LocalDate fechaClase) {
        this.fechaClase = fechaClase;
    }

    public String getTemaClase() {
        return temaClase;
    }

    public void setTemaClase(String temaClase) {
        this.temaClase = temaClase;
    }

    public String getDescripcionClase() {
        return descripcionClase;
    }

    public void setDescripcionClase(String descripcionClase) {
        this.descripcionClase = descripcionClase;
    }

    public String getComentariosClase() {
        return comentariosClase;
    }

    public void setComentariosClase(String comentariosClase) {
        this.comentariosClase = comentariosClase;
    }
}

