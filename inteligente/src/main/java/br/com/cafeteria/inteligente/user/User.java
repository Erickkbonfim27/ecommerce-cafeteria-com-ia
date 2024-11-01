package br.com.cafeteria.inteligente.user;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "smartCoffeUsers")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String email;
    private String password;
    private Integer idCoffeePreferences;
}
