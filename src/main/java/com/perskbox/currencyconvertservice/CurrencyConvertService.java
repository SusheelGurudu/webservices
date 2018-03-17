/**
 * 
 */
package com.perskbox.currencyconvertservice;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

/**
 * @author susheel.reddy
 *
 */
@Validated
public interface CurrencyConvertService {

	String processCurrencyConvert(@Valid String request);

}
