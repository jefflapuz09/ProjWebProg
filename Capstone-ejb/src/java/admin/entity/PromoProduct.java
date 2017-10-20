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
@Table(name = "promo_product")
@NamedQueries({@NamedQuery(name = "PromoProduct.findAll", query = "SELECT p FROM PromoProduct p"), @NamedQuery(name = "PromoProduct.findById", query = "SELECT p FROM PromoProduct p WHERE p.id = :id"), @NamedQuery(name = "PromoProduct.findByQuantity", query = "SELECT p FROM PromoProduct p WHERE p.quantity = :quantity"), @NamedQuery(name = "PromoProduct.findByFreeQuantity", query = "SELECT p FROM PromoProduct p WHERE p.freeQuantity = :freeQuantity"), @NamedQuery(name = "PromoProduct.findByIsActive", query = "SELECT p FROM PromoProduct p WHERE p.isActive = :isActive")})
public class PromoProduct implements Serializable {
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
    @Column(name = "freeQuantity")
    private int freeQuantity;
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;
    @JoinColumn(name = "productId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Product productId;
    @JoinColumn(name = "promoId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Promo promoId;

    public PromoProduct() {
    }

    public PromoProduct(Integer id) {
        this.id = id;
    }

    public PromoProduct(Integer id, int quantity, int freeQuantity, boolean isActive) {
        this.id = id;
        this.quantity = quantity;
        this.freeQuantity = freeQuantity;
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

    public int getFreeQuantity() {
        return freeQuantity;
    }

    public void setFreeQuantity(int freeQuantity) {
        this.freeQuantity = freeQuantity;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Promo getPromoId() {
        return promoId;
    }

    public void setPromoId(Promo promoId) {
        this.promoId = promoId;
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
        if (!(object instanceof PromoProduct)) {
            return false;
        }
        PromoProduct other = (PromoProduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.entity.PromoProduct[id=" + id + "]";
    }

}
