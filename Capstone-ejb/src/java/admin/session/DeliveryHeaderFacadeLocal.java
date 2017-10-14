/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.DeliveryHeader;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jefferson Van
 */
@Local
public interface DeliveryHeaderFacadeLocal {

    void create(DeliveryHeader deliveryHeader);

    void edit(DeliveryHeader deliveryHeader);

    void remove(DeliveryHeader deliveryHeader);

    DeliveryHeader find(Object id);

    List<DeliveryHeader> findAll();

    public boolean findThisRecord();

    public boolean findThisRecord(String search);

    public List<DeliveryHeader> findthisRecord(String search);

}
