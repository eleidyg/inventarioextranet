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

import com.extranet.inventario.model.Habitacion;
import com.extranet.inventario.model.Proveedor;
import com.extranet.inventario.model.ProveedorHabitacion;
import com.extranet.inventario.service.HabitacionServiceImpl;
import com.extranet.inventario.service.ProveedorHabitacionServiceImpl;


@CrossOrigin(origins = "*")
@RestController
public class HabitacionController {
	
	@Autowired
	private HabitacionServiceImpl _habitacionService;
	
	@Autowired
	private ProveedorHabitacionServiceImpl _proveedorHabitacionService;
	
	private Integer idHabitacion;
	
	private ProveedorHabitacion proveedorHabitacion=new ProveedorHabitacion();
	
	@RequestMapping(method = RequestMethod.POST, path = "/habitacion/{idproveedor}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Habitacion> guardarProveedor(@RequestBody Habitacion habitacion,
			@PathVariable("idproveedor") int idProveedor, UriComponentsBuilder uriComponentsBuilder) {		
		Habitacion obj=_habitacionService.registrar(habitacion);
		if(obj!=null) {
			idHabitacion=obj.getIdhabitacion();
			proveedorHabitacion.setIdhabitacion(idHabitacion);
			proveedorHabitacion.setIdproveedor(idProveedor);
			_proveedorHabitacionService.registrar(proveedorHabitacion);
			return new ResponseEntity<Habitacion>(obj, HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/habitacion", headers = "Accept=application/json")
	public ResponseEntity<List<Habitacion>> listar() {		
		List<Habitacion> obj=_habitacionService.listar();
		return new ResponseEntity<List<Habitacion>>(obj, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, path ="/habitacion/{id}", headers = "Accept=application/json")
	public ResponseEntity<Habitacion> getHabitacionById(@PathVariable("id") int idHabitacion){
		Habitacion obj=_habitacionService.listarId(idHabitacion);
		return new ResponseEntity<Habitacion>(obj, HttpStatus.OK);
	 }
	
	@RequestMapping(method = RequestMethod.PUT, path ="/habitacion/modificar", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Habitacion> modificarHabitacion(@RequestBody Habitacion habitacion){
		Habitacion obj=_habitacionService.modificar(habitacion);
		return new ResponseEntity<Habitacion>(obj, HttpStatus.OK);
	 }
	
	@RequestMapping(method = RequestMethod.GET, path = "/habitacion/provee/{idHabitacion}", headers = "Accept=application/json")
	public ResponseEntity<String> listarHabitacionTipoProveedor(@PathVariable("idHabitacion") Integer idHabitacion) {		
		String obj=_habitacionService.listarHabitacionProveedor(idHabitacion);
		return new ResponseEntity<String>(obj, HttpStatus.OK);
	}
}
