package com.projects.forohub.domain.topico;

import com.projects.forohub.domain.Respuesta;
import jakarta.persistence.OneToMany;
import lombok.Setter;

import java.util.Date;
import java.util.List;

public record DatosTopicoCreado(
        String titulo,
        String mensaje,
        Date fechaCreacion,
        String status,
        String autor,
        String curso
) {
    public DatosTopicoCreado(Topico topico){
        this(
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso()
        );
    }
}
