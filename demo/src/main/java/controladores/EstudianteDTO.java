package controladores;



import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class EstudianteDTO {

    
    private Long estudianteId;

    @NotBlank(message = "La identificación es obligatoria")
    @Size(max = 20, message = "La identificación no puede exceder los 20 caracteres")
    private String identificacion;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 255, message = "El nombre no puede exceder los 255 caracteres")
    private String nombre;

    @NotBlank(message = "El correo institucional es obligatorio")
    @Email(message = "El formato del correo institucional no es válido")
    @Size(max = 255, message = "El correo institucional no puede exceder los 255 caracteres")
    private String correoInstitucional;

    @Email(message = "El formato del correo personal no es válido")
    @Size(max = 255, message = "El correo personal no puede exceder los 255 caracteres")
    private String correoPersonal;

    @Size(max = 20, message = "El teléfono no puede exceder los 20 caracteres")
    private String telefono;

    @NotNull(message = "El campo 'es vocero' es obligatorio")
    private Boolean esVocero; // Corresponde a TINYINT(1)

    @NotBlank(message = "El tipo de documento es obligatorio")
    @Size(max = 20, message = "El tipo de documento no puede exceder los 20 caracteres")
    private String tipoDocumento;

    @NotBlank(message = "El género es obligatorio")
    @Size(max = 20, message = "El género no puede exceder los 20 caracteres")
    private String genero;

    private String comentarios; 

    // ************************
    // Getters y Setters
    // ************************

    public Long getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Long estudianteId) {
        this.estudianteId = estudianteId;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Boolean getEsVocero() {
        return esVocero;
    }

    public void setEsVocero(Boolean esVocero) {
        this.esVocero = esVocero;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}