package pe.edu.upc.demorelaxup.serviceinterfaces;

import pe.edu.upc.demorelaxup.entities.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> list();
    public void insert(Usuario uu);
    public Usuario listId(int id);
    public void update(Usuario usuario);
    public void delete(int id);

}
