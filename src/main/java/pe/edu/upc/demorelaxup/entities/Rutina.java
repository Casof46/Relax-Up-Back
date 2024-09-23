package pe.edu.upc.demorelaxup.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Rutina")
public class Rutina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRutina;
    @Column(name = "nombreRutina",nullable = false,length = 70)
    private String nombreRutina;
    @Column(name = "descripcionRutina",nullable = false,length = 200)
    private String descripcionRutina;
    @Column(name = "duracionRutina",nullable = false)
    private int duracionRutina;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario us;

    public Rutina() {
    }

    public Rutina(int idRutina, String nombreRutina, String descripcionRutina, int duracionRutina, Usuario us) {
        this.idRutina = idRutina;
        this.nombreRutina = nombreRutina;
        this.descripcionRutina = descripcionRutina;
        this.duracionRutina = duracionRutina;
        this.us = us;
    }

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

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }
}