/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.PurchaseHeader;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class PurchaseHeaderFacade implements PurchaseHeaderFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(PurchaseHeader purchaseHeader) {
        em.persist(purchaseHeader);
    }

    public void edit(PurchaseHeader purchaseHeader) {
        em.merge(purchaseHeader);
    }

    public void remove(PurchaseHeader purchaseHeader) {
        em.remove(em.merge(purchaseHeader));
    }

    public PurchaseHeader find(Object id) {
        return em.find(PurchaseHeader.class, id);
    }

    public List<PurchaseHeader> findAll() {
        return em.createQuery("select object(o) from PurchaseHeader as o").getResultList();
    }

    public boolean findThisRecord(String search) {
        List<PurchaseHeader> caseList = em.createNamedQuery("PurchaseHeader.findById")
               .setParameter(1,search )
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

    public List<PurchaseHeader> findthisRecord(String search) {
        List<PurchaseHeader> caseList = em.createNamedQuery("PurchaseHeader.findById")
               .setParameter(1, search)
               .getResultList();
       if(caseList.size()>0){
        return caseList;
       }
       return null;
    }

    public boolean findThisRecord() {
        List<PurchaseHeader> caseList = em.createNamedQuery("PurchaseHeader.findById")
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

}
