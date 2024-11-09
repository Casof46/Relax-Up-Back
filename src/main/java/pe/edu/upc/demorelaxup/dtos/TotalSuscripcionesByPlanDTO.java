package pe.edu.upc.demorelaxup.dtos;

public class TotalSuscripcionesByPlanDTO {
    public int id_plan;
    public String nombre_plan;
    public int total_suscripciones;

    public int getId_plan() {
        return id_plan;
    }

    public void setId_plan(int id_plan) {
        this.id_plan = id_plan;
    }

    public String getNombre_plan() {
        return nombre_plan;
    }

    public void setNombre_plan(String nombre_plan) {
        this.nombre_plan = nombre_plan;
    }

    public int getTotal_suscripciones() {
        return total_suscripciones;
    }

    public void setTotal_suscripciones(int total_suscripciones) {
        this.total_suscripciones = total_suscripciones;
    }
}
