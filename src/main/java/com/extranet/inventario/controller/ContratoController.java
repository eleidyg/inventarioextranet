package com.extranet.inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.extranet.inventario.model.Contrato;
import com.extranet.inventario.service.ContratoServiceImpl;



@CrossOrigin(origins = "*")
@RestController
public class ContratoController {
	
	@Autowired
	private ContratoServiceImpl _contratoService;
	
	@RequestMapping(method = RequestMethod.POST, path = "/contrato", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Contrato> guardarContrato(@RequestBody Contrato contrato, UriComponentsBuilder uriComponentsBuilder) {		
		Contrato obj=_contratoService.registrar(contrato);
		return new ResponseEntity<Contrato>(obj, HttpStatus.CREATED);
	}

}
