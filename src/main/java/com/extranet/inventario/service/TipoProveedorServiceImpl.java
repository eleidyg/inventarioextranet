package com.extranet.inventario.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extranet.inventario.dao.TipoProveedorDao;
import com.extranet.inventario.model.TipoProveedor;



@Service("tipoProveedorService")
@Transactional
public class TipoProveedorServiceImpl implements TipoProveedorService{
	
	@Autowired
	private TipoProveedorDao _tipoProveedorDao;
	
	@Override
	public void saveTipoProveedor(TipoProveedor tipoProveedor) {
		_tipoProveedorDao.saveTipoProveedor(tipoProveedor);
		
	}

}
