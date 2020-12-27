package com.ecopetrol.odoo.ws.ecopetrolodoo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="stock_picking")
public class Picking {

    /*
    row_picker.put("id", id_almacenar);
    row_picker.put("name", nombre);
    row_picker.put("origin", "123456");
    row_picker.put("move_type", "direct");
    row_picker.put("state", "done");
    row_picker.put("scheduled_date", date);
    row_picker.put("date", date);
    row_picker.put("date_done", date);
    row_picker.put("location_id", 13);
    row_picker.put("location_dest_id", 8);
    row_picker.put("picking_type_id", 1);
    row_picker.put("partner_id", 1);
    row_picker.put("company_id", 1);
    row_picker.put("user_id", 2);
    row_picker.put("is_locked", true);
    row_picker.put("immediate_transfer", true);
    row_picker.put("create_uid", 2);
    row_picker.put("create_date", date);
    row_picker.put("write_uid", 2);
    row_picker.put("write_date", date);
    */
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "origin")
    private String origin;

    @Column(name = "name")
    private String name;

    @Column(name = "move_type")
    private String move_type;

    @Column(name = "state")
    private String state;

    @Column(name = "scheduled_date")
    private Date scheduled_date;

    @Column(name = "date")
    private Date date;

    @Column(name = "date_done")
    private Date date_done;

    @Column(name = "location_id")
    private Integer location_id;

    @Column(name = "location_dest_id")
    private Integer location_dest_id;

    @Column(name = "picking_type_id")
    private Integer picking_type_id;

    @Column(name = "partner_id")
    private Integer partner_id;

    @Column(name = "company_id")
    private Integer company_id;

    @Column(name = "user_id")
    private Integer user_id;

    @Column(name = "is_locked")
    private Boolean is_locked;

    @Column(name = "immediate_transfer")
    private Boolean immediate_transfer;

    @Column(name = "create_uid")
    private Integer create_uid;

    @Column(name = "create_date")
    private Date create_date;

    @Column(name = "write_uid")
    private Integer write_uid;

    @Column(name = "write_date")
    private Date write_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getMove_type() {
        return move_type;
    }

    public void setMove_type(String move_type) {
        this.move_type = move_type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getScheduled_date() {
        return scheduled_date;
    }

    public void setScheduled_date(Date scheduled_date) {
        this.scheduled_date = scheduled_date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate_done() {
        return date_done;
    }

    public void setDate_done(Date date_done) {
        this.date_done = date_done;
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

    public Integer getPicking_type_id() {
        return picking_type_id;
    }

    public void setPicking_type_id(Integer picking_type_id) {
        this.picking_type_id = picking_type_id;
    }

    public Integer getPartner_id() {
        return partner_id;
    }

    public void setPartner_id(Integer partner_id) {
        this.partner_id = partner_id;
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Boolean getIs_locked() {
        return is_locked;
    }

    public void setIs_locked(Boolean is_locked) {
        this.is_locked = is_locked;
    }

    public Boolean getImmediate_transfer() {
        return immediate_transfer;
    }

    public void setImmediate_transfer(Boolean immediate_transfer) {
        this.immediate_transfer = immediate_transfer;
    }

    public Integer getCreate_uid() {
        return create_uid;
    }

    public void setCreate_uid(Integer create_uid) {
        this.create_uid = create_uid;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
