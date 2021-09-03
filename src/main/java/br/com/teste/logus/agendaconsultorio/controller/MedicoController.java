package br.com.teste.logus.agendaconsultorio.controller;

import br.com.teste.logus.agendaconsultorio.model.MedicoModel;
import br.com.teste.logus.agendaconsultorio.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping(path = "/api/medico/salvar")
    public MedicoModel salvar(@RequestBody MedicoModel medico){
        return repository.save(medico);
    }

    @GetMapping(path = "/api/medicoPorId/{id}")
    public ResponseEntity medicoPorId(@PathVariable Long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());

    }

    @GetMapping(path = "/api/medicos")
    public Iterable<MedicoModel> medicos(){
        return repository.findAll();
    }
}
