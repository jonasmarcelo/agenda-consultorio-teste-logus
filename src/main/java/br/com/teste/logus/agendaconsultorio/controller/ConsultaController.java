package br.com.teste.logus.agendaconsultorio.controller;

import br.com.teste.logus.agendaconsultorio.model.ConsultaModel;
import br.com.teste.logus.agendaconsultorio.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultaController {

    @Autowired
    private ConsultaRepository repository;

    @PostMapping(path = "/api/consulta/salvar")
    public ConsultaModel salvar(@RequestBody ConsultaModel consulta){
       return this.repository.save(consulta);
    }
}
