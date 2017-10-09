/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.Package;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class PackageFacade implements PackageFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Package Package) {
        em.persist(Package);
    }

    public void edit(Package Package) {
        em.merge(Package);
    }

    public void remove(Package Package) {
        em.remove(em.merge(Package));
    }

    public Package find(Object id) {
        return em.find(Package.class, id);
    }

    public List<Package> findAll() {
        return em.createQuery("select object(o) from Package as o").getResultList();
    }

     public boolean findThisRecord(String search) {
        List<Package> caseList = em.createNamedQuery("Package.findByName")
               .setParameter(1,search )
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

    public List<Package> findthisRecord(String search) {
        List<Package> caseList = em.createNamedQuery("Package.findByName")
               .setParameter(1, search)
               .getResultList();
       if(caseList.size()>0){
        return caseList;
       }
       return null;
    }

    public boolean findThisRecord() {
        List<Package> caseList = em.createNamedQuery("Package.findByName")
               .getResultList();
        if(caseList.size()>0){
             return true;
        }
        return false;
    }

}
