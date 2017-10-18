/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Jefferson Van
 */
@Entity
@Table(name = "product_variance")
@NamedQueries({@NamedQuery(name = "ProductVariance.findAll", query = "SELECT p FROM ProductVariance p"), @NamedQuery(name = "ProductVariance.findById", query = "SELECT p FROM ProductVariance p WHERE p.id = :id"), @NamedQuery(name = "ProductVariance.findByName", query = "SELECT p FROM ProductVariance p WHERE p.name = :name"), @NamedQuery(name = "ProductVariance.findByIsActive", query = "SELECT p FROM ProductVariance p WHERE p.isActive = :isActive")})

@NamedNativeQueries({
    @NamedNativeQuery(name="ProductVariance.findByName",query="Select * from product_variance where name=?",resultClass=ProductVariance.class),
    @NamedNativeQuery(name="ProductVariance.checkItemName",query="Select * from product_variance where name=?",resultClass=ProductVariance.class)


})

public class ProductVariance implements Serializable {
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
    @Column(name = "size")
    private String size;
    @Basic(optional = false)
    @Lob
    @Column(name = "units")
    private String units;
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;
    @ManyToMany(mappedBy = "productVarianceCollection")
    private List<ProductType> productTypeCollection;

    @Transient
    private String prodType;

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }
    public ProductVariance() {
    }

    public ProductVariance(Integer id) {
        this.id = id;
    }

    public ProductVariance(Integer id, String name, String size, String units, boolean isActive) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.units = units;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public List<ProductType> getProductTypeCollection() {
        return productTypeCollection;
    }

    public void setProductTypeCollection(List<ProductType> productTypeCollection) {
        this.productTypeCollection = productTypeCollection;
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
        if (!(object instanceof ProductVariance)) {
            return false;
        }
        ProductVariance other = (ProductVariance) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.ProductVariance[id=" + id + "]";
    }

}
