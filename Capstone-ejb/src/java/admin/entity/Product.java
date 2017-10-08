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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "product")
@NamedQueries({@NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"), @NamedQuery(name = "Product.findById", query = "SELECT p FROM Product p WHERE p.id = :id"), @NamedQuery(name = "Product.findByName", query = "SELECT p FROM Product p WHERE p.name = :name"), @NamedQuery(name = "Product.findByPrice", query = "SELECT p FROM Product p WHERE p.price = :price"), @NamedQuery(name = "Product.findByReorder", query = "SELECT p FROM Product p WHERE p.reorder = :reorder"), @NamedQuery(name = "Product.findByIsOriginal", query = "SELECT p FROM Product p WHERE p.isOriginal = :isOriginal"), @NamedQuery(name = "Product.findByIsActive", query = "SELECT p FROM Product p WHERE p.isActive = :isActive")})


@NamedNativeQueries({
    @NamedNativeQuery(name="Product.findByName",query="Select * from product where name=?",resultClass=Product.class)
 

})

public class Product implements Serializable {
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
    @Column(name = "price")
    private double price;
    @Basic(optional = false)
    @Column(name = "reorder")
    private int reorder;
    @Column(name = "isOriginal")
    private String isOriginal;
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;
    @JoinColumn(name = "brandId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ProductBrand brandId;
    @JoinColumn(name = "typeId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ProductType typeId;
    @JoinColumn(name = "varianceId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ProductVariance varianceId;

    public Product() {
    }

    public Product(Integer id) {
        this.id = id;
    }

    public Product(Integer id, String name, String description, double price, int reorder, boolean isActive) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.reorder = reorder;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReorder() {
        return reorder;
    }

    public void setReorder(int reorder) {
        this.reorder = reorder;
    }

    public String getIsOriginal() {
        return isOriginal;
    }

    public void setIsOriginal(String isOriginal) {
        this.isOriginal = isOriginal;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public ProductBrand getBrandId() {
        return brandId;
    }

    public void setBrandId(ProductBrand brandId) {
        this.brandId = brandId;
    }

    public ProductType getTypeId() {
        return typeId;
    }

    public void setTypeId(ProductType typeId) {
        this.typeId = typeId;
    }

    public ProductVariance getVarianceId() {
        return varianceId;
    }

    public void setVarianceId(ProductVariance varianceId) {
        this.varianceId = varianceId;
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
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.Product[id=" + id + "]";
    }

}
