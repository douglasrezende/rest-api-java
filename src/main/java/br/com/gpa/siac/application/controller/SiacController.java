package br.com.gpa.siac.application.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gpa.siac.application.model.NotaCredito;


@RestController
public class SiacController {
	@RequestMapping(method=RequestMethod.POST, path = "/", 
			consumes = {MediaType.APPLICATION_JSON_VALUE}, 
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Map<String, String>> criarNotaCredito(@RequestParam("operacao") String operacao,
			@RequestBody NotaCredito notaCredito) throws JSONException{
		Map<String, String> body = new LinkedHashMap<>();
		if (notaCredito.getNumDocumento() != null || !notaCredito.getNumDocumento().isEmpty()){
        	
    		body.put("codResposta", "0");
    		body.put("mensagem", "ok");
    		  return new ResponseEntity<>(body, HttpStatus.OK);
        }else{
        	  return new ResponseEntity<>( HttpStatus.BAD_REQUEST);	
        }
		
        
	}

	@RequestMapping(value="/{voucher}")
	@ResponseBody
	public ResponseEntity<Map<String, String>> getDadosVoucher(@PathVariable("voucher") String voucher){
		Map<String, String> body = new LinkedHashMap<>();
		body.put("codResposta", "0");
		body.put("mensagem", "ok");
		body.put("numVias", "2");
		body.put("dadosCupom", "");
		body.put("deviceValue", "");		
		return new ResponseEntity<>(body, HttpStatus.OK);
		
		
	}
}
