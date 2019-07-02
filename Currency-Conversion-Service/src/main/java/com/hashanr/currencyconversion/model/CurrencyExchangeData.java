package com.hashanr.currencyconversion.model;

import java.math.BigDecimal;

public class CurrencyExchangeData {
	
	
	private Integer id;
	private String baseCurrency;
	private String quoteCurrency;
	private BigDecimal exchangeRate;
	private BigDecimal quantity;
	private BigDecimal total;
	private int port;
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
	
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public CurrencyExchangeData(Integer id, String baseCurrency, String quoteCurrency, BigDecimal amount,
			BigDecimal quantity, BigDecimal total, int port) {
		super();
		this.id = id;
		this.baseCurrency = baseCurrency;
		this.quoteCurrency = quoteCurrency;
		this.exchangeRate = amount;
		this.quantity = quantity;
		this.total = total;
		this.port = port;
	}
	public CurrencyExchangeData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
	
	
	
	

}
