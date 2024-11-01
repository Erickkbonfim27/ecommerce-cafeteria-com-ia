package br.com.cafeteria.inteligente.userpreferences;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "Preferencias")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPreferences {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUserPreferences")
    private Integer idUserPreferences;

    @Column(name = "IdSmartCoffeUsers")
    private Integer idSmartCoffeUsers;

    @Column(name = "Preference")
    private String preference;

    @Column(name = "DataUltimaAlteracao")
    private LocalDate dataAltercap;

}
