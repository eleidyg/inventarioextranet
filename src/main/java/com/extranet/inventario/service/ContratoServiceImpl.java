package com.extranet.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extranet.inventario.dao.ContratoDao;
import com.extranet.inventario.model.Contrato;
import com.extranet.inventario.model.service.IContratoService;

@Repository
public class ContratoServiceImpl implements IContratoService{
	
	@Autowired
	private ContratoDao dao;

	@Override
	public Contrato registrar(Contrato t) {
		return dao.save(t);
	}

	@Override
	public Contrato modificar(Contrato t) {
		return null;
	}

	@Override
	public void eliminar(int d) {
		
		
	}

	@Override
	public Contrato listarId(int d) {
		return null;
	}

	@Override
	public List<Contrato> listar() {
		return null;
	}

}
