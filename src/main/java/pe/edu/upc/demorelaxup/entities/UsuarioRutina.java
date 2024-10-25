package pe.edu.upc.demorelaxup.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

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
    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idRutina")
    private Rutina rutina;
    public UsuarioRutina(){}
    public UsuarioRutina(int idusuariorutina,LocalDate fecharealizacion, int progreso, Usuario usuario,Rutina rutina) {
        this.idusuariorutina = idusuariorutina;
        this.fecharealizacion = fecharealizacion;
        this.progreso = progreso;
        this.usuario = usuario;
        this.rutina = rutina;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }
}