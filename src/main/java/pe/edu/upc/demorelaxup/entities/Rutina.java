package pe.edu.upc.demorelaxup.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idTecnicaRelajacion")
    private TecnicasRelajacion tecnicasRelajacion;
    public Rutina() {
    }

    public Rutina(int idRutina, String nombreRutina, String descripcionRutina, int duracionRutina,TecnicasRelajacion tecnicasRelajacion) {
        this.idRutina = idRutina;
        this.nombreRutina = nombreRutina;
        this.descripcionRutina = descripcionRutina;
        this.duracionRutina = duracionRutina;
        this.tecnicasRelajacion = tecnicasRelajacion;
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

    public TecnicasRelajacion getTecnicasRelajacion() {
        return tecnicasRelajacion;
    }

    public void setTecnicasRelajacion(TecnicasRelajacion tecnicasRelajacion) {
        this.tecnicasRelajacion = tecnicasRelajacion;
    }
}