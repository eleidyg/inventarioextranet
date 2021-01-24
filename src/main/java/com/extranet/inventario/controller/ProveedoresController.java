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

import com.extranet.inventario.model.Proveedor;
import com.extranet.inventario.service.ProveedoresServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class ProveedoresController {
	
	@Autowired
	private ProveedoresServiceImpl _proveedoresService;
	
	@RequestMapping(method = RequestMethod.POST, path = "/proveedores", consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<?> guardarProveedor(@RequestBody Proveedor proveedor, UriComponentsBuilder uriComponentsBuilder) {		
		Proveedor obj=_proveedoresService.registrar(proveedor);
		return new ResponseEntity<Proveedor>(obj, HttpStatus.CREATED);
	}
}
