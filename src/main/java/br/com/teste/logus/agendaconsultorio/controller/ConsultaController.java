package br.com.teste.logus.agendaconsultorio.controller;

import br.com.teste.logus.agendaconsultorio.model.ConsultaModel;
import br.com.teste.logus.agendaconsultorio.model.MedicoModel;
import br.com.teste.logus.agendaconsultorio.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author jonas marcelo
 */
@RestController
public class ConsultaController {

    @Autowired
    private ConsultaRepository repository;

    @PostMapping(path = "/api/consulta/salvar")
    public ConsultaModel salvar(@RequestBody ConsultaModel consulta){
       return this.repository.save(consulta);
    }

    @GetMapping(path = "/api/consultas")
    public Iterable<ConsultaModel> consultas(){
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        repository.deleteById(id.intValue());
    }

}
