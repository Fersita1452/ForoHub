package com.projects.forohub.domain.topico;

import com.projects.forohub.domain.Respuesta;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Topico {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String mensaje;
    private Date fechaCreacion;
    private String status;
    private String autor;
    private String curso;
//    @OneToMany
//    private List<Respuesta> respuestas;

    public Topico(DatosTopicoCreado topicoCrear) {
        this.titulo = topicoCrear.titulo();
        this.mensaje = topicoCrear.mensaje();
        this.autor = topicoCrear.autor();
        this.curso = topicoCrear.curso();
    }

}
