package br.com.cafeteria.inteligente.correlatedworlds;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "correlatedWorlds")
@AllArgsConstructor
@NoArgsConstructor
public class correlatedWorlds {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "correlatedWorlds_id")
    private Integer correlatedWorlds_id;

    @Column(name = "world")
    private String worldCorrelated;

    @Column(name="product_id")
    private Integer product_id;

}
