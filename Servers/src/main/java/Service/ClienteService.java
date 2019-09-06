package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import com.matheus.cursomc.dto.ClienteDTO;

import domain.Cliente;
import exceptions.ObejctNotFoundException;
import repositories.ClienteRepository;

public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Cliente obj = repo.findOne(id);

		if (obj == null) {
			throw new ObejctNotFoundException(
					"Objetio não encontrado ! ID: " + id + " , Tipo " + Cliente.class.getName());
		}
		return obj;

	}

	public Cliente update(Cliente obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.delete(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("Não é possivel excluir porque há entidades relacionadas");
		}
	}
//	public List<Cliente> findAll() {
//		return repo.findAll();
//	}
//	
//
//	public Page<Cliente> findPage(Integer page, Integer linesPerPage, String ordeyBy, String direction) {
//		PageRequest pageRequest = new PageRequest(page, linesPerPage, Direction.valueOf(direction), ordeyBy);
//		return repo.findAll(pageRequest);
//	}

	public Cliente fromDTO(ClienteDTO objDto) {
		return new Cliente(objDto.getId(), objDto.getNome(), objDto.getEmail(), null, null);
	}
 
	private void updateData(Cliente newObj, Cliente obj) {
		newObj.setNome(obj.getNome());
		newObj.setEmail(obj.getEmail());
	}
}
