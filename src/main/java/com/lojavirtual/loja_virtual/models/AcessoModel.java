package com.lojavirtual.loja_virtual.models;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "acesso")
@SequenceGenerator(name = "acesso_seq", sequenceName = "acesso_seq", initialValue = 1, allocationSize = 1)
public class AcessoModel implements GrantedAuthority {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "acesso_seq")
    private long id;

    @Column(nullable = false)
    private String descricao;


    @Override
    public String getAuthority() {
        return this.descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public AcessoModel(){

    }

    @Override
    public String toString() {
        return "AcessoModel{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
