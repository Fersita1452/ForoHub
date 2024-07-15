package com.projects.forohub.domain.topico;

import com.projects.forohub.domain.topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    public Topico findByTitulo(String titlulo);
}
