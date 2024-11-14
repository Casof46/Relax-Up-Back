package pe.edu.upc.demorelaxup.dtos;

public class CantidadTecnicasRelajacionByRutinaDTO {
    public String nombre_rutina;

    public int cantidad_tecnicas;

    public String getNombre_rutina() {
        return nombre_rutina;
    }

    public void setNombre_rutina(String nombre_rutina) {
        this.nombre_rutina = nombre_rutina;
    }

    public int getCantidad_tecnicas() {
        return cantidad_tecnicas;
    }

    public void setCantidad_tecnicas(int cantidad_tecnicas) {
        this.cantidad_tecnicas = cantidad_tecnicas;
    }
}
