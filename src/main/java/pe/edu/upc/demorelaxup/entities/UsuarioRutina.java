package pe.edu.upc.demorelaxup.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="UsuarioRutina")
public class UsuarioRutina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idusuariorutina;
    @Column(name = "fecharealizacion",nullable = false,length = 10)
    private LocalDate fecharealizacion;
    @Column(name = "progreso",nullable = false,length = 3)
    private int progreso;
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario us;
    public UsuarioRutina(){}
    public UsuarioRutina(int idusuariorutina,LocalDate fecharealizacion, int progreso, Usuario us) {
        this.idusuariorutina = idusuariorutina;
        this.fecharealizacion = fecharealizacion;
        this.progreso = progreso;
        this.us = us;
    }

    public int getIdusuariorutina() {
        return idusuariorutina;
    }

    public void setIdusuariorutina(int idusuariorutina) {
        this.idusuariorutina = idusuariorutina;
    }

    public LocalDate getFecharealizacion() {
        return fecharealizacion;
    }

    public void setFecharealizacion(LocalDate fecharealizacion) {
        this.fecharealizacion = fecharealizacion;
    }

    public int getProgreso() {
        return progreso;
    }

    public void setProgreso(int progreso) {
        this.progreso = progreso;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }
}
