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
@Table(name = "supplier_person")
@NamedQueries({@NamedQuery(name = "SupplierPerson.findAll", query = "SELECT s FROM SupplierPerson s"), @NamedQuery(name = "SupplierPerson.findBySpId", query = "SELECT s FROM SupplierPerson s WHERE s.spId = :spId"), @NamedQuery(name = "SupplierPerson.findBySpName", query = "SELECT s FROM SupplierPerson s WHERE s.spName = :spName"), @NamedQuery(name = "SupplierPerson.findBySpContact", query = "SELECT s FROM SupplierPerson s WHERE s.spContact = :spContact"), @NamedQuery(name = "SupplierPerson.findByIsMain", query = "SELECT s FROM SupplierPerson s WHERE s.isMain = :isMain")})
public class SupplierPerson implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "spId")
    private Integer spId;
    @Basic(optional = false)
    @Column(name = "spName")
    private String spName;
    @Basic(optional = false)
    @Column(name = "spContact")
    private String spContact;
    @Basic(optional = false)
    @Column(name = "isMain")
    private boolean isMain;
    @JoinColumn(name = "spId", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Supplier supplier;

    public SupplierPerson() {
    }

    public SupplierPerson(Integer spId) {
        this.spId = spId;
    }

    public SupplierPerson(Integer spId, String spName, String spContact, boolean isMain) {
        this.spId = spId;
        this.spName = spName;
        this.spContact = spContact;
        this.isMain = isMain;
    }

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public String getSpContact() {
        return spContact;
    }

    public void setSpContact(String spContact) {
        this.spContact = spContact;
    }

    public boolean getIsMain() {
        return isMain;
    }

    public void setIsMain(boolean isMain) {
        this.isMain = isMain;
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
        hash += (spId != null ? spId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SupplierPerson)) {
            return false;
        }
        SupplierPerson other = (SupplierPerson) object;
        if ((this.spId == null && other.spId != null) || (this.spId != null && !this.spId.equals(other.spId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.SupplierPerson[spId=" + spId + "]";
    }

}
