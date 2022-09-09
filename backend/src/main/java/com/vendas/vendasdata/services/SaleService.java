package com.vendas.vendasdata.services;
//regras de negocio- implementar - operacao

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendas.vendasdata.entities.Sale;
import com.vendas.vendasdata.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales() {
		return repository.findAll();
		
	}
}
