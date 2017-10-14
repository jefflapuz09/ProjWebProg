/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.PurchaseDetail;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jefferson Van
 */
@Local
public interface PurchaseDetailFacadeLocal {

    void create(PurchaseDetail purchaseDetail);

    void edit(PurchaseDetail purchaseDetail);

    void remove(PurchaseDetail purchaseDetail);

    PurchaseDetail find(Object id);

    List<PurchaseDetail> findAll();

}
