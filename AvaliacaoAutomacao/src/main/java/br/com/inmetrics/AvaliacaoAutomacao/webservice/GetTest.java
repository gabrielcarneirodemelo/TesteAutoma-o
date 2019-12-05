package br.com.inmetrics.AvaliacaoAutomacao.webservice;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.data.web.JsonPath;

public class GetTest {
	
	@Test
	public void requisicaoGet() throws ClientProtocolException, IOException {
	
	
		
		// Given
	    HttpUriRequest request = new HttpGet("http://swapi.co/api/films/");
	 
	    
	    // When
	    HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
	    
	    
	    
	    HttpEntity entity = httpResponse.getEntity();
	    String responseString = EntityUtils.toString(entity, "UTF-8");
	    System.out.println(responseString);
	       
        
        // Then
	    assertThat(
	    httpResponse.getStatusLine().getStatusCode(),equalTo(HttpStatus.SC_OK));
		
	      
	}

}
