package academico.demo.modelo;


import java.time.LocalDate;

public class periodos_academicos {
    private int periodoAcademicoId; // periodo_academico_id
    private String nombrePeriodo;    // nombre_periodo
    private LocalDate fechaInicio;   // fecha_inicio (DATE)
    private LocalDate fechaFin;      // fecha_fin (DATE)

    // Constructor con todos los argumentos
    public periodos_academicos(int periodoAcademicoId, String nombrePeriodo, LocalDate fechaInicio, LocalDate fechaFin) {
        this.periodoAcademicoId = periodoAcademicoId;
        this.nombrePeriodo = nombrePeriodo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    // Getters y Setters
    
    public int getPeriodoAcaemicoId() {
        return periodoAcademicoId;
    }
    public void setPeriodoAcademicoId(int periodoAcademicoId) {
        this.periodoAcademicoId = periodoAcademicoId;
    }
    public String getNombrePeriodo() {
        return nombrePeriodo;
    }
    public void setNombrePeriodo(String nombrePeriodo) {
        this.nombrePeriodo = nombrePeriodo;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}