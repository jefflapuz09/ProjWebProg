/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.DeliveryDetail;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class DeliveryDetailFacade implements DeliveryDetailFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(DeliveryDetail deliveryDetail) {
        em.persist(deliveryDetail);
    }

    public void edit(DeliveryDetail deliveryDetail) {
        em.merge(deliveryDetail);
    }

    public void remove(DeliveryDetail deliveryDetail) {
        em.remove(em.merge(deliveryDetail));
    }

    public DeliveryDetail find(Object id) {
        return em.find(DeliveryDetail.class, id);
    }

    public List<DeliveryDetail> findAll() {
        return em.createQuery("select object(o) from DeliveryDetail as o").getResultList();
    }

}
