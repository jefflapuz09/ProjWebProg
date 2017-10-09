/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jefferson Van
 */
@Entity
@Table(name = "discount")
@NamedQueries({@NamedQuery(name = "Discount.findAll", query = "SELECT d FROM Discount d"), @NamedQuery(name = "Discount.findById", query = "SELECT d FROM Discount d WHERE d.id = :id"), @NamedQuery(name = "Discount.findByName", query = "SELECT d FROM Discount d WHERE d.name = :name"), @NamedQuery(name = "Discount.findByRate", query = "SELECT d FROM Discount d WHERE d.rate = :rate"), @NamedQuery(name = "Discount.findByIsWhole", query = "SELECT d FROM Discount d WHERE d.isWhole = :isWhole"), @NamedQuery(name = "Discount.findByIsVatExempt", query = "SELECT d FROM Discount d WHERE d.isVatExempt = :isVatExempt"), @NamedQuery(name = "Discount.findByIsActive", query = "SELECT d FROM Discount d WHERE d.isActive = :isActive")})

@NamedNativeQueries({
    @NamedNativeQuery(name="Discount.findByName",query="Select * from discount where name=?",resultClass=Discount.class)


})

public class Discount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "rate")
    private double rate;
    @Basic(optional = false)
    @Column(name = "isWhole")
    private boolean isWhole;
    @Basic(optional = false)
    @Column(name = "isVatExempt")
    private boolean isVatExempt;
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;

    public Discount() {
    }

    public Discount(Integer id) {
        this.id = id;
    }

    public Discount(Integer id, String name, double rate, boolean isWhole, boolean isVatExempt, boolean isActive) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.isWhole = isWhole;
        this.isVatExempt = isVatExempt;
        this.isActive = isActive;
    }

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

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean getIsWhole() {
        return isWhole;
    }

    public void setIsWhole(boolean isWhole) {
        this.isWhole = isWhole;
    }

    public boolean getIsVatExempt() {
        return isVatExempt;
    }

    public void setIsVatExempt(boolean isVatExempt) {
        this.isVatExempt = isVatExempt;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Discount)) {
            return false;
        }
        Discount other = (Discount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.Discount[id=" + id + "]";
    }

}
