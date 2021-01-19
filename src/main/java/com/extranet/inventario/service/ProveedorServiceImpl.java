package com.extranet.inventario.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extranet.inventario.dao.ProveedoresDao;
import com.extranet.inventario.model.Proveedor;


@Service("proveedorService")
@Transactional
public class ProveedorServiceImpl implements ProveedoresService{

	@Autowired
	private ProveedoresDao _proveedoresDao;
	
	@Override
	public boolean saveProveedor(Proveedor proveedor) {
		_proveedoresDao.saveProveedor(proveedor);
		return true;
	}
	
	@Override
	public Proveedor findByName(String name) {
		return _proveedoresDao.findByName(name);
	}
}
