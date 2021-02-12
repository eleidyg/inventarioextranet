package com.extranet.inventario.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;


/**
 * The persistent class for the habitacion database table.
 * 
 */
@Entity
@NamedQuery(name="Habitacion.findAll", query="SELECT h FROM Habitacion h")
public class Habitacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idhabitacion;

	@Column(name="capacidad_maxima")
	private Integer capacidadMaxima;

	@Column(name="capacidad_minima")
	private Integer capacidadMinima;

	@Column(name="numero_adultos")
	private Integer numeroAdultos;

	@Column(name="numero_ninos")
	private Integer numeroNinos;

	//bi-directional many-to-one association to TipoHabitacion
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="idtipo_habitacion")
	private TipoHabitacion tipoHabitacion;

	public Habitacion() {
	}

	public Integer getIdhabitacion() {
		return this.idhabitacion;
	}

	public void setIdhabitacion(Integer idhabitacion) {
		this.idhabitacion = idhabitacion;
	}

	public Integer getCapacidadMaxima() {
		return this.capacidadMaxima;
	}

	public void setCapacidadMaxima(Integer capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public Integer getCapacidadMinima() {
		return this.capacidadMinima;
	}

	public void setCapacidadMinima(Integer capacidadMinima) {
		this.capacidadMinima = capacidadMinima;
	}

	public Integer getNumeroAdultos() {
		return this.numeroAdultos;
	}

	public void setNumeroAdultos(Integer numeroAdultos) {
		this.numeroAdultos = numeroAdultos;
	}

	public Integer getNumeroNinos() {
		return this.numeroNinos;
	}

	public void setNumeroNinos(Integer numeroNinos) {
		this.numeroNinos = numeroNinos;
	}

	public TipoHabitacion getTipoHabitacion() {
		return this.tipoHabitacion;
	}

	public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	
}