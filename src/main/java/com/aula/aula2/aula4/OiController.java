package com.aula.aula2.aula4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // ELe marca a classe e mostra que ela é um controller
@RequestMapping("/aula4")
public class OiController {

    @GetMapping("/ola")
    public String ola(){
        return "Olá, Elas Tech!";
    }

    //@GetMapping("/mensagem")
    //public Mensagem mensagem() {
        //return new Mensagem("Bem-vindas ao Spring", "Elas Tech");
    }

