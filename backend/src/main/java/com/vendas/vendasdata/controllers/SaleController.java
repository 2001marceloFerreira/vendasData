package com.vendas.vendasdata.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendas.vendasdata.entities.Sale;
import com.vendas.vendasdata.services.SaleService;

//implementar a api - disponibilizar os END POINTS

@RestController
@RequestMapping(value ="/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public List<Sale> findSales(){
			return service.findSales();
		}
		
}
