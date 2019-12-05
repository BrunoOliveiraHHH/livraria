package repositorio.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import domain.Livro;
import model.Arma;
import repositorio.LivroRepository;

@Repository
public class LivroRepositoryImpl implements LivroRepository {

	private Connection connection;

	@Override
	public boolean inserirLivro(Livro livro) throws SQLException {
		String sql = "INSERT INTO livro(nome, autor, isbn, genero) VALUES (?,?,?,?)";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, livro.getNome());
		statement.setString(2, livro.getAutor());
		statement.setString(3, livro.getIsbn());
		statement.setString(4, livro.getGenero());
		
		boolean linhaInserida = statement.executeUpdate() > 0;
		statement.close();
		
		return linhaInserida;
	}

	@Override
	public boolean alterarLivro(Livro livro) throws SQLException {
		String sql = "UPDATE livro SET nome = ?, autor = ?, isbn = ?, genero = ?";
		sql += " WHERE Id_livro = ?";


		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, livro.getNome());
		statement.setString(2, livro.getAutor());
		statement.setString(3, livro.getIsbn());
		statement.setString(4, livro.getGenero());
		statement.setInt(5, livro.getId_livro());

		boolean linhaAlterada = statement.executeUpdate() > 0;
		statement.close();

		return linhaAlterada;
	}

	@Override
	public boolean excluirLivro(Livro livro) throws SQLException {
		String sql = "DELETE FROM livro WHERE Id_livro = ?";


		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, livro.getId_livro());

		boolean linhaExcluida = statement.executeUpdate() > 0;
		statement.close();

		return linhaExcluida;
	}

	@Override
	public List<Livro> listarLivros() throws SQLException {
		List<Livro> listaLivro = new ArrayList<>();

		String sql = "SELECT * FROM arma";

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			int id = resultSet.getInt("ID_Arma");
			String nome = resultSet.getString("Nome");
			String autor = resultSet.getString("Tipo");
			String isbn = resultSet.getString

			Livro livro = new Livro(id, name, type);

			listaLivro.add(livro);
		}
		
		resultSet.close();
		statement.close();

		return listaLivro;
	}

	@Override
	public Livro getLivro(int id_livro) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
