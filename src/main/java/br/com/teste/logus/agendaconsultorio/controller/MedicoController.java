package br.com.teste.logus.agendaconsultorio.controller;

import br.com.teste.logus.agendaconsultorio.model.MedicoModel;
import br.com.teste.logus.agendaconsultorio.model.UsuarioModel;
import br.com.teste.logus.agendaconsultorio.repository.MedicoRepository;
import br.com.teste.logus.agendaconsultorio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping(path = "/api/medico/salvar")
    public MedicoModel salvar(@RequestBody MedicoModel medico){
        return repository.save(medico);
    }
}
