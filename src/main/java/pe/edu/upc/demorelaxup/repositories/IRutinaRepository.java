package pe.edu.upc.demorelaxup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demorelaxup.entities.Rutina;

import java.util.List;

@Repository
public interface IRutinaRepository extends JpaRepository<Rutina, Integer> {
    @Query(value = "Select f.id_rutina,u.nombre_usuario, count(*) as cantidad_rutinas\n" +
            "             from usuario u inner join rutina f \n" +
            "             on u.id_usuario=f.id_usuario \n" +
            "             group by u.nombre_usuario,id_rutina",nativeQuery = true)
    public List<String[ ]> RutinasByUsuario();

    @Query(value = "Select t.nombre_tecnica, count(f.id_rutina)\n" +
            "            from tecnicas_relajacion t inner join rutina f \n" +
            "            on t.id_tecnica_relajacion=f.id_tecnica_relajacion \n" +
            "            group by t.nombre_tecnica",nativeQuery = true)
    public List<String[ ]> CantidadRutinas();
}