package com.hashanr.currencyexchange.model;


import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.GeneratorType;

@Entity
public class ExchangeData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//From Currency
	private String baseCurrency;
	
	//To Currency
	private String quoteCurrency;
	
	//Ex : USD(Base Currency)/EUR(Quote Currency) = Exchange Rate
	private BigDecimal exchangeRate;
	
	//This value dosen't create column in database and store in database and we only use here for serialization and dezerialization
	@Transient
	private int port;
	

	public ExchangeData() {
		super();
		
	}


	public ExchangeData(Integer id, String baseCurrency, String quoteCurrency, BigDecimal exchangeRate, int port) {
		super();
		this.id = id;
		this.baseCurrency = baseCurrency;
		this.quoteCurrency = quoteCurrency;
		this.exchangeRate = exchangeRate;
		this.port = port;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getBaseCurrency() {
		return baseCurrency;
	}


	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}


	public String getQuoteCurrency() {
		return quoteCurrency;
	}


	public void setQuoteCurrency(String quoteCurrency) {
		this.quoteCurrency = quoteCurrency;
	}


	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}


	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}


	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
