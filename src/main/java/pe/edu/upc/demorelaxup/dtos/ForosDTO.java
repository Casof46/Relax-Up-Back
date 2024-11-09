package pe.edu.upc.demorelaxup.dtos;

import pe.edu.upc.demorelaxup.entities.Usuario;

public class ForosDTO {
    private int idForos;
    private String titulo;
    private Usuario usuario;

    public int getIdForos() {
        return idForos;
    }

    public void setIdForos(int idForos) {
        this.idForos = idForos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}


