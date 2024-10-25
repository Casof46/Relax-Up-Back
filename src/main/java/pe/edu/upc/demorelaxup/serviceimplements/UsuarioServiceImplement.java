package pe.edu.upc.demorelaxup.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demorelaxup.entities.Usuario;
import pe.edu.upc.demorelaxup.repositories.IUsuarioRepository;
import pe.edu.upc.demorelaxup.serviceinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private IUsuarioRepository uR;

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Usuario uu) { uR.save(uu);}

    @Override
    public Usuario listId(int id) {return uR.findById(id).orElse(new Usuario());}

    @Override
    public void update(Usuario usuario) {uR.save(usuario);}

    @Override
    public void delete(int id) {uR.deleteById(id);}

}
