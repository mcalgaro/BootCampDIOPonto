package com.bootcamp.ponto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Usuario {
    @Id
    private Long id;
    @ManyToOne
    private com.bootcamp.ponto.model.CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne
    private com.bootcamp.ponto.model.Empresa empresa;
    @ManyToOne
    private com.bootcamp.ponto.model.NivelAcesso nivelAcesso;
    @ManyToOne
    private com.bootcamp.ponto.model.JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;
}
