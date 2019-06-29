package com.hashanr.currencyexchange.service;

import com.hashanr.currencyexchange.model.ExchangeData;

public interface ExchangeService {
	
	ExchangeData getExchangeRate(String baseCurrency,String quoteCurrency);

}
