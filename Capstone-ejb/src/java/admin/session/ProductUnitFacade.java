/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.ProductUnit;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class ProductUnitFacade implements ProductUnitFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(ProductUnit productUnit) {
        em.persist(productUnit);
    }

    public void edit(ProductUnit productUnit) {
        em.merge(productUnit);
    }

    public void remove(ProductUnit productUnit) {
        em.remove(em.merge(productUnit));
    }

    public ProductUnit find(Object id) {
        return em.find(ProductUnit.class, id);
    }

    public List<ProductUnit> findAll() {
        return em.createQuery("select object(o) from ProductUnit as o").getResultList();
    }

}
