package br.com.teste.logus.agendaconsultorio.repository;

import br.com.teste.logus.agendaconsultorio.model.MedicoModel;
import org.springframework.data.repository.CrudRepository;

public interface MedicoRepository extends CrudRepository<MedicoModel, Integer> {
}
