package pe.edu.upc.demorelaxup.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "TecnicasRelajacion")
public class TecnicasRelajacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTecnicaRelajacion;
    @Column(name = "nombreTecnica", nullable = false,length = 70)
    private String nombreTecnica;

    public TecnicasRelajacion() {
    }

    public TecnicasRelajacion(int idTecnicaRelajacion, String nombreTecnica) {
        this.idTecnicaRelajacion = idTecnicaRelajacion;
        this.nombreTecnica = nombreTecnica;
    }

    public int getIdTecnicaRelajacion() {
        return idTecnicaRelajacion;
    }

    public void setIdTecnicaRelajacion(int idTecnicaRelajacion) {
        this.idTecnicaRelajacion = idTecnicaRelajacion;
    }

    public String getNombreTecnica() {
        return nombreTecnica;
    }

    public void setNombreTecnica(String nombreTecnica) {
        this.nombreTecnica = nombreTecnica;
    }
}

