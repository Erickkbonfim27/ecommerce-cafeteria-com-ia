package br.com.cafeteria.inteligente.user;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "smartCoffeUsers")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="nome")
    private String nome;

    @Column(name="sobreNome")
    private String sobreNome;

    @Column(name="cpf")
    private String cpf;

    @Column(name = "id_coffee_preferences")
    private Integer idCoffeePreferences;
}
