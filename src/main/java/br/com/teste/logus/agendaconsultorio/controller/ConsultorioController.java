package br.com.teste.logus.agendaconsultorio.controller;

import br.com.teste.logus.agendaconsultorio.model.ConsultorioModel;
import br.com.teste.logus.agendaconsultorio.repository.ConsultorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jonas marcelo
 */
@RestController
public class ConsultorioController {

    @Autowired
    private ConsultorioRepository repository;

    @PostMapping(path = "api/consultorio/salvar")
    public ConsultorioModel salvar(@RequestBody ConsultorioModel consultorio){
        return this.repository.save(consultorio);
    }
}
