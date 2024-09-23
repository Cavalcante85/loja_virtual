package com.lojavirtual.loja_virtual.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "produto")
public class ProdutoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private boolean ativo;

    private String tipoUnidade;

    private  String nome;

    @Column(columnDefinition = "text",length = 2000)
    private String descricao;


    private double peso;
    private double largura;

    private double altura;

    private double profundidade;

    private BigDecimal valor = BigDecimal.ZERO;

    private Integer qtd = 0;

    private  Integer qtd_alerta;

    private String  linkyoutube;

    private  Boolean alertaQtdEstoque = Boolean.FALSE;

    private Integer qtdClique = 0;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Integer getQtd_alerta() {
        return qtd_alerta;
    }

    public void setQtd_alerta(Integer qtd_alerta) {
        this.qtd_alerta = qtd_alerta;
    }

    public String getLinkyoutube() {
        return linkyoutube;
    }

    public void setLinkyoutube(String linkyoutube) {
        this.linkyoutube = linkyoutube;
    }

    public Boolean getAlertaQtdEstoque() {
        return alertaQtdEstoque;
    }

    public void setAlertaQtdEstoque(Boolean alertaQtdEstoque) {
        this.alertaQtdEstoque = alertaQtdEstoque;
    }

    public Integer getQtdClique() {
        return qtdClique;
    }

    public void setQtdClique(Integer qtdClique) {
        this.qtdClique = qtdClique;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public ProdutoModel(){

    }

    @Override
    public String toString() {
        return "ProdutoModel{" +
                "id=" + id +
                ", ativo=" + ativo +
                ", tipoUnidade='" + tipoUnidade + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", peso=" + peso +
                ", largura=" + largura +
                ", altura=" + altura +
                ", profundidade=" + profundidade +
                ", valor=" + valor +
                ", qtd=" + qtd +
                ", qtd_alerta=" + qtd_alerta +
                ", linkyoutube='" + linkyoutube + '\'' +
                ", alertaQtdEstoque=" + alertaQtdEstoque +
                ", qtdClique=" + qtdClique +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoModel that = (ProdutoModel) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
