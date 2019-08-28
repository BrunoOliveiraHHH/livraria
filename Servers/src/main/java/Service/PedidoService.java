package Service;

import org.springframework.beans.factory.annotation.Autowired;

import domain.Pedido;
import exceptions.ObejctNotFoundException;
import repositories.PedidoRepository;

public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Pedido obj = repo.findOne(id);

		if(obj == null) {
			throw new ObejctNotFoundException("Objetio não encontrado ! ID: " + id + " , Tipo " + Pedido.class.getName());
		}
		return obj;

	}

}
