/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.ProductType;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class ProductTypeFacade implements ProductTypeFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(ProductType productType) {
        em.persist(productType);
    }

    public void edit(ProductType productType) {
        em.merge(productType);
    }

    public void remove(ProductType productType) {
        em.remove(em.merge(productType));
    }

    public ProductType find(Object id) {
        return em.find(ProductType.class, id);
    }

    public List<ProductType> findAll() {
        return em.createQuery("select object(o) from ProductType as o").getResultList();
    }

}
