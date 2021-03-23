package com.extranet.inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.extranet.inventario.model.Allotment;

public interface AllotmentDao extends JpaRepository<Allotment, Integer>{

}
