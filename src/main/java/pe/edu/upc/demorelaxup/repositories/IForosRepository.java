package pe.edu.upc.demorelaxup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.demorelaxup.entities.Foros;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IForosRepository extends JpaRepository<Foros,Integer> {
    @Query(value="SELECT f.titulo, u.nombre_usuario, COUNT(*) AS cantidad_mensajes\n" +
            " FROM foros f\n" +
            " INNER JOIN mensajes_foros mf ON f.id_foros = mf.id_foros\n" +
            " INNER JOIN usuario u ON mf.id_usuario = u.id_usuario\n" +
            " GROUP BY f.titulo, u.nombre_usuario",nativeQuery = true)
    public List<String[]> CantidadMensajesForos();
    @Query(value = "Select u.nombre_usuario, count(*) as cantidad_foros\n" +
            "        from usuario u inner join foros f \n" +
            "        on u.id_usuario=f.id_usuario \n" +
            "        group by u.nombre_usuario",nativeQuery = true)
    public List<String[]> CantidadForos();
}
