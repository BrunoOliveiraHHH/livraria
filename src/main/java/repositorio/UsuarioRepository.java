package repositorio;

import java.util.List;

import domain.Usuario;

public interface UsuarioRepository {
	
	public boolean inserirUsuario(Usuario usuario);
	
	public boolean alterarUsuario(Usuario usuario);
	
	public boolean excluirUsuario(Usuario usuario);
	
	public List<Usuario> listarUsuario();
	
	public Usuario getUsuario(int id_usuario);

}
