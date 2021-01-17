package com.extranet.inventario.dao;

import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.extranet.inventario.model.Proveedor;

@Repository
@Transactional
public class ProveedoresDaoImpl extends AbstractSession implements ProveedoresDao{

	@Override
	public void saveProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		getSession().persist(proveedor);
	}
}
