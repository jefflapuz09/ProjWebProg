/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.PurchaseDetail;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class PurchaseDetailFacade implements PurchaseDetailFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(PurchaseDetail purchaseDetail) {
        em.persist(purchaseDetail);
    }

    public void edit(PurchaseDetail purchaseDetail) {
        em.merge(purchaseDetail);
    }

    public void remove(PurchaseDetail purchaseDetail) {
        em.remove(em.merge(purchaseDetail));
    }

    public PurchaseDetail find(Object id) {
        return em.find(PurchaseDetail.class, id);
    }

    public List<PurchaseDetail> findAll() {
        return em.createQuery("select object(o) from PurchaseDetail as o").getResultList();
    }

}
