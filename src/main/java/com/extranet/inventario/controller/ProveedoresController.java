package com.extranet.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.extranet.inventario.model.Proveedor;
import com.extranet.inventario.model.TipoNegociacion;
import com.extranet.inventario.model.TipoProveedor;
import com.extranet.inventario.service.ProveedoresServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class ProveedoresController {
	
	@Autowired
	private ProveedoresServiceImpl _proveedoresService;
	
	@RequestMapping(method = RequestMethod.POST, path = "/proveedores", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Proveedor> guardarProveedor(@RequestBody Proveedor proveedor, UriComponentsBuilder uriComponentsBuilder) {		
		Proveedor obj=_proveedoresService.registrar(proveedor);
		return new ResponseEntity<Proveedor>(obj, HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET, path ="/proveedores/{id}", headers = "Accept=application/json")
	public ResponseEntity<Proveedor> getProveedorById(@PathVariable("id") int idTipoProveedor){
		Proveedor obj=_proveedoresService.listarId(idTipoProveedor);
		return new ResponseEntity<Proveedor>(obj, HttpStatus.OK);
	 }
	
	@RequestMapping(method = RequestMethod.GET, path = "/proveedoresnombre/{nombre}", headers = "Accept=application/json")
	public ResponseEntity<List<String>> listarPorNombre(@PathVariable("nombre") String nombreProveedor) {		
		List<String> obj=_proveedoresService.listarNombreProveedor(nombreProveedor);
		return new ResponseEntity<List<String>>(obj, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/proveedores", headers = "Accept=application/json")
	public ResponseEntity<List<Proveedor>> listar() {		
		List<Proveedor> obj=_proveedoresService.listar();
		return new ResponseEntity<List<Proveedor>>(obj, HttpStatus.OK);
	}
}
