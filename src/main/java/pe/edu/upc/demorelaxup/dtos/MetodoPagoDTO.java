package pe.edu.upc.demorelaxup.dtos;
import pe.edu.upc.demorelaxup.entities.Usuario;

public class MetodoPagoDTO {
    private int idMetodoPago;
    private String tipoPago;
    private Usuario usuario;

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
