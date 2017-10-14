/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.DeliveryDetail;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jefferson Van
 */
@Local
public interface DeliveryDetailFacadeLocal {

    void create(DeliveryDetail deliveryDetail);

    void edit(DeliveryDetail deliveryDetail);

    void remove(DeliveryDetail deliveryDetail);

    DeliveryDetail find(Object id);

    List<DeliveryDetail> findAll();

}
