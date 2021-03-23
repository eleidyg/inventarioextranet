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

import com.extranet.inventario.model.Allotment;
import com.extranet.inventario.service.AllotmentService;

@CrossOrigin(origins = "*")
@RestController
public class AllotmentController {
	
	@Autowired
	private AllotmentService _allotmentService;
	
	@RequestMapping(method = RequestMethod.POST, path = "/allotment", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Allotment> guardarAllotment(@RequestBody Allotment allotment, UriComponentsBuilder uriComponentsBuilder) {		
		Allotment obj=_allotmentService.registrar(allotment);
		return new ResponseEntity<Allotment>(obj, HttpStatus.CREATED);
	}

}
