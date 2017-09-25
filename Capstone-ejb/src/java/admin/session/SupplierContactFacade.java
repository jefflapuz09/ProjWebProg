/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.SupplierContact;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class SupplierContactFacade implements SupplierContactFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(SupplierContact supplierContact) {
        em.persist(supplierContact);
    }

    public void edit(SupplierContact supplierContact) {
        em.merge(supplierContact);
    }

    public void remove(SupplierContact supplierContact) {
        em.remove(em.merge(supplierContact));
    }

    public SupplierContact find(Object id) {
        return em.find(SupplierContact.class, id);
    }

    public List<SupplierContact> findAll() {
        return em.createQuery("select object(o) from SupplierContact as o").getResultList();
    }

}
