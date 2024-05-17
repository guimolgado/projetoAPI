package com.example.livro;

import javax.persistence.Embeddable;
import java.util.Date;

@Embeddable
public class InformacaoPublicacao {
    private String autor;
    private Date dataPublicacao;
    private String editora;

    // getters e setters
}
