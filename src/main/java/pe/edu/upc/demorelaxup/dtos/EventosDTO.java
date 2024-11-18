package pe.edu.upc.demorelaxup.dtos;

import pe.edu.upc.demorelaxup.entities.Usuario;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class EventosDTO {
    private int ideventos;
    private String titulo;
    private String actividad;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalTime hora;
    private Boolean confirmacion;
    private Usuario usuario;

    public int getIdeventos() {
        return ideventos;
    }

    public void setIdeventos(int ideventos) {
        this.ideventos = ideventos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
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

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Boolean getConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(Boolean confirmacion) {
        this.confirmacion = confirmacion;
    }
}
