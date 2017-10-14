/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.PurchaseHeader;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jefferson Van
 */
@Local
public interface PurchaseHeaderFacadeLocal {

    void create(PurchaseHeader purchaseHeader);

    void edit(PurchaseHeader purchaseHeader);

    void remove(PurchaseHeader purchaseHeader);

    PurchaseHeader find(Object id);

    List<PurchaseHeader> findAll();

    public boolean findThisRecord();

    public boolean findThisRecord(String search);

    public List<PurchaseHeader> findthisRecord(String search);

}
