package com.extranet.inventario.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * The persistent class for the contrato database table.
 * 
 */
@Entity
@NamedQuery(name="Contrato.findAll", query="SELECT c FROM Contrato c")
public class Contrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,  generator="id_cont_generator")
	@SequenceGenerator(name="id_cont_generator", sequenceName="sec_idcontrato", allocationSize = 1)
	@Column(name="idcontrato")
	private Integer idcontrato;
	
	//bi-directional many-to-one association to TipoNegociacion
	
	@ManyToOne
	@JoinColumn(name="idtipo_negociacion")
	private TipoNegociacion tipoNegociacion;
	
	//bi-directional many-to-one association to Proveedor
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="idproveedor")
	private Proveedor proveedor;
	
	@Column(name="porcentaje_comision")
	private Integer porcentajeComision;
	
	@Column(name="iva")
	private Integer iva;

	@Column(name="fee_impuesto_hotelero")
	private Integer feeImpuestoHotelero;


	public Contrato() {
	}

	public Integer getIdcontrato() {
		return this.idcontrato;
	}

	public void setIdcontrato(Integer idcontrato) {
		this.idcontrato = idcontrato;
	}

	public Integer getFeeImpuestoHotelero() {
		return this.feeImpuestoHotelero;
	}

	public void setFeeImpuestoHotelero(Integer feeImpuestoHotelero) {
		this.feeImpuestoHotelero = feeImpuestoHotelero;
	}

	public Integer getIva() {
		return this.iva;
	}

	public void setIva(Integer iva) {
		this.iva = iva;
	}

	public Integer getPorcentajeComision() {
		return this.porcentajeComision;
	}

	public void setPorcentajeComision(Integer porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}

	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public TipoNegociacion getTipoNegociacion() {
		return this.tipoNegociacion;
	}

	public void setTipoNegociacion(TipoNegociacion tipoNegociacion) {
		this.tipoNegociacion = tipoNegociacion;
	}

}