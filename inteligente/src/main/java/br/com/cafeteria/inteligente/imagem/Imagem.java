package br.com.cafeteria.inteligente.imagem;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Imagens")
@Data
public class Imagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Lob
    @Column(name = "imagem_base64", columnDefinition = "TEXT")
    private String imagemBase64;
}
