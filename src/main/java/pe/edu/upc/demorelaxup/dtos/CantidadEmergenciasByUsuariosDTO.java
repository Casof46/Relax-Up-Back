package pe.edu.upc.demorelaxup.dtos;

public class CantidadEmergenciasByUsuariosDTO {
    public String nombreUser;
    public int QuantityEmergencias;

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public int getQuantityEmergencias() {
        return QuantityEmergencias;
    }

    public void setQuantityEmergencias(int quantityEmergencias) {
        QuantityEmergencias = quantityEmergencias;
    }
}