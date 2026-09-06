package com.example.allanimals.infrastructure.persistence.jpa.entities;


import com.example.allanimals.domain.model.objectValue.Email;
import com.example.allanimals.domain.model.objectValue.Telefone;
import com.example.allanimals.infrastructure.persistence.jpa.converters.EmailConverter;
import com.example.allanimals.infrastructure.persistence.jpa.converters.TelefoneConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tutor_tb")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TutorEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    @Convert(converter = TelefoneConverter.class)
    private Telefone phone;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Column(nullable = false, unique = true)
    @Convert(converter = EmailConverter.class)
    private Email email;
}
