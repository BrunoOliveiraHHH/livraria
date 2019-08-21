package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
