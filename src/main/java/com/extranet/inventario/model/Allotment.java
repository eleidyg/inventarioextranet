package com.extranet.inventario.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Date;


/**
 * The persistent class for the allotment database table.
 * 
 */
@Entity
@NamedQuery(name="Allotment.findAll", query="SELECT a FROM Allotment a")
public class Allotment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,  generator="id_pro_generator_allotment")
	@SequenceGenerator(name="id_pro_generator_allotment", sequenceName="sec_idallotment", allocationSize = 1)
	@Column(name="idallotment")
	private Integer idallotment;
	
	//bi-directional many-to-one association to Habitacion
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="idhabitacion")
	private Habitacion habitacion;

	@Column(name="cantidad")
	private Integer cantidad;

	@Column(name="fecha_desde")
	private Date fechaDesde;

	@Column(name="fecha_hasta")
	private Date fechaHasta;

	public Allotment() {
	}

	public Integer getIdallotment() {
		return this.idallotment;
	}

	public void setIdallotment(Integer idallotment) {
		this.idallotment = idallotment;
	}

	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaDesde() {
		return this.fechaDesde;
	}

	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public Date getFechaHasta() {
		return this.fechaHasta;
	}

	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	public Habitacion getHabitacion() {
		return this.habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

}