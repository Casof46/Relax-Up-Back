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
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "idUsuario")
    private List<Usuario> usuario;
    public UsuarioRutina(){}
    public UsuarioRutina(int idusuariorutina,LocalDate fecharealizacion, int progreso, List<Usuario> usuario) {
        this.idusuariorutina = idusuariorutina;
        this.fecharealizacion = fecharealizacion;
        this.progreso = progreso;
        this.usuario = usuario;
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

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }
}
