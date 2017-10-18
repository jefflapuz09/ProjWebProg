/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Jefferson Van
 */
@Entity
@Table(name = "supplier")
@NamedQueries({@NamedQuery(name = "Supplier.findAll", query = "SELECT s FROM Supplier s"), @NamedQuery(name = "Supplier.findById", query = "SELECT s FROM Supplier s WHERE s.id = :id"), @NamedQuery(name = "Supplier.findByName", query = "SELECT s FROM Supplier s WHERE s.name = :name"), @NamedQuery(name = "Supplier.findByIsActive", query = "SELECT s FROM Supplier s WHERE s.isActive = :isActive")})

@NamedNativeQueries({
    @NamedNativeQuery(name="Supplier.findByName",query="Select * from supplier where name=?",resultClass=Supplier.class),
    @NamedNativeQuery(name="Supplier.checkSupplier",query="Select * from supplier where name=?",resultClass=Supplier.class)
 

})

public class Supplier implements Serializable {
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
    @Lob
    @Column(name = "street")
    private String street;
    @Basic(optional = false)
    @Lob
    @Column(name = "brgy")
    private String brgy;
    @Basic(optional = false)
    @Lob
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "supplier")
    private SupplierPerson supplierPerson;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "supplier")
    private SupplierContact supplierContact;
    @Transient
    private String suppPerson;
    @Transient
    private String suppContact;

    public String getSuppContact() {
        return suppContact;
    }

    public void setSuppContact(String suppContact) {
        this.suppContact = suppContact;
    }

    public String getSuppPerson() {
        return suppPerson;
    }

    public void setSuppPerson(String suppPerson) {
        this.suppPerson = suppPerson;
    }

    

    public Supplier() {
    }

    public Supplier(Integer id) {
        this.id = id;
    }

    public Supplier(Integer id, String name, String street, String brgy, String city, boolean isActive) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.brgy = brgy;
        this.city = city;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBrgy() {
        return brgy;
    }

    public void setBrgy(String brgy) {
        this.brgy = brgy;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public SupplierPerson getSupplierPerson() {
        return supplierPerson;
    }

    public void setSupplierPerson(SupplierPerson supplierPerson) {
        this.supplierPerson = supplierPerson;
    }

    public SupplierContact getSupplierContact() {
        return supplierContact;
    }

    public void setSupplierContact(SupplierContact supplierContact) {
        this.supplierContact = supplierContact;
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
        if (!(object instanceof Supplier)) {
            return false;
        }
        Supplier other = (Supplier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.Supplier[id=" + id + "]";
    }

}
