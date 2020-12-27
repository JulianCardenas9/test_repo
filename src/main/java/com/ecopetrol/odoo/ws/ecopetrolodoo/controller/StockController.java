package com.ecopetrol.odoo.ws.ecopetrolodoo.controller;

import com.ecopetrol.odoo.ws.ecopetrolodoo.controller.requestObject.StockObject;
import com.ecopetrol.odoo.ws.ecopetrolodoo.model.Move;
import com.ecopetrol.odoo.ws.ecopetrolodoo.model.Picking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.ecopetrol.odoo.ws.ecopetrolodoo.repository.MoveRepository;
import com.ecopetrol.odoo.ws.ecopetrolodoo.repository.PickingRepository;

import java.sql.Date;
import java.util.Calendar;

@RestController
public class StockController {

    @Autowired
    private MoveRepository moveRepository;

    @Autowired
    private PickingRepository pickingRepository;

    public String response;
    public Integer id;
    public String nombre = "WH/IN/";
    public Date fecha;

    @PostMapping("/inventory")
    public String createInventory(@RequestBody StockObject stock){

        try {
                if(id == null){
                    id = 26;
                }
                String tipoGuardar = null;
                if(stock.getTipo().equalsIgnoreCase("nacional")){
                    tipoGuardar = "3";
                }else{
                    tipoGuardar = "1";
                }

                id++;
                //nombre = nombre.concat(String.format("%05d", id));
                fecha = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                Picking pickGuardar = pickingRepository.save(createPicking(stock.getNombre(), stock.getOrigen()));
                Move moveGuardar = moveRepository.save(createMove(stock.getNombre(), stock.getOrigen(), tipoGuardar, stock.getCantidad()));
                response = "200";
                //nombre = "WH/IN/";
        }catch(Exception ex){
            ex.printStackTrace();
            return "error";
        }
        return response;
    }

    public Picking createPicking(String nombreObj, String origen){

        Picking picking = new Picking();

        picking.setId(id);
        picking.setName(nombreObj);
        picking.setOrigin(origen);
        picking.setCompany_id(1);
        picking.setCreate_date(fecha);
        picking.setCreate_uid(2);
        picking.setDate(fecha);
        picking.setDate_done(fecha);
        picking.setImmediate_transfer(true);
        picking.setIs_locked(true);
        picking.setLocation_dest_id(8);
        picking.setLocation_id(13);
        picking.setMove_type("direct");
        picking.setPartner_id(1);
        picking.setPicking_type_id(1);
        picking.setWrite_date(fecha);
        picking.setWrite_uid(2);
        picking.setScheduled_date(fecha);
        picking.setState("done");
        picking.setUser_id(2);

        return picking;

    }

    public Move createMove(String nombreTipo, String origen, String idTipo, String cant){
        Move move = new Move();
        move.setId(id);
        move.setName(nombreTipo);
        move.setSequence(10);
        move.setPriority(1);
        move.setCreate_date(fecha);
        move.setDate(fecha);
        move.setCompany_id(1);
        move.setDate_expected(fecha);
        move.setProduct_id(Integer.parseInt(idTipo));
        move.setDescription_picking("Nota interna");
        move.setProduct_qty(Integer.parseInt(cant));
        move.setProduct_uom_qty(1);
        move.setProduct_uom(1);
        move.setLocation_id(13);
        move.setLocation_dest_id(8);
        move.setPicking_id(id);
        move.setState("done");
        move.setProcure_method("make to stock");
        move.setScrapped(false);
        move.setPropagate_cancel(true);
        move.setPicking_type_id(1);
        move.setAdditional(false);
        move.setReference(origen.concat(" - ").concat(nombreTipo));
        move.setCreate_uid(2);
        move.setWrite_uid(2);
        move.setWrite_date(fecha);

        return move;

    }

    @GetMapping("/getInventory")
    public String getReturn(){
        return "Hello World";
    }

}
