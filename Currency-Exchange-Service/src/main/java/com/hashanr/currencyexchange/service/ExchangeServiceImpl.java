package com.hashanr.currencyexchange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.hashanr.currencyexchange.model.ExchangeData;
import com.hashanr.currencyexchange.repository.ExchangeDataRepository;

@Service
public class ExchangeServiceImpl implements ExchangeService {

	@Autowired
	private ExchangeDataRepository exchangeDataRepository;
	
	@Autowired
	private Environment environment; 
	
	@Override
	public ExchangeData getExchangeRate(String baseCurrency, String quoteCurrency) {
		
		ExchangeData exchangeData=exchangeDataRepository.findByBaseCurrencyAndQuoteCurrency(baseCurrency, quoteCurrency);
		
		exchangeData.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		
		return exchangeData;
		
		
		
	}

}
