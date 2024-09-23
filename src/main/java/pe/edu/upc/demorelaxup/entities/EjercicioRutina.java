package pe.edu.upc.demorelaxup.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "EjercicioRutina")
public class EjercicioRutina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEjercicioRutina;
    @Column(name = "tituloEjercicioRutina", nullable = false, length = 70)
    private String tituloEjercicioRutina;
    @Column(name = "descripcionEjercicioRutina", nullable = false, length = 200)
    private String descripcionEjercicioRutina;
    @ManyToOne
    @JoinColumn(name = "idRutina")
    private Rutina ru;

    public EjercicioRutina() {
    }

    public EjercicioRutina(int idEjercicioRutina, String tituloEjercicioRutina, String descripcionEjercicioRutina, Rutina ru) {
        this.idEjercicioRutina = idEjercicioRutina;
        this.tituloEjercicioRutina = tituloEjercicioRutina;
        this.descripcionEjercicioRutina = descripcionEjercicioRutina;
        this.ru = ru;
    }

    public int getIdEjercicioRutina() {
        return idEjercicioRutina;
    }

    public void setIdEjercicioRutina(int idEjercicioRutina) {
        this.idEjercicioRutina = idEjercicioRutina;
    }

    public String getTituloEjercicioRutina() {
        return tituloEjercicioRutina;
    }

    public void setTituloEjercicioRutina(String tituloEjercicioRutina) {
        this.tituloEjercicioRutina = tituloEjercicioRutina;
    }

    public String getDescripcionEjercicioRutina() {
        return descripcionEjercicioRutina;
    }

    public void setDescripcionEjercicioRutina(String descripcionEjercicioRutina) {
        this.descripcionEjercicioRutina = descripcionEjercicioRutina;
    }

    public Rutina getRu() {
        return ru;
    }

    public void setRu(Rutina ru) {
        this.ru = ru;
    }
}