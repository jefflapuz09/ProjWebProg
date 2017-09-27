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
import javax.persistence.Lob;
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
@Table(name = "product_unit")
@NamedQueries({@NamedQuery(name = "ProductUnit.findAll", query = "SELECT p FROM ProductUnit p"), @NamedQuery(name = "ProductUnit.findById", query = "SELECT p FROM ProductUnit p WHERE p.id = :id"), @NamedQuery(name = "ProductUnit.findByName", query = "SELECT p FROM ProductUnit p WHERE p.name = :name"), @NamedQuery(name = "ProductUnit.findByCategory", query = "SELECT p FROM ProductUnit p WHERE p.category = :category"), @NamedQuery(name = "ProductUnit.findByIsActive", query = "SELECT p FROM ProductUnit p WHERE p.isActive = :isActive")})

@NamedNativeQueries({
    @NamedNativeQuery(name="ProductUnit.findByUnit",query="Select * from product_unit where name=?",resultClass=ProductUnit.class)
 

})

public class ProductUnit implements Serializable {
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
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "category")
    private short category;
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;

    public ProductUnit() {
    }

    public ProductUnit(Integer id) {
        this.id = id;
    }

    public ProductUnit(Integer id, String name, String description, short category, boolean isActive) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public short getCategory() {
        return category;
    }

    public void setCategory(short category) {
        this.category = category;
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
        if (!(object instanceof ProductUnit)) {
            return false;
        }
        ProductUnit other = (ProductUnit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.ProductUnit[id=" + id + "]";
    }

}
