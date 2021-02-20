package com.extranet.inventario.model.service;

import java.util.List;

public interface ICRUD<T> {
	
	T registrar(T t);
	
	T modificar(T t);
	
	void eliminar(int d);
	
	T listarId(int d);
	
	List<T> listar();

	

}
