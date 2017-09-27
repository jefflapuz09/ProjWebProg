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

        public boolean findThisRecord(String search) {
        List<ProductUnit> caseList = em.createNamedQuery("ProductUnit.findByUnit")
               .setParameter(1,search )
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

    public List<ProductUnit> findthisRecord(String search) {
        List<ProductUnit> caseList = em.createNamedQuery("ProductUnit.findByUnit")
               .setParameter(1, search)
               .getResultList();
       if(caseList.size()>0){
        return caseList;
       }
       return null;
    }

    public boolean findThisRecord() {
        List<ProductUnit> caseList = em.createNamedQuery("ProductUnit.findByUnit")
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

}
