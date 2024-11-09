package pe.edu.upc.demorelaxup.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="MensajesForos")
public class MensajesForos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMensajesForos;
    @Column(name = "contenido",nullable = false, length = 200)
    private String contenido;
    @Column(name = "fechaPublicacion",nullable = false)
    private LocalDate fechaPublicacion;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="idForos")
    private Foros foros;
    public MensajesForos (){

    }
    public MensajesForos(int idMensajesForos, String contenido, LocalDate fechaPublicacion, Usuario usuario, Foros foros) {
        this.idMensajesForos = idMensajesForos;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
        this.usuario = usuario;
        this.foros = foros;
    }
    public int getIdMensajesForos() {
        return idMensajesForos;
    }

    public void setIdMensajesForos(int idMensajesForos) {
        this.idMensajesForos = idMensajesForos;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Foros getForos() {
        return foros;
    }

    public void setForos(Foros foros) {
        this.foros = foros;
    }
}
