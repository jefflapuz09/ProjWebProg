/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.ProductBrand;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class ProductBrandFacade implements ProductBrandFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(ProductBrand productBrand) {
        em.persist(productBrand);
    }

    public void edit(ProductBrand productBrand) {
        em.merge(productBrand);
    }

    public void remove(ProductBrand productBrand) {
        em.remove(em.merge(productBrand));
    }

    public ProductBrand find(Object id) {
        return em.find(ProductBrand.class, id);
    }

    public List<ProductBrand> findAll() {
        return em.createQuery("select object(o) from ProductBrand as o").getResultList();
    }

    public boolean findThisRecord(String search) {
        List<ProductBrand> caseList = em.createNamedQuery("ProductBrand.findByName")
               .setParameter(1,search )
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

    public List<ProductBrand> findthisRecord(String search) {
        List<ProductBrand> caseList = em.createNamedQuery("ProductBrand.findByName")
               .setParameter(1, search)
               .getResultList();
       if(caseList.size()>0){
        return caseList;
       }
       return null;
    }

    public boolean findThisRecord() {
        List<ProductBrand> caseList = em.createNamedQuery("ProductBrand.findByName")
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

    public boolean checkItemName(String name) {
        List<ProductBrand> i = em.createNamedQuery("ProductBrand.checkItemName")
                .setParameter(1, name)
                .getResultList();
        if(i.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
