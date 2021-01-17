package com.extranet.inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.extranet.inventario.model.TipoProveedor;
import com.extranet.inventario.service.TipoProveedorService;

@Controller
@RequestMapping("/v1")
public class TipoProveedorController {
	
	@Autowired
	TipoProveedorService _tipoProveedorService;
	
	@PostMapping(value="/tipoproveedores",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public void guardarTipoproveedor(@RequestBody TipoProveedor tipoProveedor) {		
		_tipoProveedorService.saveTipoProveedor(tipoProveedor);
	}

}
