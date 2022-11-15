package heroes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import heroes.model.Usuario;
import heroes.repository.UsuarioRepository;

@Service
public class UsuarioServiceImplement implements UsuarioService  {
	
	@Autowired
	private UsuarioRepository repo; 
	
	
	
}
