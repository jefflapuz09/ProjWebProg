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
@Table(name = "product_brand")
@NamedQueries({@NamedQuery(name = "ProductBrand.findAll", query = "SELECT p FROM ProductBrand p"), @NamedQuery(name = "ProductBrand.findById", query = "SELECT p FROM ProductBrand p WHERE p.id = :id"), @NamedQuery(name = "ProductBrand.findByName", query = "SELECT p FROM ProductBrand p WHERE p.name = :name"), @NamedQuery(name = "ProductBrand.findByIsActive", query = "SELECT p FROM ProductBrand p WHERE p.isActive = :isActive")})

@NamedNativeQueries({
    @NamedNativeQuery(name="ProductBrand.findByName",query="Select * from product_brand where name=?",resultClass=ProductBrand.class)
 

})

public class ProductBrand implements Serializable {
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
    @Column(name = "isActive")
    private boolean isActive;

    public ProductBrand() {
    }

    public ProductBrand(Integer id) {
        this.id = id;
    }

    public ProductBrand(Integer id, String name, boolean isActive) {
        this.id = id;
        this.name = name;
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
        if (!(object instanceof ProductBrand)) {
            return false;
        }
        ProductBrand other = (ProductBrand) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.ProductBrand[id=" + id + "]";
    }

}
