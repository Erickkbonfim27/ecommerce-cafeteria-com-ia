package br.com.cafeteria.inteligente.imagem;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "ListagemDeImagens")
@AllArgsConstructor
@NoArgsConstructor
public class ListagemDeImagens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ListagemDeImagens_id")
    private Integer listagemDeImagens_id;

    @Column(name = "product_id")
    private Integer product_id;

    @Column(name = "Imagem_id")
    private Integer imagem_id;


}
