package com.lojavirtual.loja_virtual.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "marca_produto")
public class MarcaProdutoModel implements Serializable {
    private static final long serialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;


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


    public  MarcaProdutoModel(){

    }

    @Override
    public String toString() {
        return "MarcaProdutoModel{" +
                "id=" + id +
                ", nomeDesc='" + nomeDesc + '\'' +
                '}';
    }
}
