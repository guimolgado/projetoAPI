package com.example.livros;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "O título é obrigatório")
    private String titulo;

    @Embedded
    private InformacaoPublicacao informacaoPublicacao;

    // getters e setters
}

@Embeddable
public class InformacaoPublicacao {

    @NotBlank(message = "O autor é obrigatório")
    private String autor;

    private Date dataPublicacao;

    private String editora;

    // getters e setters
}
