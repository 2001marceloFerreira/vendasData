package com.vendas.vendasdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.vendasdata.entities.Sale;

//responsavel para acessar o BD


public interface SaleRepository extends JpaRepository<Sale, Long>{

}
