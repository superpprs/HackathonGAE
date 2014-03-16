/**
 * 
 */
package com.TCSNielsen.Hackathon.service.Interface;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.TCSNielsen.Hackathon.domain.ProductDetails;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * @author P Prasanna
 *
 */
@Service
public interface IMarketResearch {
	public List<ProductDetails> getUpcCode(String productDescription) throws JsonParseException, JsonMappingException, IOException;
	
	public ProductDetails getProductDescription(String upcCode) throws JsonParseException, JsonMappingException, IOException;

}
