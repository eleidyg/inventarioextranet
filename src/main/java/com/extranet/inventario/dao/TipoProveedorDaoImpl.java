package com.extranet.inventario.dao;

import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.extranet.inventario.model.TipoProveedor;

@Repository
@Transactional
public class TipoProveedorDaoImpl extends AbstractSession implements TipoProveedorDao{
	
	@Override
	public void saveTipoProveedor(TipoProveedor tipoProveedor) {
		// TODO Auto-generated method stub
		getSession().persist(tipoProveedor);
	}

}
