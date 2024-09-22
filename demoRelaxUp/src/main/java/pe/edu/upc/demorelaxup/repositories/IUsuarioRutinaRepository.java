package pe.edu.upc.demorelaxup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demorelaxup.entities.UsuarioRutina;

import java.util.List;

@Repository
public interface IUsuarioRutinaRepository extends JpaRepository<UsuarioRutina, Integer> {
    @Query(value = "SELECT \n" +
            "    u.id_usuario,u.nombre_usuario,p.progreso\n" +
            "FROM \n" +
            "    usuario u\n" +
            "JOIN \n" +
            "    usuario_rutina p ON u.id_usuario = p.id_usuario\n" +
            "WHERE \n" +
            "    p.progreso = 100;",nativeQuery = true)
    public List<String[]> progresoCompletado();
}
