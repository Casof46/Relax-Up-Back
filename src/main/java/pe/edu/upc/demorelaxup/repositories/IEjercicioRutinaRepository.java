package pe.edu.upc.demorelaxup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demorelaxup.entities.EjercicioRutina;

@Repository
public interface IEjercicioRutinaRepository extends JpaRepository<EjercicioRutina, Integer> {
}
