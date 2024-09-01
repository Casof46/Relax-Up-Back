package pe.edu.upc.demorelaxup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demorelaxup.entities.Planes;

@Repository
public interface IPlanesRepository extends JpaRepository<Planes,Integer> {
}
