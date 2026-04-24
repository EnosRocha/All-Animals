package com.example.allanimals.infrastructure.persistence.jpa.entities;

import com.example.allanimals.domain.model.enums.TipoAnimal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Animal_tb")
public class AnimalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registro;

    @Column(name = "animal_name")
    private String name;

    @Column(name = "tipo_de_animal")
    @Enumerated(EnumType.STRING)
    private TipoAnimal tipoAnimal;

    @Column(name = "raca")
    private String raca;

    @Column(name = "peso")
    private Double peso;

    @Column(name = "cor_do_animal")
    private String cor;

    @Column(name = "idade_do_animal")
    private Integer idade;

    @Column(name = "id_do_dono")
    private Integer donoId;

    @Column(name = "descricaao_do_animal")
    private String descricao;

    @Column(name = "endereco_do_animal")
    private String endereco;
}
