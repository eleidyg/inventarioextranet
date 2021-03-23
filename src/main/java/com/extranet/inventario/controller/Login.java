package com.extranet.inventario.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
public class Login {
	
   @RequestMapping(method = RequestMethod.GET, path = "/login/{nombre}")
   public String Validación(@PathVariable String nombre) {
	   if(nombre.equals("edna")) {
		   return "Ingreso";
	   }
	   else {
		   return "No Ingreso";
	   }
   }
}
