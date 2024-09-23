package com.lojavirtual.loja_virtual.enums;

public enum TipoContaPagarEnum {

    COBRANCA("pagar"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    QUITADA("Quitada");

    private String  descricao;


    TipoContaPagarEnum(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return this.descricao;
    }
}
