package pe.edu.upc.demorelaxup.serviceinterfaces;

import pe.edu.upc.demorelaxup.entities.Rutina;

import java.util.List;

public interface IRutinaService {
    public List<Rutina> list();
    public void insert(Rutina ru);
    public Rutina listId(int id);
    public void update(Rutina rutina);
    public void delete(int id);
    public List<String[ ]> RutinasByUsuario();
    public List<String[ ]> CantidadRutinas();
}