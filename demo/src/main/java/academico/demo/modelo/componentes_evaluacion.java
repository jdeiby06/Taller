package academico.demo.modelo;



import java.math.BigDecimal;

public class componentes_evaluacion {
    private int componenteEvaluacionId; // componente_evaluacion_id
    private Integer corteEvaluacionId;  // corte_evaluacion_id (puede ser NULL)
    private String nombreComponente;    // nombre_componente
    private BigDecimal porcentaje;      // porcentaje (DECIMAL)

    // Constructor con todos los argumentos
    public componentes_evaluacion(int componenteEvaluacionId, Integer corteEvaluacionId, String nombreComponente, BigDecimal porcentaje) {
        this.componenteEvaluacionId = componenteEvaluacionId;
        this.corteEvaluacionId = corteEvaluacionId;
        this.nombreComponente = nombreComponente;
        this.porcentaje = porcentaje;
    }
    
    // Getters y Setters
    
    public int getcomponenteEvaluacionId() {
        return componenteEvaluacionId;
    }
    public void setcomponenteEvaluacionId(int componenteEvaluacionId) {
        this.componenteEvaluacionId = componenteEvaluacionId;
    }
    public Integer getCorteEvaluacionId() {
        return corteEvaluacionId;
    }
    public void setCorteEvaluacionId(Integer corteEvaluacionId) {
        this.corteEvaluacionId = corteEvaluacionId;
    }
    public String getNombreComponente() {
        return nombreComponente;
    }
    public void setNombreComponente(String nombreComponente) {
        this.nombreComponente = nombreComponente;
    }
    public BigDecimal getPorcentaje() {
        return porcentaje;
    }
    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }
}