package pe.edu.upc.demorelaxup.dtos;

import pe.edu.upc.demorelaxup.entities.TecnicasRelajacion;
import pe.edu.upc.demorelaxup.entities.Usuario;

public class RutinaDTO {
    private int idRutina;
    private String nombreRutina;
    private String descripcionRutina;
    private int duracionRutina;
    private TecnicasRelajacion tecnicasRelajacion;

    public int getIdRutina() {
        return idRutina;
    }

    public void setIdRutina(int idRutina) {
        this.idRutina = idRutina;
    }

    public String getNombreRutina() {
        return nombreRutina;
    }

    public void setNombreRutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
    }

    public String getDescripcionRutina() {
        return descripcionRutina;
    }

    public void setDescripcionRutina(String descripcionRutina) {
        this.descripcionRutina = descripcionRutina;
    }

    public int getDuracionRutina() {
        return duracionRutina;
    }

    public void setDuracionRutina(int duracionRutina) {
        this.duracionRutina = duracionRutina;
    }

    public TecnicasRelajacion getTecnicasRelajacion() {
        return tecnicasRelajacion;
    }

    public void setTecnicasRelajacion(TecnicasRelajacion tecnicasRelajacion) {
        this.tecnicasRelajacion = tecnicasRelajacion;
    }
}
