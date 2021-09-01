package br.com.teste.logus.agendaconsultorio.controller;

import br.com.teste.logus.agendaconsultorio.model.UsuarioModel;
import br.com.teste.logus.agendaconsultorio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author jonas marcelo
 */
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    /**
     * Busca usuario pelo CÓDIGO
     * @param codigo
     * @return
     */
    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * Busca todos os usuários
     * @return
     */
    @GetMapping(path = "/api/usuarios")
    public Iterable<UsuarioModel> consultar(){
       return repository.findAll();
    }

    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario){
        return repository.save(usuario);
    }

}
