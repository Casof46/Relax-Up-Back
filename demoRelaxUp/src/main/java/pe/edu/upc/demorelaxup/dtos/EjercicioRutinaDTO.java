package pe.edu.upc.demorelaxup.dtos;

import pe.edu.upc.demorelaxup.entities.Rutina;

public class EjercicioRutinaDTO {
    private int idEjercicioRutina;
    private String tituloEjercicioRutina;
    private String descripcionEjercicioRutina;
    private Rutina ru;

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

    public Rutina getRu() {
        return ru;
    }

    public void setRu(Rutina ru) {
        this.ru = ru;
    }
}