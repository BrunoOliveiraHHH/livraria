package Service;

import org.springframework.beans.factory.annotation.Autowired;

import domain.Cliente;
import exceptions.ObejctNotFoundException;
import repositories.ClienteRepository;

public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Cliente obj = repo.findOne(id);

		if(obj == null) {
			throw new ObejctNotFoundException("Objetio não encontrado ! ID: " + id + " , Tipo " + Cliente.class.getName());
		}
		return obj;

	}

}
	