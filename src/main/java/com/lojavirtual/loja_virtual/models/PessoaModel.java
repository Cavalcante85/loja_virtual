package com.lojavirtual.loja_virtual.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@SequenceGenerator(name = "pessoa_seq", sequenceName = "pessoa_seq", initialValue = 1,allocationSize = 1)
public abstract class  PessoaModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_seq")
    private long id;

    @Column(nullable = false)
    private String nome;

    private String email;

    private String telefone;



    @OneToMany(mappedBy = "pessoaModel", orphanRemoval = true, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<EnderecoModel> enderecoModels  = new ArrayList<EnderecoModel>();



    public List<EnderecoModel> getEnderecoModels() {
        return enderecoModels;
    }

    public void setEnderecoModels(List<EnderecoModel> enderecoModels) {
        this.enderecoModels = enderecoModels;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public PessoaModel(){

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaModel that = (PessoaModel) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "PessoaModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
