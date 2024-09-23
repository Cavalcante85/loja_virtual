package com.lojavirtual.loja_virtual.enums;

public enum TipoContaReceberEnum {

    COBRANCA("pagar"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    QUITADA("Quitada");

    private String  descricao;


    TipoContaReceberEnum(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return this.descricao;
    }
}
