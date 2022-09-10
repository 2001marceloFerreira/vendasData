package com.vendas.vendasdata.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vendas.vendasdata.entities.Sale;
import com.vendas.vendasdata.services.SaleService;
import com.vendas.vendasdata.services.SmsService;

//implementar a api - disponibilizar os END POINTS

@RestController
@RequestMapping(value ="/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@Autowired
	private SmsService smsService;
	
	@GetMapping
	public Page<Sale> findSales(
			@RequestParam(value = "minDate", defaultValue = "") String minDate,
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate,
			Pageable pageable){
			return service.findSales(minDate, maxDate, pageable);
		}
	@GetMapping("/notification/{id}")
	public void notifySms(@PathVariable long id) {
		smsService.sendSms(id);
	}
		
}
