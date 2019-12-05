package domain;

public class Livro {

	private int id_livro;
	private String nome;
	private String autor;
	private String isbn;
	private String genero;

	public Livro() {

	}

	public int getId_livro() {
		return id_livro;
	}

	public void setId_livro(int id_livro) {
		this.id_livro = id_livro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;

	}

}
