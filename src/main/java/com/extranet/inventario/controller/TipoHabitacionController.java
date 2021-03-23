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

import com.extranet.inventario.model.TipoHabitacion;
import com.extranet.inventario.service.TipoHabitacionServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class TipoHabitacionController {

	@Autowired
	private TipoHabitacionServiceImpl _tipoHabitacionService;
	
	@RequestMapping(method = RequestMethod.POST, path = "/tipohabitacion", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TipoHabitacion> guardarTipoHabitacion(@RequestBody TipoHabitacion tipoHabitacion, UriComponentsBuilder uriComponentsBuilder) {		
		TipoHabitacion obj=_tipoHabitacionService.registrar(tipoHabitacion);
		return new ResponseEntity<TipoHabitacion>(obj, HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/tipohabitacion", headers = "Accept=application/json")
	public ResponseEntity<List<TipoHabitacion>> listar() {		
		List<TipoHabitacion> obj=_tipoHabitacionService.listar();
		return new ResponseEntity<List<TipoHabitacion>>(obj, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, path ="/tipohabitacion/{id}", headers = "Accept=application/json")
	public ResponseEntity<TipoHabitacion> getHabitacionById(@PathVariable("id") int idHabitacion){
		TipoHabitacion obj=_tipoHabitacionService.listarId(idHabitacion);
		return new ResponseEntity<TipoHabitacion>(obj, HttpStatus.OK);
	 }
}
