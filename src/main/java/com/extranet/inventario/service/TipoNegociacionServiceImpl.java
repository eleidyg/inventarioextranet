package com.extranet.inventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extranet.inventario.dao.TipoNegociacionDao;
import com.extranet.inventario.model.TipoNegociacion;
import com.extranet.inventario.model.service.ITipoNegociacion;


@Repository
public class TipoNegociacionServiceImpl implements ITipoNegociacion{
	
	@Autowired
	private TipoNegociacionDao dao;

	@Override
	public TipoNegociacion registrar(TipoNegociacion t) {
		return dao.save(t);
	}

	@Override
	public TipoNegociacion modificar(TipoNegociacion t) {
		return null;
	}

	@Override
	public void eliminar(int d) {
	}

	@Override
	public TipoNegociacion listarId(int d) {
		Optional <TipoNegociacion> op=dao.findById(d);
		return op.isPresent() ? op.get() : new TipoNegociacion();
	}

	@Override
	public List<TipoNegociacion> listar() {
		return dao.findAll();
	}
	
	
}
