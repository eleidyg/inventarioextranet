package com.extranet.inventario.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_negociacion database table.
 * 
 */
@Entity
@Table(name="tipo_negociacion")
@NamedQuery(name="TipoNegociacion.findAll", query="SELECT t FROM TipoNegociacion t")
public class TipoNegociacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idtipo_negociacion")
	private Integer idtipoNegociacion;

	@Column(name="nombre_tipo_negociacion")
	private String nombreTipoNegociacion;

	public TipoNegociacion() {
	}

	public Integer getIdtipoNegociacion() {
		return this.idtipoNegociacion;
	}

	public void setIdtipoNegociacion(Integer idtipoNegociacion) {
		this.idtipoNegociacion = idtipoNegociacion;
	}

	public String getNombreTipoNegociacion() {
		return this.nombreTipoNegociacion;
	}

	public void setNombreTipoNegociacion(String nombreTipoNegociacion) {
		this.nombreTipoNegociacion = nombreTipoNegociacion;
	}

}