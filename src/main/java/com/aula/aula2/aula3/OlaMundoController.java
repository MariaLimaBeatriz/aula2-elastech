package com.aula.aula2.aula3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// diz que pagina faz o HTTP e faz json, não uma pagina da web
@RequestMapping("/ola-mundo") // determina o prefixo para acessar todas as rotas.
public class OlaMundoController {

    @GetMapping // chama o metodo quando o verbo é get
    public String olaMundo(){
        return "Ola Mundo!";
    }

    @GetMapping("/seja-bemvindo")
    public String olaBia(){
        return "Seja bem-vindo bia";
    }
}
