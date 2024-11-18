package pe.edu.upc.demorelaxup.dtos;

import pe.edu.upc.demorelaxup.entities.Rol;

public class UsuarioDTO {
    private int idUsuario;

    private String nombreUsuario;

    private String correoUsuario;

    private int telefonoUsuario;

    private String contrasenaUsuario;

    private int progresoUsuario;

    private Rol rol;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public int getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(int telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public int getProgresoUsuario() {
        return progresoUsuario;
    }

    public void setProgresoUsuario(int progresoUsuario) {
        this.progresoUsuario = progresoUsuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
