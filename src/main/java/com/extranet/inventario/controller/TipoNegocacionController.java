package com.extranet.inventario.controller;

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
import com.extranet.inventario.model.TipoNegociacion;
import com.extranet.inventario.service.TipoNegociacionServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class TipoNegocacionController {
	
	@Autowired
	private TipoNegociacionServiceImpl _tipoNegociacionService;
	
	@RequestMapping(method = RequestMethod.POST, path = "/tiponegocacion", consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<?> guardarTipoproveedor(@RequestBody TipoNegociacion tipoNegociacion, UriComponentsBuilder uriComponentsBuilder) {		
		TipoNegociacion obj=_tipoNegociacionService.registrar(tipoNegociacion);
		return new ResponseEntity<TipoNegociacion>(obj, HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET, path ="/tiponegocacion/{id}", headers = "Accept=application/json")
	public ResponseEntity<TipoNegociacion> getTipoNegociacionById(@PathVariable("id") int idTipoNegociacion){
		TipoNegociacion obj=_tipoNegociacionService.listarId(idTipoNegociacion);
		if(obj.getIdtipoNegociacion()==null) {
			
		}
		return new ResponseEntity<TipoNegociacion>(obj, HttpStatus.OK);
	 }
	
}
