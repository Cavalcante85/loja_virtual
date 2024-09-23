package com.lojavirtual.loja_virtual.services;


import com.lojavirtual.loja_virtual.models.AcessoModel;
import com.lojavirtual.loja_virtual.repositories.AcessoRepository;
import org.springframework.stereotype.Service;

@Service
public class AcessoService {

    private final AcessoRepository acessoRepository;

    public AcessoService(AcessoRepository acessoRepository) {

        this.acessoRepository = acessoRepository;
    }


    public AcessoModel save(AcessoModel acesso){
        return acessoRepository.save(acesso);
    }




}
