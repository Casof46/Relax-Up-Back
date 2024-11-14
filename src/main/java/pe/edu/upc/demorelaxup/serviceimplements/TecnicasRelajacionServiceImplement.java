package pe.edu.upc.demorelaxup.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demorelaxup.entities.TecnicasRelajacion;
import pe.edu.upc.demorelaxup.repositories.ITecnicasRelajacionRepository;
import pe.edu.upc.demorelaxup.serviceinterfaces.ITecnicasRelajacionService;

import java.util.List;

@Service
public class TecnicasRelajacionServiceImplement implements ITecnicasRelajacionService {
    @Autowired
    private ITecnicasRelajacionRepository tR;

    @Override
    public List<TecnicasRelajacion> list(){ return tR.findAll();}

    @Override
    public void insert (TecnicasRelajacion tecnicasRelajacion) {tR.save(tecnicasRelajacion);}

    @Override
    public TecnicasRelajacion listId(int id) {return tR.findById(id).orElse(new TecnicasRelajacion());}

    @Override
    public void update (TecnicasRelajacion a) {tR.save(a);}

    @Override
    public void delete(int id) {tR.deleteById(id);}

    @Override
    public List<String[]> CantidadTecnicas() {
        return tR.CantidadTecnicas();
    }
}