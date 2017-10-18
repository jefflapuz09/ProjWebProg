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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jefferson Van
 */
@Entity
@Table(name = "package_product")
@NamedQueries({@NamedQuery(name = "PackageProduct.findAll", query = "SELECT p FROM PackageProduct p"), @NamedQuery(name = "PackageProduct.findById", query = "SELECT p FROM PackageProduct p WHERE p.id = :id"), @NamedQuery(name = "PackageProduct.findByQuantity", query = "SELECT p FROM PackageProduct p WHERE p.quantity = :quantity"), @NamedQuery(name = "PackageProduct.findByIsActive", query = "SELECT p FROM PackageProduct p WHERE p.isActive = :isActive")})
public class PackageProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;
    @JoinColumn(name = "packageId", referencedColumnName = "id")
     private Integer packageId;
    @ManyToOne(optional = false)
    private Package pack;
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Integer productId;
    @ManyToOne(optional = false)
    private Product product;

    public PackageProduct() {
    }

    public PackageProduct(Integer id) {
        this.id = id;
    }

    public PackageProduct(Integer id, int quantity, boolean isActive) {
        this.id = id;
        this.quantity = quantity;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Package getPack() {
        return pack;
    }

    public void setPack(Package pack) {
        this.pack = pack;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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
        if (!(object instanceof PackageProduct)) {
            return false;
        }
        PackageProduct other = (PackageProduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.PackageProduct[id=" + id + "]";
    }

}
