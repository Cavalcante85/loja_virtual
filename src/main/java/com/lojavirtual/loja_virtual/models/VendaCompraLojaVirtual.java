package com.lojavirtual.loja_virtual.models;


import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name ="venda_compra_loja_virtual")
public class VendaCompraLojaVirtual implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne(targetEntity = PessoaModel.class)
    @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,name = "pessoa_vd_fk"))
    private  PessoaModel pessoa;


    @ManyToOne(targetEntity = EnderecoModel.class)
    @JoinColumn(name = "endereco_entrega_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,name = "endereco_entrega_fk"))
    private  EnderecoModel enderecoEntrega;

    @ManyToOne(targetEntity = EnderecoModel.class)
    @JoinColumn(name = "endereco_cobranca_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,name = "endereco_cobranca_fk"))
    private  EnderecoModel enderecoCobranca;


    @ManyToOne(targetEntity = FormaPagamentoModel.class)
    @JoinColumn(name = "forma_pg_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,name = "forma_pg_fk"))
    private FormaPagamentoModel formaPagamento;


    @OneToOne
    @JoinColumn(name = "nota_fiscal_venda_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "nota_fiscal_venda_fk"))
    private NotaFiscalvendaModel notaFiscalvenda;

    @ManyToOne(targetEntity = CupDesc.class)
    @JoinColumn(name = "cupom_desc_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "cupom_desc_fk"))
    private CupDesc cupDesc;

    private BigDecimal valorTotal;

    private BigDecimal valorDesconto;

    private BigDecimal valorFrete;

    private Integer diaEntrega;

    @Temporal(TemporalType.DATE)
    private Date dataVenda;

    @Temporal(TemporalType.DATE)
    private Date dataEntrega;

    public VendaCompraLojaVirtual(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PessoaModel getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaModel pessoa) {
        this.pessoa = pessoa;
    }

    public EnderecoModel getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(EnderecoModel enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public EnderecoModel getEnderecoCobranca() {
        return enderecoCobranca;
    }

    public void setEnderecoCobranca(EnderecoModel enderecoCobranca) {
        this.enderecoCobranca = enderecoCobranca;
    }

    public FormaPagamentoModel getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamentoModel formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public NotaFiscalvendaModel getNotaFiscalvenda() {
        return notaFiscalvenda;
    }

    public void setNotaFiscalvenda(NotaFiscalvendaModel notaFiscalvenda) {
        this.notaFiscalvenda = notaFiscalvenda;
    }

    public CupDesc getCupDesc() {
        return cupDesc;
    }

    public void setCupDesc(CupDesc cupDesc) {
        this.cupDesc = cupDesc;
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

    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
    }

    public Integer getDiaEntrega() {
        return diaEntrega;
    }

    public void setDiaEntrega(Integer diaEntrega) {
        this.diaEntrega = diaEntrega;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }


    @Override
    public String toString() {
        return "VendaCompraLojaVirtual{" +
                "id=" + id +
                ", pessoa=" + pessoa +
                ", enderecoEntrega=" + enderecoEntrega +
                ", enderecoCobranca=" + enderecoCobranca +
                ", formaPagamento=" + formaPagamento +
                ", notaFiscalvenda=" + notaFiscalvenda +
                ", cupDesc=" + cupDesc +
                ", valorTotal=" + valorTotal +
                ", valorDesconto=" + valorDesconto +
                ", valorFrete=" + valorFrete +
                ", diaEntrega=" + diaEntrega +
                ", dataVenda=" + dataVenda +
                ", dataEntrega=" + dataEntrega +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendaCompraLojaVirtual that = (VendaCompraLojaVirtual) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
