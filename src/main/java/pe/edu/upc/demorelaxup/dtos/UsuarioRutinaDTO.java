package pe.edu.upc.demorelaxup.dtos;

import pe.edu.upc.demorelaxup.entities.Rutina;
import pe.edu.upc.demorelaxup.entities.Usuario;

import java.time.LocalDate;

public class UsuarioRutinaDTO {
    private int idusuariorutina;
    private LocalDate fecharealizacion;
    private int progreso;
    private Usuario usuario;
    private Rutina rutina;

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

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }
}