package com.extranet.inventario.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.extranet.inventario.model.Habitacion;

public interface HabitacionDao extends JpaRepository<Habitacion, Integer>{
	
	String query="SELECT p.idproveedor, p.nombre FROM habitacion h INNER JOIN proveedorhabitacion ph ON h.idhabitacion=ph.idhabitacion INNER JOIN\r\n"
			+ "proveedor p ON ph.idproveedor=p.idproveedor WHERE h.idhabitacion = :idHabitacion";
	@Query(value = query, nativeQuery = true)
	List<String> consultarHabitacionProveedor(@Param("idHabitacion") Integer idHabitacion);

}
