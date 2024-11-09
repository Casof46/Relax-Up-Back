package pe.edu.upc.demorelaxup.dtos;

public class CantidadRutinasByUsuarioDTO {
    public int idrutina;
    public String nombre_usuario;
    public int cantidad_rutinas;

    public int getIdrutina() {
        return idrutina;
    }

    public void setIdrutina(int idrutina) {
        this.idrutina = idrutina;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getCantidad_rutinas() {
        return cantidad_rutinas;
    }

    public void setCantidad_rutinas(int cantidad_rutinas) {
        this.cantidad_rutinas = cantidad_rutinas;
    }
}
