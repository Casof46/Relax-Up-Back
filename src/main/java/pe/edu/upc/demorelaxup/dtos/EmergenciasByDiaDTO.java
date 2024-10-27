package pe.edu.upc.demorelaxup.dtos;

import java.time.LocalDate;

public class EmergenciasByDiaDTO {
    private LocalDate fecha;
    private int totalEmergencias;

    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public int getTotalEmergencias() {
        return totalEmergencias;
    }
    public void setTotalEmergencias(int totalEmergencias) {
        this.totalEmergencias = totalEmergencias;
    }
}
