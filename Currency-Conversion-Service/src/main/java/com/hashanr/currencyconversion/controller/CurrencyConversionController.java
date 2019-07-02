package com.hashanr.currencyconversion.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hashanr.currencyconversion.model.CurrencyExchangeData;
import com.hashanr.currencyconversion.service.CurrencyConversionService;

@RestController
@RequestMapping("/currency-conversion")
public class CurrencyConversionController {
	
	@Autowired
	CurrencyConversionService currencyConversionService;
	
	@GetMapping("/base/{baseCurrency}/quote/{quoteCurrency}/quantity/{quantity}")
	public CurrencyExchangeData convertCurrency(@PathVariable String baseCurrency,@PathVariable String quoteCurrency,@PathVariable BigDecimal quantity)
	{
		return currencyConversionService.convertCurrency(baseCurrency, quoteCurrency, quantity);
	}
	
	@GetMapping("xxx")
	public String get() {
		return "Hello";
	}

}
