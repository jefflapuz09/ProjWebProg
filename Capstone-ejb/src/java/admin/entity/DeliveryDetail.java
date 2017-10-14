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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "delivery_detail")
@NamedQueries({@NamedQuery(name = "DeliveryDetail.findAll", query = "SELECT d FROM DeliveryDetail d"), @NamedQuery(name = "DeliveryDetail.findById", query = "SELECT d FROM DeliveryDetail d WHERE d.id = :id"), @NamedQuery(name = "DeliveryDetail.findByQuantity", query = "SELECT d FROM DeliveryDetail d WHERE d.quantity = :quantity"), @NamedQuery(name = "DeliveryDetail.findByReturned", query = "SELECT d FROM DeliveryDetail d WHERE d.returned = :returned"), @NamedQuery(name = "DeliveryDetail.findByIsActive", query = "SELECT d FROM DeliveryDetail d WHERE d.isActive = :isActive"), @NamedQuery(name = "DeliveryDetail.findByCreatedAt", query = "SELECT d FROM DeliveryDetail d WHERE d.createdAt = :createdAt"), @NamedQuery(name = "DeliveryDetail.findByUpdatedAt", query = "SELECT d FROM DeliveryDetail d WHERE d.updatedAt = :updatedAt")})
public class DeliveryDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @Column(name = "returned")
    private int returned;
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @JoinColumn(name = "deliveryId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private DeliveryHeader deliveryId;
    @JoinColumn(name = "productId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Product productId;

    public DeliveryDetail() {
    }

    public DeliveryDetail(Integer id) {
        this.id = id;
    }

    public DeliveryDetail(Integer id, int quantity, int returned, boolean isActive) {
        this.id = id;
        this.quantity = quantity;
        this.returned = returned;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getReturned() {
        return returned;
    }

    public void setReturned(int returned) {
        this.returned = returned;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
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

    public DeliveryHeader getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(DeliveryHeader deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
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
        if (!(object instanceof DeliveryDetail)) {
            return false;
        }
        DeliveryDetail other = (DeliveryDetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.DeliveryDetail[id=" + id + "]";
    }

}
