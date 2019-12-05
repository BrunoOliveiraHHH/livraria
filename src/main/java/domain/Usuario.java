package domain;

import java.util.Date;

public class Usuario {

	private int Id_usuario;
	private String nome;
	private String email;
	private Date data_nasc;
	private String telefone;
	private String endereco;

	public Usuario() {

	}

	public int getId_usuario() {
		return Id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		Id_usuario = id_usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
