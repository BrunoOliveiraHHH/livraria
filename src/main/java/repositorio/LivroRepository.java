package repositorio;

import java.util.List;

import domain.Livro;

public interface LivroRepository {
	
	public boolean inserirLivro(Livro livro);
	
	public boolean alterarLivro(Livro livro);
	
	public boolean excluirLivro(Livro livro);
	
	public List<Livro> listarLivros();
	
	public Livro getLivro(int id_livro);

}
