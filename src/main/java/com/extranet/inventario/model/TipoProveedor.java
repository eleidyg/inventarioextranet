package com.extranet.inventario.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;


/**
 * The persistent class for the tipo_proveedor database table.
 * 
 */
@Entity
@Table(name="tipo_proveedor")
@NamedQuery(name="TipoProveedor.findAll", query="SELECT t FROM TipoProveedor t")
public class TipoProveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idtipo_proveedor")
	private Integer idtipoProveedor;

	@Column(name="nombre_tipo_proveedor")
	private String nombreTipoProveedor;

	//bi-directional many-to-one association to Proveedor
	@JsonManagedReference
	@OneToMany(mappedBy="tipoProveedor")
	private List<Proveedor> proveedors;

	public TipoProveedor() {
	}

	public Integer getIdtipoProveedor() {
		return this.idtipoProveedor;
	}

	public void setIdtipoProveedor(Integer idtipoProveedor) {
		this.idtipoProveedor = idtipoProveedor;
	}

	public String getNombreTipoProveedor() {
		return this.nombreTipoProveedor;
	}

	public void setNombreTipoProveedor(String nombreTipoProveedor) {
		this.nombreTipoProveedor = nombreTipoProveedor;
	}

	public List<Proveedor> getProveedors() {
		return this.proveedors;
	}

	public void setProveedors(List<Proveedor> proveedors) {
		this.proveedors = proveedors;
	}

}