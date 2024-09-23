package com.lojavirtual.loja_virtual.models;

import jakarta.persistence.*;
import org.springframework.data.repository.query.SpelQueryContext;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "nota_fiscal_compra")
public class NotaFiscalCompraModel implements Serializable {

private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private long id;

private  String numeroNota;

private  String serieNota;

private  String descricaoObs;

private BigDecimal valorTotal;

private BigDecimal valorDesconto;

private  BigDecimal valorIcms;
@Temporal(TemporalType.DATE)
private Date dataCompra;

@ManyToOne
@JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
private PessoaModel pessoaModel;

@ManyToOne
@JoinColumn(name = "conta_pagar_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "conta_pagar_fk"))
private ContaPagar contaPagar;

    public PessoaModel getPessoaModel() {
        return pessoaModel;
    }

    public void setPessoaModel(PessoaModel pessoaModel) {
        this.pessoaModel = pessoaModel;
    }

    public ContaPagar getContaPagar() {
        return contaPagar;
    }

    public void setContaPagar(ContaPagar contaPagar) {
        this.contaPagar = contaPagar;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(String numeroNota) {
        this.numeroNota = numeroNota;
    }

    public String getSerieNota() {
        return serieNota;
    }

    public void setSerieNota(String serieNota) {
        this.serieNota = serieNota;
    }

    public String getDescricaoObs() {
        return descricaoObs;
    }

    public void setDescricaoObs(String descricaoObs) {
        this.descricaoObs = descricaoObs;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public BigDecimal getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(BigDecimal valorIcms) {
        this.valorIcms = valorIcms;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public NotaFiscalCompraModel(){

    }


    @Override
    public String toString() {
        return "NotaFiscalCompraModel{" +
                "id=" + id +
                ", numeroNota='" + numeroNota + '\'' +
                ", serieNota='" + serieNota + '\'' +
                ", descricaoObs='" + descricaoObs + '\'' +
                ", valorTotal=" + valorTotal +
                ", valorDesconto=" + valorDesconto +
                ", valorIcms=" + valorIcms +
                ", dataCompra=" + dataCompra +
                ", pessoaModel=" + pessoaModel +
                ", contaPagar=" + contaPagar +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotaFiscalCompraModel that = (NotaFiscalCompraModel) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
