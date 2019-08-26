package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Cidade;

public interface CidadeRepository  extends JpaRepository<Cidade, Integer> {

}
