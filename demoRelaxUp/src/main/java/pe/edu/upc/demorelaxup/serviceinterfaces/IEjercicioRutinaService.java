package pe.edu.upc.demorelaxup.serviceinterfaces;

import pe.edu.upc.demorelaxup.entities.EjercicioRutina;

import java.util.List;

public interface IEjercicioRutinaService {
    public List<EjercicioRutina> list();
    public void insert(EjercicioRutina er);
    public EjercicioRutina listId(int id);
    public void update(EjercicioRutina ejercicioRutina);
    public void delete(int id);
}
