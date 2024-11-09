package pe.edu.upc.demorelaxup.dtos;

public class CantidadConfirmaronDTO {
    public int ideventoC;
    public String titulo;
    public int cantidad_confirmado;

    public int getIdeventoC() {
        return ideventoC;
    }

    public void setIdeventoC(int ideventoC) {
        this.ideventoC = ideventoC;
    }

    public int getCantidad_confirmado() {
        return cantidad_confirmado;
    }

    public void setCantidad_confirmado(int cantidad_confirmado) {
        this.cantidad_confirmado = cantidad_confirmado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
