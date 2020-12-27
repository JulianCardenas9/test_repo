package com.ecopetrol.odoo.ws.ecopetrolodoo.repository;

import com.ecopetrol.odoo.ws.ecopetrolodoo.model.Picking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PickingRepository extends JpaRepository<Picking, Integer> {

}
