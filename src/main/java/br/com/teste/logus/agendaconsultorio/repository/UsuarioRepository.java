package br.com.teste.logus.agendaconsultorio.repository;

import br.com.teste.logus.agendaconsultorio.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

}
