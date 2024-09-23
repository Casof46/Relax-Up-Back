package pe.edu.upc.demorelaxup.dtos;

public class CantidadRutinasByUsuarioDTO {
    public String nombreUser;
    public int QuantityRutinas;

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public int getQuantityRutinas() {
        return QuantityRutinas;
    }

    public void setQuantityRutinas(int quantityRutinas) {
        QuantityRutinas = quantityRutinas;
    }
}
