package br.com.cafeteria.inteligente.products;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Products")
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer product_id;

    @Column(name = "category_id")
    private Integer category_id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Float price;

    @Column(name = "seller_Id")
    private Integer seller_Id;

    @Column(name = "ListagemDeImagens_id")
    private Integer listagemDeImagens_id;

    @Column(name = "CorrelatedWorlds_id")
    private Integer correlatedWorlds_id;

}
