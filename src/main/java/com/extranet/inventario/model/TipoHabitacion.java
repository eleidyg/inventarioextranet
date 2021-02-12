package com.extranet.inventario.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_habitacion database table.
 * 
 */
@Entity
@Table(name="tipo_habitacion")
@NamedQuery(name="TipoHabitacion.findAll", query="SELECT t FROM TipoHabitacion t")
public class TipoHabitacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idtipo_habitacion")
	private Integer idtipoHabitacion;

	@Column(name="nombre_tipo_habitacion")
	private String nombreTipoHabitacion;


	public TipoHabitacion() {
	}

	public Integer getIdtipoHabitacion() {
		return this.idtipoHabitacion;
	}

	public void setIdtipoHabitacion(Integer idtipoHabitacion) {
		this.idtipoHabitacion = idtipoHabitacion;
	}

	public String getNombreTipoHabitacion() {
		return this.nombreTipoHabitacion;
	}

	public void setNombreTipoHabitacion(String nombreTipoHabitacion) {
		this.nombreTipoHabitacion = nombreTipoHabitacion;
	}
}