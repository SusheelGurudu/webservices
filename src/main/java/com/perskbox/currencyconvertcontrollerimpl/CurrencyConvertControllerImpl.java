/**
 * 
 */
package com.perskbox.currencyconvertcontrollerimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.perskbox.currencyconvertcontroller.CurrencyConvertController;
import com.perskbox.currencyconvertservice.CurrencyConvertService;

/**
 * @author susheel.reddy
 *
 */
@RestController
public class CurrencyConvertControllerImpl implements CurrencyConvertController {

	@Autowired
	private CurrencyConvertService currencyConvertService;

	@Override
	@ResponseStatus(HttpStatus.OK)
	public String processConvertRequest(@RequestBody String request) {
		// TODO Auto-generated method stub
		return currencyConvertService.processCurrencyConvert(request);
	}

}
