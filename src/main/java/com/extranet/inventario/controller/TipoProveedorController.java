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

import com.extranet.inventario.model.TipoProveedor;
import com.extranet.inventario.service.TipoProveedorServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class TipoProveedorController {
	
	@Autowired
	private TipoProveedorServiceImpl _tipoProveedorService;
	
	@RequestMapping(method = RequestMethod.POST, path = "/tipoproveedores", consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<?> guardarTipoproveedor(@RequestBody TipoProveedor tipoProveedor, UriComponentsBuilder uriComponentsBuilder) {		
		TipoProveedor obj=_tipoProveedorService.registrar(tipoProveedor);
		return new ResponseEntity<TipoProveedor>(obj, HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/tipoproveedores", headers = "Accept=application/json")
	public ResponseEntity<List<TipoProveedor>> listar() {		
		List<TipoProveedor> obj=_tipoProveedorService.listar();
		return new ResponseEntity<List<TipoProveedor>>(obj, HttpStatus.OK);
	}

}
