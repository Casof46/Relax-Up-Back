package pe.edu.upc.demorelaxup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.demorelaxup.entities.Eventos;

import java.util.List;

public interface IEventosRepository extends JpaRepository<Eventos, Integer> {
    @Query(value = "SELECT e.ideventos,e.titulo, COUNT(a.id_usuario) As Cantidad_confirmado\n" +
            "FROM eventos e\n" +
            "LEFT JOIN eventos a ON e.ideventos = a.ideventos\n" +
            "And e.confirmacion=true\n" +
            "GROUP BY e.ideventos  ",nativeQuery = true)
    public List<String[]> CantidadConfirmaron();
}
