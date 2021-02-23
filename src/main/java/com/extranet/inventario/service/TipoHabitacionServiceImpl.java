package com.extranet.inventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extranet.inventario.dao.TipoHabitacionDao;
import com.extranet.inventario.model.Habitacion;
import com.extranet.inventario.model.TipoHabitacion;
import com.extranet.inventario.model.service.ITipoHabitacion;

@Repository
public class TipoHabitacionServiceImpl implements ITipoHabitacion{
	
	@Autowired
	private TipoHabitacionDao dao;

	@Override
	public TipoHabitacion registrar(TipoHabitacion t) {
		return dao.save(t);
	}

	@Override
	public TipoHabitacion modificar(TipoHabitacion t) {
		
		return null;
	}

	@Override
	public void eliminar(int d) {
		
		
	}

	@Override
	public TipoHabitacion listarId(int d) {
		Optional <TipoHabitacion> op=dao.findById(d);
		return op.isPresent() ? op.get() : new TipoHabitacion();
	}

	@Override
	public List<TipoHabitacion> listar() {
		return dao.findAll();
	}

}
