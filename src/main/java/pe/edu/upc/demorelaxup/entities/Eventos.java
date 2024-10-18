package pe.edu.upc.demorelaxup.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Eventos")
public class Eventos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ideventos;
    @Column(name="titulo",nullable = false,length = 40)
    private String titulo;
    @Column(name="actividad",nullable = false,length = 60)
    private String actividad;
    @Column(name="fecha inicio",nullable = false)
    private LocalDate fechaInicio;
    @Column(name = "fecha fin",nullable = false)
    private LocalDate fechaFin;
    @Column(name = "hora",nullable = false)
    private LocalTime hora;
    @Column(name = "confirmacion",nullable = false)
    private boolean confirmacion;
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario us;
    public Eventos(){}
    public Eventos(int ideventos,String titulo, String actividad, LocalDate fechaInicio, LocalDate fechaFin, LocalTime hora,boolean confirmacion, Usuario us) {
        this.ideventos = ideventos;
        this.titulo = titulo;
        this.actividad = actividad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.hora = hora;
        this.confirmacion = confirmacion;
        this.us = us;
    }

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

    public boolean isConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(boolean confirmacion) {
        this.confirmacion = confirmacion;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }
}

