package com.extranet.inventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extranet.inventario.dao.HabitacionDao;
import com.extranet.inventario.dao.TipoHabitacionDao;
import com.extranet.inventario.model.Habitacion;
import com.extranet.inventario.model.Proveedor;
import com.extranet.inventario.model.service.IHabitacionService;

@Repository
public class HabitacionServiceImpl implements IHabitacionService{
	
	@Autowired
	private HabitacionDao dao;
	
	@Override
	public Habitacion registrar(Habitacion t) {
		return dao.save(t);
	}

	@Override
	public Habitacion modificar(Habitacion t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Habitacion listarId(int d) {
		Optional <Habitacion> op=dao.findById(d);
		return op.isPresent() ? op.get() : new Habitacion();
	}

	@Override
	public List<Habitacion> listar() {
		return dao.findAll();
	}
	
	@Override
	public List<String> listarHabitacionProveedor(Integer idHabitacion) {
		return dao.consultarHabitacionProveedor(idHabitacion);
	}
	
	@Override
	public List<String> consultarHabitacionTipoProveedor() {
		return dao.consultarHabitacionTipoProveedor();
	}
	

}
