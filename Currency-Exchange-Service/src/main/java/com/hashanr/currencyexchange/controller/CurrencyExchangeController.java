package com.hashanr.currencyexchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hashanr.currencyexchange.model.ExchangeData;
import com.hashanr.currencyexchange.service.ExchangeService;

@RestController
@RequestMapping("/currency-exchange")
public class CurrencyExchangeController {
	
	@Autowired
	ExchangeService exchangeService;
	
	@GetMapping("base/{baseCurrency}/quote/{quoteCurrency}")
	public ExchangeData getExchangeRate(@PathVariable String baseCurrency,@PathVariable String quoteCurrency)
	{
		return exchangeService.getExchangeRate(baseCurrency, quoteCurrency);
	}
	

}
