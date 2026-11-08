package com.aula.aula2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pets")
public class PetController {

    @GetMapping("/pets")
    public String mensagem(){
        return("Bem-vinda ao Pet Shop Elas Tech");
    }

    @GetMapping("/horarios")
   public String horariosPets(){
        return "Abrimos de segunda a sábado, das 8h às 18h.";
   }

   @GetMapping("/destaque")
    public Pet novoPet(){
       return new Pet("Luna", "Cachorro", 3);
    }

    @GetMapping("/adotar/ {nome}")
    public String adotarPet(@PathVariable String nome){
        return "Parabéns, você adotou " + nome;
    }

    @GetMapping("/banho/ {seuPet}")
    public String banhoPet(@PathVariable String seuPet){
        return seuPet + " está tomando banho ";
    }


    @GetMapping("/novo/{nomePet}")
    public String novo(@PathVariable String nomePet){
        return nomePet + " especie " +  novoPet().especie + " idade " +  novoPet().idade;
    }


    
}
