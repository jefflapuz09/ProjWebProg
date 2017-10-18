/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.PackageProduct;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson Van
 */
@Stateless
public class PackageProductFacade implements PackageProductFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(PackageProduct packageProduct) {
        em.persist(packageProduct);
    }

    public void edit(PackageProduct packageProduct) {
        em.merge(packageProduct);
    }

    public void remove(PackageProduct packageProduct) {
        em.remove(em.merge(packageProduct));
    }

    public PackageProduct find(Object id) {
        return em.find(PackageProduct.class, id);
    }

    public List<PackageProduct> findAll() {
        return em.createQuery("select object(o) from PackageProduct as o").getResultList();
    }

}
