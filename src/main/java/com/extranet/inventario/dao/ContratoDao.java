package com.extranet.inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.extranet.inventario.model.Contrato;

public interface ContratoDao extends JpaRepository<Contrato, Integer>{

}
