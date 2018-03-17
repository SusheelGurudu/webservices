/**
 * 
 */
package com.perskbox.currencyconvertserviceimpl;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.perskbox.currencyconvertservice.CurrencyConvertService;

/**
 * @author susheel.reddy
 *
 */
@Service("CurrencyExchange")
public class CurrencyConvertServiceImpl implements CurrencyConvertService {

	@Override
	public String processCurrencyConvert(String request) {
		// TODO Auto-generated method stub

		return parseRequest(request);
	}

	private String parseRequest(String request) {
		// TODO Auto-generated method stub
		try {
			JSONObject obj = new JSONObject(request);
			String currencyTo = obj.getJSONObject("queryResult")
					.getJSONObject("parameters").getString("currency-to");
			String currencyFrom = obj.getJSONObject("queryResult")
					.getJSONObject("parameters").getString("currency-from");
			String amount = obj.getJSONObject("queryResult")
					.getJSONObject("parameters").getString("amount");
			return convertCurrency(currencyTo, currencyFrom, amount);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Unable to parse, please enter proper values";
	}

	private String convertCurrency(String currencyTo, String currencyFrom,
			String amount) {
		// TODO Auto-generated method stub
		Double factor = 65.04;
		if (amount == null) {
			return "A dollar is equal to " + factor.toString() + " rupees";
		} else {
			Double requestAmount = Double.parseDouble(amount);
			Double responseAmount = requestAmount * factor;
			return responseAmount.toString();
		}
	}

}
