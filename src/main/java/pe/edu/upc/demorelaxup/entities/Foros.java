package pe.edu.upc.demorelaxup.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Foros")
public class Foros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idForos;
    @Column(name = "titulo",nullable = false, length = 40)
    private String titulo;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    public Foros() {
    }
    public Foros(int idForos, String titulo, Usuario usuario) {
        this.idForos = idForos;
        this.titulo = titulo;
        this.usuario=usuario;
    }

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
