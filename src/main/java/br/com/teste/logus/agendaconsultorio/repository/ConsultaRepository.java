package br.com.teste.logus.agendaconsultorio.repository;

import br.com.teste.logus.agendaconsultorio.model.ConsultaModel;
import org.springframework.data.repository.CrudRepository;

public interface ConsultaRepository extends CrudRepository<ConsultaModel, Integer> {
}
