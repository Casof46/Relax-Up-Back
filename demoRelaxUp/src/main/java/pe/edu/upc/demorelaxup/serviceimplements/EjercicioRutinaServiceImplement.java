package pe.edu.upc.demorelaxup.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demorelaxup.entities.EjercicioRutina;
import pe.edu.upc.demorelaxup.repositories.IEjercicioRutinaRepository;
import pe.edu.upc.demorelaxup.serviceinterfaces.IEjercicioRutinaService;

import java.util.List;

@Service
public class EjercicioRutinaServiceImplement implements IEjercicioRutinaService {

    @Autowired
    private IEjercicioRutinaRepository eR;

    @Override
    public List<EjercicioRutina> list() {
        return eR.findAll();
    }

    @Override
    public void insert(EjercicioRutina er) { eR.save(er);}

    @Override
    public EjercicioRutina listId(int id) {return eR.findById(id).orElse(new EjercicioRutina());}

    @Override
    public void update(EjercicioRutina ejercicioRutina) {eR.save(ejercicioRutina);}

    @Override
    public void delete(int id) {eR.deleteById(id);}
}
