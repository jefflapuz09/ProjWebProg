/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jefferson Van
 */
@Entity
@Table(name = "promo")
@NamedQueries({@NamedQuery(name = "Promo.findAll", query = "SELECT p FROM Promo p"), @NamedQuery(name = "Promo.findById", query = "SELECT p FROM Promo p WHERE p.id = :id"), @NamedQuery(name = "Promo.findByName", query = "SELECT p FROM Promo p WHERE p.name = :name"), @NamedQuery(name = "Promo.findByPrice", query = "SELECT p FROM Promo p WHERE p.price = :price"), @NamedQuery(name = "Promo.findByDateStart", query = "SELECT p FROM Promo p WHERE p.dateStart = :dateStart"), @NamedQuery(name = "Promo.findByDateEnd", query = "SELECT p FROM Promo p WHERE p.dateEnd = :dateEnd"), @NamedQuery(name = "Promo.findByStock", query = "SELECT p FROM Promo p WHERE p.stock = :stock"), @NamedQuery(name = "Promo.findByIsActive", query = "SELECT p FROM Promo p WHERE p.isActive = :isActive")})

@NamedNativeQueries({
    @NamedNativeQuery(name="Promo.findByName",query="Select * from promo where name=?",resultClass=Promo.class)


})

public class Promo implements Serializable {
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
    @Column(name = "price")
    private double price;
    @Column(name = "dateStart")
    @Temporal(TemporalType.DATE)
    private Date dateStart;
    @Column(name = "dateEnd")
    @Temporal(TemporalType.DATE)
    private Date dateEnd;
    @Column(name = "stock")
    private Integer stock;
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;

    public Promo() {
    }

    public Promo(Integer id) {
        this.id = id;
    }

    public Promo(Integer id, String name, double price, boolean isActive) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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
        if (!(object instanceof Promo)) {
            return false;
        }
        Promo other = (Promo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.Promo[id=" + id + "]";
    }

}
