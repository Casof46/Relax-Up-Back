package pe.edu.upc.demorelaxup.dtos;

public class CantidadForosByUsuariosDTO {
    public int Id_Foros;
    public String nombre_usuario;
    public int cantidad_foros;
//p
    public int getId_Foros() {
        return Id_Foros;
    }

    public void setId_Foros(int id_Foros) {
        Id_Foros = id_Foros;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getCantidad_foros() {
        return cantidad_foros;
    }

    public void setCantidad_foros(int cantidad_foros) {
        this.cantidad_foros = cantidad_foros;}

}
