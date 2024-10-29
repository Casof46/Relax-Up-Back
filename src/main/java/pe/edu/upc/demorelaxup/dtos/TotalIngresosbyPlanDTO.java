package pe.edu.upc.demorelaxup.dtos;

public class TotalIngresosbyPlanDTO {
    public int id_plan;
    public String nombre_plan;
    public double total_ingresos;

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

    public double getTotal_ingresos() {
        return total_ingresos;
    }

    public void setTotal_ingresos(double total_ingresos) {
        this.total_ingresos = total_ingresos;
    }
}
