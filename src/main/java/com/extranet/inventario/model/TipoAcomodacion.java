package com.extranet.inventario.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_acomodacion database table.
 * 
 */
@Entity
@Table(name="tipo_acomodacion")
@NamedQuery(name="TipoAcomodacion.findAll", query="SELECT t FROM TipoAcomodacion t")
public class TipoAcomodacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idtipo_acomodacion")
	private Integer idtipoAcomodacion;

	@Column(name="nombre_tipo_acomodacion")
	private String nombreTipoAcomodacion;

	
	public TipoAcomodacion() {
	}

	public Integer getIdtipoAcomodacion() {
		return this.idtipoAcomodacion;
	}

	public void setIdtipoAcomodacion(Integer idtipoAcomodacion) {
		this.idtipoAcomodacion = idtipoAcomodacion;
	}

	public String getNombreTipoAcomodacion() {
		return this.nombreTipoAcomodacion;
	}

	public void setNombreTipoAcomodacion(String nombreTipoAcomodacion) {
		this.nombreTipoAcomodacion = nombreTipoAcomodacion;
	}

	
}