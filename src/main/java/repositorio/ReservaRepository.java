package repositorio;

import java.util.List;

import domain.Livro;
import domain.Reserva;

public interface ReservaRepository {
	
public boolean inserirReserva(Reserva reserva);
	
	public boolean alterarReserva(Reserva reserva);
	
	public boolean excluirReserva(Reserva reserva);
	
	public List<Reserva> listarReserva();
	
	public Reserva getReserva(int id_reserva);

	
}
