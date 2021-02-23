package com.extranet.inventario.model.service;

import java.util.List;

import com.extranet.inventario.model.Habitacion;

public interface IHabitacionService extends ICRUD<Habitacion>{
	
	List<String> listarHabitacionProveedor(Integer idHabitacion);
	
	List<String> consultarHabitacionTipoProveedor();

}
