package com.lojavirtual.loja_virtual.repositories;

import com.lojavirtual.loja_virtual.models.AcessoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AcessoRepository extends JpaRepository<AcessoModel, Long> {





}
