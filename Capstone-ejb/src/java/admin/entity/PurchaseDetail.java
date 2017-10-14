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
@Table(name = "purchase_detail")
@NamedQueries({@NamedQuery(name = "PurchaseDetail.findAll", query = "SELECT p FROM PurchaseDetail p"), @NamedQuery(name = "PurchaseDetail.findById", query = "SELECT p FROM PurchaseDetail p WHERE p.id = :id"), @NamedQuery(name = "PurchaseDetail.findByIsManual", query = "SELECT p FROM PurchaseDetail p WHERE p.isManual = :isManual"), @NamedQuery(name = "PurchaseDetail.findByQuantity", query = "SELECT p FROM PurchaseDetail p WHERE p.quantity = :quantity"), @NamedQuery(name = "PurchaseDetail.findByDelivered", query = "SELECT p FROM PurchaseDetail p WHERE p.delivered = :delivered"), @NamedQuery(name = "PurchaseDetail.findByPrice", query = "SELECT p FROM PurchaseDetail p WHERE p.price = :price"), @NamedQuery(name = "PurchaseDetail.findByCreatedAt", query = "SELECT p FROM PurchaseDetail p WHERE p.createdAt = :createdAt"), @NamedQuery(name = "PurchaseDetail.findByUpdatedAt", query = "SELECT p FROM PurchaseDetail p WHERE p.updatedAt = :updatedAt"), @NamedQuery(name = "PurchaseDetail.findByIsActive", query = "SELECT p FROM PurchaseDetail p WHERE p.isActive = :isActive")})
public class PurchaseDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "isManual")
    private Boolean isManual;
    @Basic(optional = false)
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @Column(name = "delivered")
    private int delivered;
    @Basic(optional = false)
    @Column(name = "price")
    private double price;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;
    @JoinColumn(name = "productId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Product productId;
    @JoinColumn(name = "purchaseId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private PurchaseHeader purchaseId;

    public PurchaseDetail() {
    }

    public PurchaseDetail(Integer id) {
        this.id = id;
    }

    public PurchaseDetail(Integer id, int quantity, int delivered, double price, boolean isActive) {
        this.id = id;
        this.quantity = quantity;
        this.delivered = delivered;
        this.price = price;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsManual() {
        return isManual;
    }

    public void setIsManual(Boolean isManual) {
        this.isManual = isManual;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDelivered() {
        return delivered;
    }

    public void setDelivered(int delivered) {
        this.delivered = delivered;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public PurchaseHeader getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(PurchaseHeader purchaseId) {
        this.purchaseId = purchaseId;
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
        if (!(object instanceof PurchaseDetail)) {
            return false;
        }
        PurchaseDetail other = (PurchaseDetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.PurchaseDetail[id=" + id + "]";
    }

}
