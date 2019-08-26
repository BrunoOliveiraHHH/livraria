package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Categoria;

@Repository
public interface ClienteRepository extends JpaRepository<Categoria,Integer> {


}
