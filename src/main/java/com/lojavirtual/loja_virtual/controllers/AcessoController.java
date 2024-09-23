package com.lojavirtual.loja_virtual.controllers;

import com.lojavirtual.loja_virtual.models.AcessoModel;
import com.lojavirtual.loja_virtual.services.AcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class AcessoController {

    @Autowired
    private AcessoService  acessoService;

    public AcessoController(AcessoService acessoService) {
        this.acessoService = acessoService;
    }

    @ResponseBody
    @PostMapping("/salvarAcesso")
    public ResponseEntity<AcessoModel>salvarAcesso(@RequestBody AcessoModel acesso){

        AcessoModel acessoSalvo = acessoService.save(acesso);


        return new ResponseEntity<AcessoModel>(acessoSalvo, HttpStatus.OK);
    }


}
