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
@Table(name = "sales_header")
@NamedQueries({@NamedQuery(name = "SalesHeader.findAll", query = "SELECT s FROM SalesHeader s"), @NamedQuery(name = "SalesHeader.findById", query = "SELECT s FROM SalesHeader s WHERE s.id = :id"), @NamedQuery(name = "SalesHeader.findByTotal", query = "SELECT s FROM SalesHeader s WHERE s.total = :total"), @NamedQuery(name = "SalesHeader.findByCreatedAt", query = "SELECT s FROM SalesHeader s WHERE s.createdAt = :createdAt"), @NamedQuery(name = "SalesHeader.findByUpdatedAt", query = "SELECT s FROM SalesHeader s WHERE s.updatedAt = :updatedAt")})

@NamedNativeQueries({
    @NamedNativeQuery(name="SalesHeader.findById",query="Select * from sales_header where id=?",resultClass=SalesHeader.class)


})

public class SalesHeader implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "total")
    private double total;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public SalesHeader() {
    }

    public SalesHeader(Integer id) {
        this.id = id;
    }

    public SalesHeader(Integer id, double total) {
        this.id = id;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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
        if (!(object instanceof SalesHeader)) {
            return false;
        }
        SalesHeader other = (SalesHeader) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.SalesHeader[id=" + id + "]";
    }

}
