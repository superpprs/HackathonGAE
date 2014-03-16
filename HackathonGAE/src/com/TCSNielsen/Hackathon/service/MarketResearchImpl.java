/**
 * 
 */
package com.TCSNielsen.Hackathon.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.TCSNielsen.Hackathon.domain.ProductDetails;
import com.TCSNielsen.Hackathon.service.Interface.IMarketResearch;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author P Prasanna
 * 
 */
@Service
public class MarketResearchImpl implements IMarketResearch {

	static final RestTemplate restTemplate = new RestTemplate();
	static final ObjectMapper mapper = new ObjectMapper();
	static {
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
				false);
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,
				true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.TCSNielsen.Hackathon.service.Interface.IMarketResearch#getUPCCode
	 * (java.lang.String)
	 */
	@Override
	public List<ProductDetails> getUpcCode(String productDescription)
			throws JsonParseException, JsonMappingException, IOException {
		String url = "https://nielsen.api.tibco.com:443/Products/v1?search="
				+ productDescription
				+ "&apikey=6244-5e592e49-624d-431c-acdc-cccf606ced24";
		return getProductsList(url, "ProductDetails");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.TCSNielsen.Hackathon.service.Interface.IMarketResearch#
	 * getProductDescription(java.lang.String)
	 */
	@Override
	public ProductDetails getProductDescription(String upcCode)
			throws JsonParseException, JsonMappingException, IOException {
		String url = "https://nielsen.api.tibco.com/Products/v1/" + upcCode
				+ "?apikey=6244-5e592e49-624d-431c-acdc-cccf606ced24";
		return getProductsList(url, "Characteristics").get(0);
	}

	@SuppressWarnings("unchecked")
	private List<ProductDetails> getProductsList(String url,
			String fetchParamName) throws JsonParseException,
			JsonMappingException, IOException {
		String products = restTemplate.getForObject(url, String.class);
		Map<String, Object> details = mapper.readValue(products, Map.class);
		return mapper.convertValue(
				details.get(fetchParamName),
				mapper.getTypeFactory().constructCollectionType(List.class,
						ProductDetails.class));
	}

}