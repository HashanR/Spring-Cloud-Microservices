package com.hashanr.currencyconversion.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.hashanr.currencyconversion.model.CurrencyExchangeData;


public interface CurrencyConversionService {

	CurrencyExchangeData convertCurrency(String baseCurrency,String quoteCurrency,BigDecimal quantity);
	
	
	
}
