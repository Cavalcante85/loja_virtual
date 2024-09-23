package com.lojavirtual.loja_virtual.models;


import jakarta.persistence.*;

import javax.xml.crypto.Data;

@Entity
@Table(name = "pessoa_fisica")
public class PessoaFisicaModel extends PessoaModel{
    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private String cpf;

    private String data_nascimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String  getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public PessoaFisicaModel(){

    }

    @Override
    public String toString() {
        return "PessoaFisicaModel{" +
                "cpf='" + cpf + '\'' +
                ", data_nascimento=" + data_nascimento +
                '}';
    }
}
