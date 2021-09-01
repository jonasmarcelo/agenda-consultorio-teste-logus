package br.com.teste.logus.agendaconsultorio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.xpath.XPath;

@RestController
public class StatusController {

    @GetMapping(path = "api/status")
    public String check(){
        return "online";
    }
}
