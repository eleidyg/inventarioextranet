package com.extranet.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extranet.inventario.dao.AllotmentDao;
import com.extranet.inventario.model.Allotment;
import com.extranet.inventario.model.service.IAllotmentService;

@Repository
public class AllotmentService implements IAllotmentService{
	
	@Autowired
	private AllotmentDao dao;

	@Override
	public Allotment registrar(Allotment t) {
		return dao.save(t);
	}

	@Override
	public Allotment modificar(Allotment t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Allotment listarId(int d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Allotment> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
