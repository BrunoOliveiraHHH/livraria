package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Categoria;
import domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Categoria,Integer> {

	Cliente findOne(Integer id);


}
