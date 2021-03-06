package com.ecopetrol.odoo.ws.ecopetrolodoo.repository;

import com.ecopetrol.odoo.ws.ecopetrolodoo.model.Move;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoveRepository extends JpaRepository<Move, Integer> {


}
