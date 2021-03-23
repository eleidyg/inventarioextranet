package com.extranet.inventario.controller;

import java.util.List;

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
import com.extranet.inventario.model.TipoNegociacion;
import com.extranet.inventario.service.TipoNegociacionServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class TipoNegocacionController {
	
	@Autowired
	private TipoNegociacionServiceImpl _tipoNegociacionService;
	
	@RequestMapping(method = RequestMethod.POST, path = "/tiponegociacion", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TipoNegociacion> guardarTipoNegociacion(@RequestBody TipoNegociacion tipoNegociacion, UriComponentsBuilder uriComponentsBuilder) {		
		TipoNegociacion obj=_tipoNegociacionService.registrar(tipoNegociacion);
		return new ResponseEntity<TipoNegociacion>(obj, HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/tiponegociacion", headers = "Accept=application/json")
	public ResponseEntity<List<TipoNegociacion>> listar() {		
		List<TipoNegociacion> obj=_tipoNegociacionService.listar();
		return new ResponseEntity<List<TipoNegociacion>>(obj, HttpStatus.OK);
	}
	
}
