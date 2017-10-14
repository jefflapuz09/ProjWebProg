/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.DeliveryHeader;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class DeliveryHeaderFacade implements DeliveryHeaderFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(DeliveryHeader deliveryHeader) {
        em.persist(deliveryHeader);
    }

    public void edit(DeliveryHeader deliveryHeader) {
        em.merge(deliveryHeader);
    }

    public void remove(DeliveryHeader deliveryHeader) {
        em.remove(em.merge(deliveryHeader));
    }

    public DeliveryHeader find(Object id) {
        return em.find(DeliveryHeader.class, id);
    }

    public List<DeliveryHeader> findAll() {
        return em.createQuery("select object(o) from DeliveryHeader as o").getResultList();
    }

    public boolean findThisRecord(String search) {
        List<DeliveryHeader> caseList = em.createNamedQuery("DeliveryHeader.findById")
               .setParameter(1,search )
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

    public List<DeliveryHeader> findthisRecord(String search) {
        List<DeliveryHeader> caseList = em.createNamedQuery("DeliveryHeader.findById")
               .setParameter(1, search)
               .getResultList();
       if(caseList.size()>0){
        return caseList;
       }
       return null;
    }

    public boolean findThisRecord() {
        List<DeliveryHeader> caseList = em.createNamedQuery("DeliveryHeader.findById")
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

}
