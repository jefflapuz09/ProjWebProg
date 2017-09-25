/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.SupplierPerson;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class SupplierPersonFacade implements SupplierPersonFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(SupplierPerson supplierPerson) {
        em.persist(supplierPerson);
    }

    public void edit(SupplierPerson supplierPerson) {
        em.merge(supplierPerson);
    }

    public void remove(SupplierPerson supplierPerson) {
        em.remove(em.merge(supplierPerson));
    }

    public SupplierPerson find(Object id) {
        return em.find(SupplierPerson.class, id);
    }

    public List<SupplierPerson> findAll() {
        return em.createQuery("select object(o) from SupplierPerson as o").getResultList();
    }

}
