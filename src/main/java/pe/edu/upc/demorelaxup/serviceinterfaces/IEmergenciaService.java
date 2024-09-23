package pe.edu.upc.demorelaxup.serviceinterfaces;

import pe.edu.upc.demorelaxup.entities.Emergencia;

import java.util.List;

public interface IEmergenciaService {
    public List<Emergencia> list();
    public void insert(Emergencia ee);
    public Emergencia listId(int id);
    public void update(Emergencia emergencia);
    public void delete(int id);
    public List<String[]> totalEmergencias();
    public List<String[ ]> EmergenciaByUsuario();
}
