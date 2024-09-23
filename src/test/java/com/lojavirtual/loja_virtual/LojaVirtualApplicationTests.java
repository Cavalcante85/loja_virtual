package com.lojavirtual.loja_virtual;

import com.lojavirtual.loja_virtual.controllers.AcessoController;
import com.lojavirtual.loja_virtual.models.AcessoModel;
import com.lojavirtual.loja_virtual.repositories.AcessoRepository;
import com.lojavirtual.loja_virtual.services.AcessoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = LojaVirtualApplication.class)
class LojaVirtualApplicationTests {

	@Autowired
	private AcessoService acessoService;

	@Autowired
	private AcessoRepository acessoRepository;

    @Autowired
	private AcessoController acessoController;




	@Test
	public void testCadastraAcesso() {

		AcessoModel acesso = new AcessoModel();

		acesso.setDescricao("ROLE_ADMIN6");

        acessoController.salvarAcesso(acesso);

	}

}
