package academico.demo.modelo;



import java.math.BigDecimal;

public class cortes_evaluacion {
    private int corteEvaluacionId;    // corte_evaluacion_id
    private Integer cursoId;          // curso_id (puede ser NULL)
    private Integer periodoAcademicoId; // periodo_academico_id (puede ser NULL)
    private String nombreCorte;       // nombre_corte
    private BigDecimal porcentaje;    // porcentaje (DECIMAL)
    private String comentariosCorte;  // comentarios_corte (TEXT)

    // Constructor con todos los argumentos
    public cortes_evaluacion(int corteEvaluacionId, Integer cursoId, Integer periodoAcademicoId, String nombreCorte, BigDecimal porcentaje, String comentariosCorte) {
        this.corteEvaluacionId = corteEvaluacionId;
        this.cursoId = cursoId;
        this.periodoAcademicoId = periodoAcademicoId;
        this.nombreCorte = nombreCorte;
        this.porcentaje = porcentaje;
        this.comentariosCorte = comentariosCorte;
    }
    
    // Getters y Setters
    
    public int getcorteEvaluacionId() {
        return corteEvaluacionId;
    }
    public void setcorteEvaluacionId(int corteEvaluacionId) {
        this.corteEvaluacionId = corteEvaluacionId;
    }
    public Integer getCursoId() {
        return cursoId;
    }
    public void setCursoId(Integer cursoId) {
        this.cursoId = cursoId;
    }
    public Integer getPeriodoAcademicoId() {
        return periodoAcademicoId;
    }
    public void setPeriodoAcademicoId(Integer periodoAcademicoId) {
        this.periodoAcademicoId = periodoAcademicoId;
    }
    public String getNombreCorte() {
        return nombreCorte;
    }
    public void setNombreCorte(String nombreCorte) {
        this.nombreCorte = nombreCorte;
    }
    public BigDecimal getPorcentaje() {
        return porcentaje;
    }
    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }
    public String getComentariosCorte() {
        return comentariosCorte;
    }
    public void setComentariosCorte(String comentariosCorte) {
        this.comentariosCorte = comentariosCorte;
    }
}