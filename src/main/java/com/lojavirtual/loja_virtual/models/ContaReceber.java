package com.lojavirtual.loja_virtual.models;

import com.lojavirtual.loja_virtual.enums.TipoContaReceberEnum;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "conta_receber")
public class ContaReceber implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private TipoContaReceberEnum status;

    @Temporal(TemporalType.DATE)
    private Date dtVenccimento;

    @Temporal(TemporalType.DATE)
    private Date dtPagamento;


    private BigDecimal valorTotal;

    private BigDecimal valorDesconto;



    @ManyToOne(targetEntity = PessoaModel.class)
    @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,name = "pessoa_fk"))
    private  PessoaModel pessoaModel;

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

    public TipoContaReceberEnum getStatus() {
        return status;
    }

    public void setStatus(TipoContaReceberEnum status) {
        this.status = status;
    }

    public Date getDtVenccimento() {
        return dtVenccimento;
    }

    public void setDtVenccimento(Date dtVenccimento) {
        this.dtVenccimento = dtVenccimento;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaReceber that = (ContaReceber) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public ContaReceber(){

    }

    @Override
    public String toString() {
        return "ContaReceber{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", status=" + status +
                ", dtVenccimento=" + dtVenccimento +
                ", dtPagamento=" + dtPagamento +
                ", valorTotal=" + valorTotal +
                ", valorDesconto=" + valorDesconto +
                ", pessoaModel=" + pessoaModel +
                '}';
    }
}
