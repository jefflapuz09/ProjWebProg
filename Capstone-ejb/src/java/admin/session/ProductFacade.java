/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.Product;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class ProductFacade implements ProductFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Product product) {
        em.persist(product);
    }

    public void edit(Product product) {
        em.merge(product);
    }

    public void remove(Product product) {
        em.remove(em.merge(product));
    }

    public Product find(Object id) {
        return em.find(Product.class, id);
    }

    public List<Product> findAll() {
        return em.createQuery("select object(o) from Product as o").getResultList();
    }

        public boolean findThisRecord(String search) {
        List<Product> caseList = em.createNamedQuery("Product.findByName")
               .setParameter(1,search )
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

    public List<Product> findthisRecord(String search) {
        List<Product> caseList = em.createNamedQuery("Product.findByName")
               .setParameter(1, search)
               .getResultList();
       if(caseList.size()>0){
        return caseList;
       }
       return null;
    }

    public boolean findThisRecord() {
        List<Product> caseList = em.createNamedQuery("Product.findByName")
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

}
