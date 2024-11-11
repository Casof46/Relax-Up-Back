package pe.edu.upc.demorelaxup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demorelaxup.entities.TecnicasRelajacion;

import java.util.List;

@Repository
public interface ITecnicasRelajacionRepository extends JpaRepository<TecnicasRelajacion, Integer> {
    @Query(value = "Select u.nombre_rutina, count(*) as cantidad_tecnicas\n" +
            "        from rutina u inner join tecnicas f \n" +
            "        on u.id_rutina=f.id_rutina \n" +
            "        group by u.nombre_rutina",nativeQuery = true)
    public List<String[]> CantidadTecnicas();
}
