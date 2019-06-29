package com.hashanr.currencyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hashanr.currencyexchange.model.ExchangeData;

@Repository
public interface ExchangeDataRepository extends JpaRepository<ExchangeData, Integer> {

	ExchangeData findByBaseCurrencyAndQuoteCurrency(String baseCurrency, String quoteCurrency);
}
