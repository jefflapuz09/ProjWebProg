/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.Supplier;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class SupplierFacade implements SupplierFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Supplier supplier) {
        em.persist(supplier);
    }

    public void edit(Supplier supplier) {
        em.merge(supplier);
    }

    public void remove(Supplier supplier) {
        em.remove(em.merge(supplier));
    }

    public Supplier find(Object id) {
        return em.find(Supplier.class, id);
    }

    public List<Supplier> findAll() {
        return em.createQuery("select object(o) from Supplier as o").getResultList();
    }

    public boolean findThisRecord(String search) {
        List<Supplier> caseList = em.createNamedQuery("Supplier.findByName")
               .setParameter(1,search )
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

    public List<Supplier> findthisRecord(String search) {
        List<Supplier> caseList = em.createNamedQuery("Supplier.findByName")
               .setParameter(1, search)
               .getResultList();
       if(caseList.size()>0){
        return caseList;
       }
       return null;
    }

    public boolean findThisRecord() {
        List<Supplier> caseList = em.createNamedQuery("Supplier.findByName")
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

    public boolean checkSupplier(String supplierName) {
        List<Supplier> i = em.createNamedQuery("Supplier.checkSupplier")
                .setParameter(1, supplierName)
                .getResultList();
        if(i.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
  

}
