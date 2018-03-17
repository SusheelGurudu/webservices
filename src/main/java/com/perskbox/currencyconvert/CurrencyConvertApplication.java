package com.perskbox.currencyconvert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.perskbox.currencyconvertcontrollerimpl.CurrencyConvertControllerImpl;
import com.perskbox.currencyconvertserviceimpl.CurrencyConvertServiceImpl;

@SpringBootApplication
@ComponentScan(basePackageClasses = { WebConfig.class,
		CurrencyConvertControllerImpl.class, CurrencyConvertServiceImpl.class,
		CurrencyConvertApplication.class })
public class CurrencyConvertApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConvertApplication.class, args);
	}
}
