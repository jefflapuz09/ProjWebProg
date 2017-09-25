/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Jefferson Van
 */
@Entity
@Table(name = "supplier_contact")
@NamedQueries({@NamedQuery(name = "SupplierContact.findAll", query = "SELECT s FROM SupplierContact s"), @NamedQuery(name = "SupplierContact.findByScId", query = "SELECT s FROM SupplierContact s WHERE s.scId = :scId"), @NamedQuery(name = "SupplierContact.findByScNo", query = "SELECT s FROM SupplierContact s WHERE s.scNo = :scNo")})
public class SupplierContact implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "scId")
    private Integer scId;
    @Basic(optional = false)
    @Column(name = "scNo")
    private String scNo;
    @JoinColumn(name = "scId", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Supplier supplier;

    public SupplierContact() {
    }

    public SupplierContact(Integer scId) {
        this.scId = scId;
    }

    public SupplierContact(Integer scId, String scNo) {
        this.scId = scId;
        this.scNo = scNo;
    }

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public String getScNo() {
        return scNo;
    }

    public void setScNo(String scNo) {
        this.scNo = scNo;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scId != null ? scId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SupplierContact)) {
            return false;
        }
        SupplierContact other = (SupplierContact) object;
        if ((this.scId == null && other.scId != null) || (this.scId != null && !this.scId.equals(other.scId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.SupplierContact[scId=" + scId + "]";
    }

}
