package com.ecopetrol.odoo.ws.ecopetrolodoo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name ="stock_move")
public class Move {

    /*row_move.put("id", id_almacenar);
    row_move.put("name", "Importacion");
    row_move.put("sequence", 10);
    row_move.put("priority", 1);
    row_move.put("create_date", date);
    row_move.put("date", date);
    row_move.put("company_id", 1);
    row_move.put("date_expected", date);
    row_move.put("product_id", 1);
    row_move.put("description_picking", "Nota interna");
    row_move.put("product_qty", 1);
    row_move.put("product_uom_qty", 1);
    row_move.put("product_uom", 1);
    row_move.put("location_id", 13);
    row_move.put("location_dest_id", 8);
    row_move.put("picking_id", id_almacenar);
    row_move.put("state", "done");
    row_move.put("procure_method", "make to stock");
    row_move.put("scrapped", false);
    row_move.put("propagate_cancel", true);
    row_move.put("picking_type_id", 1);
    row_move.put("additional", false);
    row_move.put("reference", nombre);
    row_move.put("create_uid", 2);
    row_move.put("write_uid", 2);
    row_move.put("write_date", date);
    */


    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "sequence")
    private Integer sequence;

    @Column(name = "priority")
    private Integer priority;

    @Column(name = "date")
    private Date date;

    @Column(name = "company_id")
    private Integer company_id;

    @Column(name = "date_expected")
    private Date date_expected;

    @Column(name = "product_id")
    private Integer product_id;

    @Column(name = "description_picking")
    private String description_picking;

    @Column(name = "product_qty")
    private Integer product_qty;

    @Column(name = "product_uom_qty")
    private Integer product_uom_qty;

    @Column(name = "product_uom")
    private Integer product_uom;

    @Column(name = "location_id")
    private Integer location_id;

    @Column(name = "location_dest_id")
    private Integer location_dest_id;

    @Column(name = "picking_id")
    private Integer picking_id;

    @Column(name = "state")
    private String state;

    @Column(name = "procure_method")
    private String procure_method;

    @Column(name = "scrapped")
    private Boolean scrapped;

    @Column(name = "propagate_cancel")
    private Boolean propagate_cancel;

    @Column(name = "picking_type_id")
    private Integer picking_type_id;

    @Column(name = "additional")
    private Boolean additional;

    @Column(name = "reference")
    private String reference;

    @Column(name = "create_uid")
    private Integer create_uid;

    @Column(name = "write_uid")
    private Integer write_uid;

    @Column(name = "write_date")
    private Date write_date;

    @Column(name = "create_date")
    private Date create_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    public Date getDate_expected() {
        return date_expected;
    }

    public void setDate_expected(Date date_expected) {
        this.date_expected = date_expected;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getDescription_picking() {
        return description_picking;
    }

    public void setDescription_picking(String description_picking) {
        this.description_picking = description_picking;
    }

    public Integer getProduct_qty() {
        return product_qty;
    }

    public void setProduct_qty(Integer product_qty) {
        this.product_qty = product_qty;
    }

    public Integer getProduct_uom_qty() {
        return product_uom_qty;
    }

    public void setProduct_uom_qty(Integer product_uom_qty) {
        this.product_uom_qty = product_uom_qty;
    }

    public Integer getProduct_uom() {
        return product_uom;
    }

    public void setProduct_uom(Integer product_uom) {
        this.product_uom = product_uom;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public Integer getLocation_dest_id() {
        return location_dest_id;
    }

    public void setLocation_dest_id(Integer location_dest_id) {
        this.location_dest_id = location_dest_id;
    }

    public Integer getPicking_id() {
        return picking_id;
    }

    public void setPicking_id(Integer picking_id) {
        this.picking_id = picking_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProcure_method() {
        return procure_method;
    }

    public void setProcure_method(String procure_method) {
        this.procure_method = procure_method;
    }

    public Boolean getScrapped() {
        return scrapped;
    }

    public void setScrapped(Boolean scrapped) {
        this.scrapped = scrapped;
    }

    public Boolean getPropagate_cancel() {
        return propagate_cancel;
    }

    public void setPropagate_cancel(Boolean propagate_cancel) {
        this.propagate_cancel = propagate_cancel;
    }

    public Integer getPicking_type_id() {
        return picking_type_id;
    }

    public void setPicking_type_id(Integer picking_type_id) {
        this.picking_type_id = picking_type_id;
    }

    public Boolean getAdditional() {
        return additional;
    }

    public void setAdditional(Boolean additional) {
        this.additional = additional;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getCreate_uid() {
        return create_uid;
    }

    public void setCreate_uid(Integer create_uid) {
        this.create_uid = create_uid;
    }

    public Integer getWrite_uid() {
        return write_uid;
    }

    public void setWrite_uid(Integer write_uid) {
        this.write_uid = write_uid;
    }

    public Date getWrite_date() {
        return write_date;
    }

    public void setWrite_date(Date write_date) {
        this.write_date = write_date;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }
}
