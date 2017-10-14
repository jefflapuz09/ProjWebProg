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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Jefferson Van
 */
@Entity
@Table(name = "purchase_header")
@NamedQueries({@NamedQuery(name = "PurchaseHeader.findAll", query = "SELECT p FROM PurchaseHeader p"), @NamedQuery(name = "PurchaseHeader.findById", query = "SELECT p FROM PurchaseHeader p WHERE p.id = :id"), @NamedQuery(name = "PurchaseHeader.findByDateMake", query = "SELECT p FROM PurchaseHeader p WHERE p.dateMake = :dateMake"), @NamedQuery(name = "PurchaseHeader.findByIsActive", query = "SELECT p FROM PurchaseHeader p WHERE p.isActive = :isActive"), @NamedQuery(name = "PurchaseHeader.findByIsFinalize", query = "SELECT p FROM PurchaseHeader p WHERE p.isFinalize = :isFinalize"), @NamedQuery(name = "PurchaseHeader.findByIsDelivered", query = "SELECT p FROM PurchaseHeader p WHERE p.isDelivered = :isDelivered"), @NamedQuery(name = "PurchaseHeader.findByCreatedAt", query = "SELECT p FROM PurchaseHeader p WHERE p.createdAt = :createdAt"), @NamedQuery(name = "PurchaseHeader.findByUpdatedAt", query = "SELECT p FROM PurchaseHeader p WHERE p.updatedAt = :updatedAt")})

@NamedNativeQueries({
    @NamedNativeQuery(name="PurchaseHeader.findById",query="Select * from purchase_header where id=?",resultClass=PurchaseHeader.class)


})

public class PurchaseHeader implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Lob
    @Column(name = "remarks")
    private String remarks;
    @Basic(optional = false)
    @Column(name = "dateMake")
    @Temporal(TemporalType.DATE)
    private Date dateMake;
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;
    @Basic(optional = false)
    @Column(name = "isFinalize")
    private boolean isFinalize;
    @Basic(optional = false)
    @Column(name = "isDelivered")
    private boolean isDelivered;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @JoinColumn(name = "supplierId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Supplier supplierId;
    @Transient
    private String purchaseDetail;

    public String getPurchaseDetail() {
        return purchaseDetail;
    }

    public void setPurchaseDetail(String purchaseDetail) {
        this.purchaseDetail = purchaseDetail;
    }


    public PurchaseHeader() {
    }

    public PurchaseHeader(String id) {
        this.id = id;
    }

    public PurchaseHeader(String id, String remarks, Date dateMake, boolean isActive, boolean isFinalize, boolean isDelivered) {
        this.id = id;
        this.remarks = remarks;
        this.dateMake = dateMake;
        this.isActive = isActive;
        this.isFinalize = isFinalize;
        this.isDelivered = isDelivered;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getDateMake() {
        return dateMake;
    }

    public void setDateMake(Date dateMake) {
        this.dateMake = dateMake;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsFinalize() {
        return isFinalize;
    }

    public void setIsFinalize(boolean isFinalize) {
        this.isFinalize = isFinalize;
    }

    public boolean getIsDelivered() {
        return isDelivered;
    }

    public void setIsDelivered(boolean isDelivered) {
        this.isDelivered = isDelivered;
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

    public Supplier getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Supplier supplierId) {
        this.supplierId = supplierId;
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
        if (!(object instanceof PurchaseHeader)) {
            return false;
        }
        PurchaseHeader other = (PurchaseHeader) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.PurchaseHeader[id=" + id + "]";
    }

}
