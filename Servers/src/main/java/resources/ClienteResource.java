package resources;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.matheus.cursomc.dto.ClienteDTO;

import Service.ClienteService;
import domain.Cliente;
import domain.Cliente;

@RestController
@RequestMapping(value = "/Clientes")
public class ClienteResource {

	@Autowired
	private ClienteService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {
		Cliente obj = service.find(id);
		return ResponseEntity.ok().body(obj);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid @RequestBody ClienteDTO objDto, @PathVariable Integer id) {
		Cliente obj = service.fromDTO(objDto);
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();

	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();

	}
//
//	@RequestMapping(method = RequestMethod.GET)
//	public ResponseEntity<List<ClienteDTO>> findAll() {
//		List<Cliente> list = service.findAll();
//		List<ClienteDTO> listDto = list.stream().map(obj -> new ClienteDTO(obj)).collect(Collectors.toList());
//		return ResponseEntity.ok().body(listDto);
//	}
//
//	@RequestMapping(value = "/page", method = RequestMethod.GET)
//	public ResponseEntity<List<ClienteDTO>> findPage(@RequestParam(value = "page", defaultValue = "0") Integer page,
//			@RequestParam(value = "linesPerPage", defaultValue = "24") Integer linePerPage,
//			@RequestParam(value = "OderBy", defaultValue = "nome") String ordeyBy,
//			@RequestParam(value = "direction", defaultValue = "ASC ") String direction) {
//		List<Cliente> list = service.findAll();
//		List<ClienteDTO> listDto = list.stream().map(obj -> new ClienteDTO(obj)).collect((Collectors.toList()));
//		return ResponseEntity.ok().body(listDto);
//	}
}