package me.clark.martyn.pagination.app.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

/**
 * User: martyn
 * Date: 24/04/2016
 * Time: 00:00
 */
@Entity
public class Accounts {

    private Long id;

    private Boolean active;

    private Date dateCreated;

    private String name;

    private Boolean single;

    private Boolean egressLite;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "active")
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Basic
    @Column(name = "date_created")
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "single")
    public Boolean getSingle() {
        return single;
    }

    public void setSingle(Boolean single) {
        this.single = single;
    }

    @Basic
    @Column(name = "egress_lite")
    public Boolean getEgressLite() {
        return egressLite;
    }

    public void setEgressLite(Boolean egressLite) {
        this.egressLite = egressLite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accounts accounts = (Accounts) o;
        return Objects.equals(id, accounts.id) &&
                Objects.equals(active, accounts.active) &&
                Objects.equals(dateCreated, accounts.dateCreated) &&
                Objects.equals(name, accounts.name) &&
                Objects.equals(single, accounts.single) &&
                Objects.equals(egressLite, accounts.egressLite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, active, dateCreated, name, single, egressLite);
    }
}
