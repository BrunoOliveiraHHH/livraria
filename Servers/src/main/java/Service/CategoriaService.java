package Service;

import org.springframework.beans.factory.annotation.Autowired;

import domain.Categoria;
import exceptions.ObejctNotFoundException;
import repositories.CategoriaRepository;

public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Categoria obj = repo.findOne(id);

		if (obj == null) {
			throw new ObejctNotFoundException(
					"Objetio não encontrado ! ID: " + id + " , Tipo " + Categoria.class.getName());
		}
		return obj;

	}

	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
}
