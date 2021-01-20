package com.extranet.inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.extranet.inventario.model.Proveedor;
import com.extranet.inventario.service.ProveedoresService;


@Controller
@RequestMapping("/v1")
public class ProveedoresController {
	
	@Autowired
	ProveedoresService _proveedoresService;
	
	@PostMapping(value="/proveedores",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<?> guardarProveedor(@RequestBody Proveedor proveedor, UriComponentsBuilder uriComponentsBuilder) {		
		_proveedoresService.saveProveedor(proveedor);
		Proveedor proveedor1=_proveedoresService.findByName(proveedor.getNombre());
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(
				uriComponentsBuilder.path("/v1/provedores/{id}")
				.buildAndExpand(proveedor1.getIdproveedor())
				.toUri()
				);
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}
}
