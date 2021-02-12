package com.extranet.inventario.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the habitacion database table.
 * 
 */
@Entity
@Table(name="proveedorhabitacion")
@NamedQuery(name="ProveedorHabitacion.findAll", query="SELECT h FROM ProveedorHabitacion h")
public class ProveedorHabitacion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer idhabitacion;
	
	@Column(name="idproveedor")
	private Integer idproveedor;

	public Integer getIdhabitacion() {
		return idhabitacion;
	}

	public void setIdhabitacion(Integer idhabitacion) {
		this.idhabitacion = idhabitacion;
	}

	public Integer getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(Integer idproveedor) {
		this.idproveedor = idproveedor;
	}

	
}
