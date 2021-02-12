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

import com.extranet.inventario.model.Habitacion;
import com.extranet.inventario.model.Proveedor;
import com.extranet.inventario.service.HabitacionServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class HabitacionController {
	
	@Autowired
	private HabitacionServiceImpl _habitacionService;
	
	@RequestMapping(method = RequestMethod.POST, path = "/habitacion", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Habitacion> guardarProveedor(@RequestBody Habitacion habitacion, UriComponentsBuilder uriComponentsBuilder) {		
		Habitacion obj=_habitacionService.registrar(habitacion);
		return new ResponseEntity<Habitacion>(obj, HttpStatus.CREATED);
	}

}
