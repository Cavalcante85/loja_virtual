package com.lojavirtual.loja_virtual.models;

import com.lojavirtual.loja_virtual.enums.TipoContaPagarEnum;
import com.lojavirtual.loja_virtual.enums.TipoContaReceberEnum;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "conta_pagar")
public class ContaPagar implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String descricao;

    private BigDecimal valorTotal;

    private BigDecimal valorDesconto;

    @Temporal(TemporalType.DATE)
    private Date dtVencimento;

    @Temporal(TemporalType.DATE)
    private Date dtPagamento;

    @Enumerated(EnumType.STRING)
    private TipoContaPagarEnum status;

    @ManyToOne(targetEntity = PessoaModel.class)
    @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,name = "pessoa_fk"))
    private  PessoaModel pessoaModel;

    @ManyToOne(targetEntity = PessoaModel.class)
    @JoinColumn(name = "pessoa_forn_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,name = "pessoa_forn_fk"))
    private  PessoaModel pessoaFornecedor;


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


    public Date getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public Date getDtPagamento() {
        return dtPagamento;
    }

    public void setDtPagamento(Date dtPagamento) {
        this.dtPagamento = dtPagamento;
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

    public PessoaModel getPessoaModel() {
        return pessoaModel;
    }

    public void setPessoaModel(PessoaModel pessoaModel) {
        this.pessoaModel = pessoaModel;
    }

    public void setStatus(TipoContaPagarEnum status) {
        this.status = status;
    }

    public PessoaModel getPessoaFornecedor() {
        return pessoaFornecedor;
    }

    public void setPessoaFornecedor(PessoaModel pessoaFornecedor) {
        this.pessoaFornecedor = pessoaFornecedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaPagar that = (ContaPagar) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public ContaPagar(){

    }

    @Override
    public String toString() {
        return "ContaPagar{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", valorTotal=" + valorTotal +
                ", valorDesconto=" + valorDesconto +
                ", dtVencimento=" + dtVencimento +
                ", dtPagamento=" + dtPagamento +
                ", status=" + status +
                ", pessoaModel=" + pessoaModel +
                ", pessoaFornecedor=" + pessoaFornecedor +
                '}';
    }
}
