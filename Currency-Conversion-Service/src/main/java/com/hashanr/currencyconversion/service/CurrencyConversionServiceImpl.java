package com.hashanr.currencyconversion.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hashanr.currencyconversion.model.CurrencyExchangeData;

@Service
public class CurrencyConversionServiceImpl implements CurrencyConversionService {

	@Override
	public CurrencyExchangeData convertCurrency(String baseCurrency, String quoteCurrency, BigDecimal quantity) {
		
		Map<String,String>uriVariables=new HashMap<>();
		uriVariables.put("baseCurrency", baseCurrency);
		uriVariables.put("quoteCurrency", quoteCurrency);
		
		
		 
		ResponseEntity<CurrencyExchangeData> entity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/base/{baseCurrency}/quote/{quoteCurrency}", CurrencyExchangeData.class,uriVariables);
		
		CurrencyExchangeData response=entity.getBody();
		
		
		return new CurrencyExchangeData(response.getId(),baseCurrency,quoteCurrency,response.getExchangeRate(),quantity,quantity.multiply(response.getExchangeRate()),response.getPort());
	}
	
	
}
