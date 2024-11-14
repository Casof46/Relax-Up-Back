package pe.edu.upc.demorelaxup.serviceinterfaces;


import pe.edu.upc.demorelaxup.entities.TecnicasRelajacion;

import java.util.List;

public interface ITecnicasRelajacionService {
    public List<TecnicasRelajacion> list();
    public void insert (TecnicasRelajacion tecnicasRelajacion);

    public TecnicasRelajacion listId(int id);

    public void update(TecnicasRelajacion a);

    public void delete(int id);

    public List<String[ ]> CantidadTecnicas();
}
