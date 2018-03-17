/**
 * 
 */
package com.perskbox.currencyconvertcontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author susheel.reddy
 *
 */
public interface CurrencyConvertController {

	/** The Constant CONSUMES. */
	String CONSUMES = "application/json";

	/** The Constant PRODUCES. */
	String PRODUCES = "application/json";

	@PostMapping(value = "/convert", consumes = CONSUMES, produces = PRODUCES)
	@ResponseBody
	String processConvertRequest(@RequestBody String request);
}
