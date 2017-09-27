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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jefferson Van
 */
@Entity
@Table(name = "product_type")
@NamedQueries({@NamedQuery(name = "ProductType.findAll", query = "SELECT p FROM ProductType p"), @NamedQuery(name = "ProductType.findById", query = "SELECT p FROM ProductType p WHERE p.id = :id"), @NamedQuery(name = "ProductType.findByName", query = "SELECT p FROM ProductType p WHERE p.name = :name"), @NamedQuery(name = "ProductType.findByCategory", query = "SELECT p FROM ProductType p WHERE p.category = :category"), @NamedQuery(name = "ProductType.findByIsActive", query = "SELECT p FROM ProductType p WHERE p.isActive = :isActive")})
public class ProductType implements Serializable {
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
    @Column(name = "category")
    private String category;
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;
    @JoinTable(name = "type_variance", joinColumns = {@JoinColumn(name = "typeId", referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "varianceId", referencedColumnName = "id")})
    @ManyToMany
    private List<ProductVariance> productVarianceCollection;

    public ProductType() {
    }

    public ProductType(Integer id) {
        this.id = id;
    }

    public ProductType(Integer id, String name, String category, boolean isActive) {
        this.id = id;
        this.name = name;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public List<ProductVariance> getProductVarianceCollection() {
        return productVarianceCollection;
    }

    public void setProductVarianceCollection(List<ProductVariance> productVarianceCollection) {
        this.productVarianceCollection = productVarianceCollection;
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
        if (!(object instanceof ProductType)) {
            return false;
        }
        ProductType other = (ProductType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.ProductType[id=" + id + "]";
    }

}
