/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.ProductVariance;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class ProductVarianceFacade implements ProductVarianceFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(ProductVariance productVariance) {
        em.persist(productVariance);
    }

    public void edit(ProductVariance productVariance) {
        em.merge(productVariance);
    }

    public void remove(ProductVariance productVariance) {
        em.remove(em.merge(productVariance));
    }

    public ProductVariance find(Object id) {
        return em.find(ProductVariance.class, id);
    }

    public List<ProductVariance> findAll() {
        return em.createQuery("select object(o) from ProductVariance as o").getResultList();
    }

    public boolean findThisRecord(String search) {
        List<ProductVariance> caseList = em.createNamedQuery("ProductVariance.findByName")
               .setParameter(1,search )
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

    public List<ProductVariance> findthisRecord(String search) {
        List<ProductVariance> caseList = em.createNamedQuery("ProductVariance.findByName")
               .setParameter(1, search)
               .getResultList();
       if(caseList.size()>0){
        return caseList;
       }
       return null;
    }

    public boolean findThisRecord() {
        List<ProductVariance> caseList = em.createNamedQuery("ProductVariance.findByName")
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }
}
