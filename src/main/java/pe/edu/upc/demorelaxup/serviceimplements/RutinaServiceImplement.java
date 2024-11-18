package pe.edu.upc.demorelaxup.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demorelaxup.entities.Rutina;
import pe.edu.upc.demorelaxup.repositories.IRutinaRepository;
import pe.edu.upc.demorelaxup.serviceinterfaces.IRutinaService;

import java.util.List;

@Service
public class RutinaServiceImplement implements IRutinaService {

    @Autowired
    private IRutinaRepository rR;

    @Override
    public List<Rutina> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Rutina ru) { rR.save(ru);}

    @Override
    public Rutina listId(int id) {return rR.findById(id).orElse(new Rutina());}

    @Override
    public void update(Rutina rutina) {rR.save(rutina);}

    @Override
    public void delete(int id) {rR.deleteById(id);}

    @Override
    public List<String[]> RutinasByUsuario() {
        return rR.RutinasByUsuario();
    }

    @Override
    public List<String[]> CantidadRutinas() {
        return rR.CantidadRutinas();
    }
}