package com.lojavirtual.loja_virtual.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "imagem_produto")
public class ImagemProdutoModel implements Serializable {

    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(columnDefinition = "Text", length = 2000)
    private String imagem_original;

    @Column(columnDefinition = "Text", length = 2000)
    private String imagem_miniatura;

   @ManyToOne
   @JoinColumn(name = "produto_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "produto_fk"))
   private  ProdutoModel produtoModel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImagem_original() {
        return imagem_original;
    }

    public void setImagem_original(String imagem_original) {
        this.imagem_original = imagem_original;
    }

    public String getImagem_miniatura() {
        return imagem_miniatura;
    }

    public void setImagem_miniatura(String imagem_miniatura) {
        this.imagem_miniatura = imagem_miniatura;
    }

    public ProdutoModel getProdutoModel() {
        return produtoModel;
    }

    public void setProdutoModel(ProdutoModel produtoModel) {
        this.produtoModel = produtoModel;
    }

    public ImagemProdutoModel(){

    }

    @Override
    public String toString() {
        return "ImagemProdutoModel{" +
                "id=" + id +
                ", imagem_original='" + imagem_original + '\'' +
                ", imagem_miniatura='" + imagem_miniatura + '\'' +
                ", produtoModel=" + produtoModel +
                '}';
    }
}
