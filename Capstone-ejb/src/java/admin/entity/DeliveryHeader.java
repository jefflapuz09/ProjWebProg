/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Jefferson Van
 */
@Entity
@Table(name = "delivery_header")
@NamedQueries({@NamedQuery(name = "DeliveryHeader.findAll", query = "SELECT d FROM DeliveryHeader d"), @NamedQuery(name = "DeliveryHeader.findById", query = "SELECT d FROM DeliveryHeader d WHERE d.id = :id"), @NamedQuery(name = "DeliveryHeader.findByDateMake", query = "SELECT d FROM DeliveryHeader d WHERE d.dateMake = :dateMake"), @NamedQuery(name = "DeliveryHeader.findByIsActive", query = "SELECT d FROM DeliveryHeader d WHERE d.isActive = :isActive"), @NamedQuery(name = "DeliveryHeader.findByCreatedAt", query = "SELECT d FROM DeliveryHeader d WHERE d.createdAt = :createdAt"), @NamedQuery(name = "DeliveryHeader.findByUpdatedAt", query = "SELECT d FROM DeliveryHeader d WHERE d.updatedAt = :updatedAt")})

@NamedNativeQueries({
    @NamedNativeQuery(name="DeliveryHeader.findById",query="Select * from delivery_header where id=?",resultClass=DeliveryHeader.class)


})

public class DeliveryHeader implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "dateMake")
    @Temporal(TemporalType.DATE)
    private Date dateMake;
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deliveryId")
    private List<DeliveryDetail> deliveryDetailCollection;
    @JoinColumn(name = "supplierId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Supplier supplierId;
    @Transient
    private String deliveryDetail;

    public DeliveryHeader() {
    }

    public DeliveryHeader(String id) {
        this.id = id;
    }

    public DeliveryHeader(String id, Date dateMake, boolean isActive) {
        this.id = id;
        this.dateMake = dateMake;
        this.isActive = isActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<DeliveryDetail> getDeliveryDetailCollection() {
        return deliveryDetailCollection;
    }

    public void setDeliveryDetailCollection(List<DeliveryDetail> deliveryDetailCollection) {
        this.deliveryDetailCollection = deliveryDetailCollection;
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
        if (!(object instanceof DeliveryHeader)) {
            return false;
        }
        DeliveryHeader other = (DeliveryHeader) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.DeliveryHeader[id=" + id + "]";
    }

}
