/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.Promo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class PromoFacade implements PromoFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Promo promo) {
        em.persist(promo);
    }

    public void edit(Promo promo) {
        em.merge(promo);
    }

    public void remove(Promo promo) {
        em.remove(em.merge(promo));
    }

    public Promo find(Object id) {
        return em.find(Promo.class, id);
    }

    public List<Promo> findAll() {
        return em.createQuery("select object(o) from Promo as o").getResultList();
    }

    public boolean findThisRecord(String search) {
        List<Promo> caseList = em.createNamedQuery("Promo.findByName")
               .setParameter(1,search )
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

    public List<Promo> findthisRecord(String search) {
        List<Promo> caseList = em.createNamedQuery("Promo.findByName")
               .setParameter(1, search)
               .getResultList();
       if(caseList.size()>0){
        return caseList;
       }
       return null;
    }

    public boolean findThisRecord() {
        List<Promo> caseList = em.createNamedQuery("Promo.findByName")
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

}
