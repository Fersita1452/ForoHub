package com.projects.forohub.controller;

import com.projects.forohub.domain.topico.Topico;
import com.projects.forohub.domain.topico.TopicoRepository;
import com.projects.forohub.domain.topico.DatosTopicoCreado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/topicos")
public class TopicoController {
    @Autowired
    TopicoRepository topicoRepo;

    @PostMapping
    public /*ResponseEntity<DatosTopicoCreado>*/void postTopic(@RequestBody DatosTopicoCreado topicoCrear){
        Topico topico = new Topico(topicoCrear);
        topicoRepo.save(topico);
//        Topico topicoCreado = topicoRepo.findByTitulo(topicoCrear.titulo());
//        return ResponseEntity.ok(new DatosTopicoCreado(topicoCreado));
    }
}
