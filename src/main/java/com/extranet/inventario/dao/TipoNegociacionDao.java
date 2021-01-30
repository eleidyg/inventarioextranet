package com.extranet.inventario.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.extranet.inventario.model.TipoNegociacion;
import com.extranet.inventario.model.TipoProveedor;

public interface TipoNegociacionDao extends JpaRepository<TipoNegociacion, Integer>{
	
	

}
