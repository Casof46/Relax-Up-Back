package pe.edu.upc.demorelaxup.dtos;

import pe.edu.upc.demorelaxup.entities.Usuario;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class EmergenciaDTO {
    private int idEmergencia;
    private LocalDate fechaEmergencia;
    private LocalTime horaEmergencia;
    private Usuario usuario;

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
