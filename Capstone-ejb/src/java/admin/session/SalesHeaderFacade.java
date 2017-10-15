/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.SalesHeader;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class SalesHeaderFacade implements SalesHeaderFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(SalesHeader salesHeader) {
        em.persist(salesHeader);
    }

    public void edit(SalesHeader salesHeader) {
        em.merge(salesHeader);
    }

    public void remove(SalesHeader salesHeader) {
        em.remove(em.merge(salesHeader));
    }

    public SalesHeader find(Object id) {
        return em.find(SalesHeader.class, id);
    }

    public List<SalesHeader> findAll() {
        return em.createQuery("select object(o) from SalesHeader as o").getResultList();
    }

     public boolean findThisRecord(String search) {
        List<SalesHeader> caseList = em.createNamedQuery("SalesHeader.findById")
               .setParameter(1,search )
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

    public List<SalesHeader> findthisRecord(String search) {
        List<SalesHeader> caseList = em.createNamedQuery("SalesHeader.findById")
               .setParameter(1, search)
               .getResultList();
       if(caseList.size()>0){
        return caseList;
       }
       return null;
    }

    public boolean findThisRecord() {
        List<SalesHeader> caseList = em.createNamedQuery("SalesHeader.findById")
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

}
