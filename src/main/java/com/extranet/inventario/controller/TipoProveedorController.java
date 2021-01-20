package com.extranet.inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.extranet.inventario.model.TipoProveedor;
import com.extranet.inventario.service.TipoProveedorService;

@CrossOrigin(origins = "*")
@RestController
public class TipoProveedorController {
	
	@Autowired
	TipoProveedorService _tipoProveedorService;
	
	@RequestMapping(method = RequestMethod.POST, path = "/tipoproveedores", consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<?> guardarTipoproveedor(@RequestBody TipoProveedor tipoProveedor, UriComponentsBuilder uriComponentsBuilder) {		
		_tipoProveedorService.saveTipoProveedor(tipoProveedor);
		TipoProveedor tipoProveedor1=_tipoProveedorService.findByNombreTipoProveedor(tipoProveedor.getNombreTipoProveedor());
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(
				uriComponentsBuilder.path("/v1/tipoprovedores/{id}")
				.buildAndExpand(tipoProveedor1.getIdtipoProveedor())
				.toUri()
				);
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

}
