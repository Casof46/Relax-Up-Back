package pe.edu.upc.demorelaxup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demorelaxup.entities.Emergencia;

import java.util.List;

@Repository
public interface IEmergenciaRepository extends JpaRepository<Emergencia,Integer> {

    @Query(value = "SELECT\n" +
            "\tEMERGENCIA.fecha_emergencia,\n" +
            "\tCOUNT(EMERGENCIA.id_emergencia) AS total_emergencias\n" +
            "FROM \n" +
            "\tEMERGENCIA\n" +
            "GROUP BY \n" +
            "\tfecha_emergencia", nativeQuery = true)
    public List<String[]> totalEmergencias();

    @Query(value = "Select u.nombre_usuario, count(f.id_emergencia)\n" +
            "            from usuario u inner join emergencia f \n" +
            "            on u.id_usuario=f.id_usuario \n" +
            "            group by u.nombre_usuario",nativeQuery = true)
    public List<String[ ]> EmergenciaByUsuario();

}
