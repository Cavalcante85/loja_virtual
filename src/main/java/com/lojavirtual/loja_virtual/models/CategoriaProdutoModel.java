package com.lojavirtual.loja_virtual.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "categoria_produto")
public class CategoriaProdutoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(nullable = false)
    private String nomeDesc;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeDesc() {
        return nomeDesc;
    }

    public void setNomeDesc(String nomeDesc) {
        this.nomeDesc = nomeDesc;
    }

    public CategoriaProdutoModel(){

    }

    @Override
    public String toString() {
        return "CategoriaProdutoModel{" +
                "id=" + id +
                ", nomeDesc='" + nomeDesc + '\'' +
                '}';
    }
}
