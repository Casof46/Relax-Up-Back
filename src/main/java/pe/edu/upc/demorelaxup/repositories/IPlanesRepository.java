package pe.edu.upc.demorelaxup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demorelaxup.entities.Planes;

import java.util.List;

@Repository
public interface IPlanesRepository extends JpaRepository<Planes,Integer> {

    @Query(value = "SELECT planes.id_plan,planes.nombre_plan,COUNT(suscripciones.id_suscripcion) AS total_suscripciones\n" +
            "FROM planes\n" +
            "LEFT JOIN suscripciones ON planes.id_plan = suscripciones.id_plan\n" +
            "GROUP BY planes.id_plan,planes.nombre_plan", nativeQuery = true)
    public List<String[]> totalSuscripcion();


    @Query(value = "SELECT planes.id_plan,planes.nombre_plan,SUM(planes.precio) AS total_ingresos\n" +
            "            FROM planes\n" +
            "            JOIN suscripciones ON planes.id_plan = suscripciones.id_plan\n" +
            "            GROUP BY planes.id_plan,planes.nombre_plan", nativeQuery = true)
    public List<String[]> totalIngreso();
}
