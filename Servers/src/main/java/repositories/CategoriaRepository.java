package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

	Categoria findOne(Integer id);

	void delete(Integer id);

}
