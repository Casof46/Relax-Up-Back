package pe.edu.upc.demorelaxup.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Emergencia")
public class Emergencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmergencia;
    @Column(name = "fechaEmergencia",nullable = false)
    private LocalDate fechaEmergencia;
    @Column(name = "horaEmergencia",nullable = false)
    private LocalTime horaEmergencia;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    public Emergencia() {
    }

    public Emergencia(int idEmergencia, LocalDate fechaEmergencia, LocalTime horaEmergencia, Usuario usuario) {
        this.idEmergencia = idEmergencia;
        this.fechaEmergencia = fechaEmergencia;
        this.horaEmergencia = horaEmergencia;
        this.usuario = usuario;
    }

    public int getIdEmergencia() {
        return idEmergencia;
    }

    public void setIdEmergencia(int idEmergencia) {
        this.idEmergencia = idEmergencia;
    }

    public LocalDate getFechaEmergencia() {
        return fechaEmergencia;
    }

    public void setFechaEmergencia(LocalDate fechaEmergencia) {
        this.fechaEmergencia = fechaEmergencia;
    }

    public LocalTime getHoraEmergencia() {
        return horaEmergencia;
    }

    public void setHoraEmergencia(LocalTime horaEmergencia) {
        this.horaEmergencia = horaEmergencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
