package pe.edu.upc.demorelaxup.dtos;

import pe.edu.upc.demorelaxup.entities.Rutina;

public class EjercicioRutinaDTO {
    private int idEjercicioRutina;
    private String tituloEjercicioRutina;
    private String descripcionEjercicioRutina;
    private Rutina rutina;

    public int getIdEjercicioRutina() {
        return idEjercicioRutina;
    }

    public void setIdEjercicioRutina(int idEjercicioRutina) {
        this.idEjercicioRutina = idEjercicioRutina;
    }

    public String getTituloEjercicioRutina() {
        return tituloEjercicioRutina;
    }

    public void setTituloEjercicioRutina(String tituloEjercicioRutina) {
        this.tituloEjercicioRutina = tituloEjercicioRutina;
    }

    public String getDescripcionEjercicioRutina() {
        return descripcionEjercicioRutina;
    }

    public void setDescripcionEjercicioRutina(String descripcionEjercicioRutina) {
        this.descripcionEjercicioRutina = descripcionEjercicioRutina;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }
}