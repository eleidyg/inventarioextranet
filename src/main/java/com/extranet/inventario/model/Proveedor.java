package com.extranet.inventario.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;


/**
 * The persistent class for the proveedor database table.
 * 
 */
@Entity
@Table(name="proveedor")
@NamedQuery(name="Proveedor.findAll", query="SELECT p FROM Proveedor p")
public class Proveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,  generator="id_pro_generator")
	@SequenceGenerator(name="id_pro_generator", sequenceName="sec_idproveedor", allocationSize = 1)
	@Column(name="idproveedor")
	private Integer idproveedor;
	
	//bi-directional many-to-one association to TipoProveedor
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="idtipo_proveedor")
	private TipoProveedor tipoProveedor;
    
	@Column(name="cadena")
	private String cadena;
	
	@Column(name="nombre")
	private String nombre;
    
	@Column(name="checkin")
	private String checkin;

	@Column(name="checkout")
	private String checkout;
	
	@Column(name="estrellas")
	private Integer estrellas;
	
	@Column(name="pais")
	private String pais;
    
	@Column(name="ciudad")
	private String ciudad;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="telefono")
	private String telefono;

	@Column(name="descripcion_hotel")
	private String descripcionHotel;

	@Column(name="nombre_gerente_general")
	private String nombreGerenteGeneral;
	
	@Column(name="email_gerente_general")
	private String emailGerenteGeneral;
	
	@Column(name="notificar_gerente_general")
	private Boolean notificarGerenteGeneral;
	
	@Column(name="telefono_gerente_general")
	private String telefonoGerenteGeneral;
	
	@Column(name="nombre_gerente_comercial")
	private String nombreGerenteComercial;
	
	@Column(name="email_gerente_comercial")
	private String emailGerenteComercial;
	
	@Column(name="notificar_gerente_comerial")
	private Boolean notificarGerenteComerial;
	
	@Column(name="telefono_gerente_comercial")
	private String telefonoGerenteComercial;

	@Column(name="nombre_contacto_reservas")
	private String nombreContactoReservas;
	
	@Column(name="email_contacto_reservas")
	private String emailContactoReservas;
	
	@Column(name="notificar_contacto_reservas")
	private Boolean notificarContactoReservas;
	
	@Column(name="telefono_contacto_reservas")
	private String telefonoContactoReservas;
	
	@Column(name="nombre_contacto_grupos")
	private String nombreContactoGrupos;
    
	@Column(name="email_contacto_grupos")
	private String emailContactoGrupos;
	
	@Column(name="notificar_contacto_grupos")
	private String notificarContactoGrupos;
	
	@Column(name="telefono_contacto_grupos")
	private String telefonoContactoGrupos;
	
	
    //bi-directional many-to-one association to Contrato
	//@OneToMany(mappedBy="proveedor")
	//private List<Contrato> contratos;
    
	//bi-directional many-to-many association to Habitacion
	//@ManyToMany
	//@JoinTable(
		//name="proveedor_has_habitacion"
		//, joinColumns={
			//@JoinColumn(name="idproveedor")
			//}
		//, inverseJoinColumns={
			//@JoinColumn(name="idhabitacion")
			//}
		//)
	//private List<Habitacion> habitacions;

	public Proveedor() {
	}

	public Integer getIdproveedor() {
		return this.idproveedor;
	}

	public void setIdproveedor(Integer idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getCadena() {
		return this.cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public String getCheckin() {
		return this.checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return this.checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDescripcionHotel() {
		return this.descripcionHotel;
	}

	public void setDescripcionHotel(String descripcionHotel) {
		this.descripcionHotel = descripcionHotel;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmailContactoGrupos() {
		return this.emailContactoGrupos;
	}

	public void setEmailContactoGrupos(String emailContactoGrupos) {
		this.emailContactoGrupos = emailContactoGrupos;
	}

	public String getEmailContactoReservas() {
		return this.emailContactoReservas;
	}

	public void setEmailContactoReservas(String emailContactoReservas) {
		this.emailContactoReservas = emailContactoReservas;
	}

	public String getEmailGerenteComercial() {
		return this.emailGerenteComercial;
	}

	public void setEmailGerenteComercial(String emailGerenteComercial) {
		this.emailGerenteComercial = emailGerenteComercial;
	}

	public String getEmailGerenteGeneral() {
		return this.emailGerenteGeneral;
	}

	public void setEmailGerenteGeneral(String emailGerenteGeneral) {
		this.emailGerenteGeneral = emailGerenteGeneral;
	}

	public Integer getEstrellas() {
		return this.estrellas;
	}

	public void setEstrellas(Integer estrellas) {
		this.estrellas = estrellas;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreContactoGrupos() {
		return this.nombreContactoGrupos;
	}

	public void setNombreContactoGrupos(String nombreContactoGrupos) {
		this.nombreContactoGrupos = nombreContactoGrupos;
	}

	public String getNombreContactoReservas() {
		return this.nombreContactoReservas;
	}

	public void setNombreContactoReservas(String nombreContactoReservas) {
		this.nombreContactoReservas = nombreContactoReservas;
	}

	public String getNombreGerenteComercial() {
		return this.nombreGerenteComercial;
	}

	public void setNombreGerenteComercial(String nombreGerenteComercial) {
		this.nombreGerenteComercial = nombreGerenteComercial;
	}

	public String getNombreGerenteGeneral() {
		return this.nombreGerenteGeneral;
	}

	public void setNombreGerenteGeneral(String nombreGerenteGeneral) {
		this.nombreGerenteGeneral = nombreGerenteGeneral;
	}

	public String getNotificarContactoGrupos() {
		return this.notificarContactoGrupos;
	}

	public void setNotificarContactoGrupos(String notificarContactoGrupos) {
		this.notificarContactoGrupos = notificarContactoGrupos;
	}

	public Boolean getNotificarContactoReservas() {
		return this.notificarContactoReservas;
	}

	public void setNotificarContactoReservas(Boolean notificarContactoReservas) {
		this.notificarContactoReservas = notificarContactoReservas;
	}

	public Boolean getNotificarGerenteComerial() {
		return this.notificarGerenteComerial;
	}

	public void setNotificarGerenteComerial(Boolean notificarGerenteComerial) {
		this.notificarGerenteComerial = notificarGerenteComerial;
	}

	public Boolean getNotificarGerenteGeneral() {
		return this.notificarGerenteGeneral;
	}

	public void setNotificarGerenteGeneral(Boolean notificarGerenteGeneral) {
		this.notificarGerenteGeneral = notificarGerenteGeneral;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefonoContactoGrupos() {
		return this.telefonoContactoGrupos;
	}

	public void setTelefonoContactoGrupos(String telefonoContactoGrupos) {
		this.telefonoContactoGrupos = telefonoContactoGrupos;
	}

	public String getTelefonoContactoReservas() {
		return this.telefonoContactoReservas;
	}

	public void setTelefonoContactoReservas(String telefonoContactoReservas) {
		this.telefonoContactoReservas = telefonoContactoReservas;
	}

	public String getTelefonoGerenteComercial() {
		return this.telefonoGerenteComercial;
	}

	public void setTelefonoGerenteComercial(String telefonoGerenteComercial) {
		this.telefonoGerenteComercial = telefonoGerenteComercial;
	}

	public String getTelefonoGerenteGeneral() {
		return this.telefonoGerenteGeneral;
	}

	public void setTelefonoGerenteGeneral(String telefonoGerenteGeneral) {
		this.telefonoGerenteGeneral = telefonoGerenteGeneral;
	}

	public TipoProveedor getTipoProveedor() {
		return this.tipoProveedor;
	}

	public void setTipoProveedor(TipoProveedor tipoProveedor) {
		this.tipoProveedor = tipoProveedor;
	}

	
}