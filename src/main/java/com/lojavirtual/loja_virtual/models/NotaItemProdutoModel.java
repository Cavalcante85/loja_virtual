package com.lojavirtual.loja_virtual.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "nota_item_produto")
public class NotaItemProdutoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;


    private double qtd;

    @ManyToOne
    @JoinColumn(name = "nota_fiscal_compra_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "nota_fiscal_compra_fk")
    )
    private NotaFiscalCompraModel notaFiscalCompraModel;


    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "produto_item_fk"))
    private ProdutoModel produtoModel;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public NotaFiscalCompraModel getNotaFiscalCompraModel() {
        return notaFiscalCompraModel;
    }

    public void setNotaFiscalCompraModel(NotaFiscalCompraModel notaFiscalCompraModel) {
        this.notaFiscalCompraModel = notaFiscalCompraModel;
    }

    public ProdutoModel getProdutoModel() {
        return produtoModel;
    }

    public void setProdutoModel(ProdutoModel produtoModel) {
        this.produtoModel = produtoModel;
    }

 public NotaItemProdutoModel(){

 }

    @Override
    public String toString() {
        return "NotaItemProdutoModel{" +
                "id=" + id +
                ", qtd=" + qtd +
                ", notaFiscalCompraModel=" + notaFiscalCompraModel +
                ", produtoModel=" + produtoModel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotaItemProdutoModel that = (NotaItemProdutoModel) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
