package repositorio;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import domain.Livro;

@Repository
public interface LivroRepository {
	
	public boolean inserirLivro(Livro livro) throws SQLException;
	
	public boolean alterarLivro(Livro livro) throws SQLException;
	
	public boolean excluirLivro(Livro livro) throws SQLException;
	
	public List<Livro> listarLivros() throws SQLException;
	
	public Livro getLivro(int id_livro) throws SQLException;

}
