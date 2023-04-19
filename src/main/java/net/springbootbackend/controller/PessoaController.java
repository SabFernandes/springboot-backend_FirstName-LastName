package net.springbootbackend.controller;

import net.springbootbackend.model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PessoaController {
@GetMapping("/pessoa")
    public List<Pessoa> getPessoa(){
        List<Pessoa> pessoa = new ArrayList<>();
        pessoa.add(new Pessoa("John", "Doe"));
        pessoa.add(new Pessoa("Jane", "Doe"));

        return pessoa;
    }
}
