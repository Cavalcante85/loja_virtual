package com.lojavirtual.loja_virtual.enums;


public enum TipoEnderecoEnum {

    COBRANCA("cobrança"),
    ENTREGA("Entrega");

    private String descricao;

    private TipoEnderecoEnum(String descricao){
        this.descricao = descricao;
    }

    public String toString(){
        return  this.descricao;
    }


}
