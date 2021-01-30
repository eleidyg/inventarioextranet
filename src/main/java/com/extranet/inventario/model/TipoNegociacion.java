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

	//bi-directional many-to-one association to Contrato
	//@OneToMany(mappedBy="tipoNegociacion")
	//private List<Contrato> contratos;

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

	//public List<Contrato> getContratos() {
		//return this.contratos;
	//}

	//public void setContratos(List<Contrato> contratos) {
		//this.contratos = contratos;
	//}

	//public Contrato addContrato(Contrato contrato) {
		//getContratos().add(contrato);
		//contrato.setTipoNegociacion(this);

		//return contrato;
	//}

	//public Contrato removeContrato(Contrato contrato) {
		//getContratos().remove(contrato);
		//contrato.setTipoNegociacion(null);

		//return contrato;
	//}

}