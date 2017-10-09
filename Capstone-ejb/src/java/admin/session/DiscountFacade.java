/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.Discount;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class DiscountFacade implements DiscountFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Discount discount) {
        em.persist(discount);
    }

    public void edit(Discount discount) {
        em.merge(discount);
    }

    public void remove(Discount discount) {
        em.remove(em.merge(discount));
    }

    public Discount find(Object id) {
        return em.find(Discount.class, id);
    }

    public List<Discount> findAll() {
        return em.createQuery("select object(o) from Discount as o").getResultList();
    }

    public boolean findThisRecord(String search) {
        List<Discount> caseList = em.createNamedQuery("Discount.findByName")
               .setParameter(1,search )
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

    public List<Discount> findthisRecord(String search) {
        List<Discount> caseList = em.createNamedQuery("Discount.findByName")
               .setParameter(1, search)
               .getResultList();
       if(caseList.size()>0){
        return caseList;
       }
       return null;
    }

    public boolean findThisRecord() {
        List<Discount> caseList = em.createNamedQuery("Discount.findByName")
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

}
