package com.lojavirtual.loja_virtual.models;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "avaliacao_produto")
public class AvaliacaoProdutoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

   private String descricao;


    @Column(nullable = false)
    private Integer nota;

    @ManyToOne(targetEntity = PessoaModel.class)
    @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_avaliacao_fk"))
    private PessoaModel pessoa;

    @ManyToOne(targetEntity = ProdutoModel.class)
    @JoinColumn(name = "produto_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "produto_avaliacao_fk"))
    private ProdutoModel produto;


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

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public PessoaModel getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaModel pessoa) {
        this.pessoa = pessoa;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }


    public AvaliacaoProdutoModel(){

    }

    @Override
    public String toString() {
        return "AvaliacaoProdutoModel{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", nota=" + nota +
                ", pessoa=" + pessoa +
                ", produto=" + produto +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AvaliacaoProdutoModel that = (AvaliacaoProdutoModel) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
