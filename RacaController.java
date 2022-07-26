package br.com.apiracas.apiracas.controller;

import br.com.apiracas.apiracas.model.Raca;
import br.com.apiracas.apiracas.repository.RacaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
public class RacaController {

    @Autowired
    private RacaRepository racaRepository;

    //Listar todas as raças
    @GetMapping("/RacasProibidas")
    public List<Raca> listarTodas(){

        List<Raca> racasProibidas = racaRepository.findAll();

        return racasProibidas;
    }

    //Listar uma única raça por id
    @GetMapping("/RacasPorId")
    public String listarUnicaRaca(@RequestBody String id){
        racaRepository.findById(id);
        return id;
    }

    // salvar via post
    @PostMapping("/salvar")
    public Raca salvarRaca(@RequestBody Raca raca){
        racaRepository.save(raca);
        return raca;
    }



    //Remover raça
    @DeleteMapping("/removerRaca")
    public Raca remover(@RequestBody Raca raca){
        racaRepository.delete(raca);
        return raca;
    }

    //Editar raça por get
    @PutMapping("/editarRaca")
    public Raca editar(@RequestBody Raca raca){
        racaRepository.save(raca);
        return raca;
    }

}
