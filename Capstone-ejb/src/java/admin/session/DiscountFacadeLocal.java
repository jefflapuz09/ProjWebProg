/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.Discount;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jefferson Van
 */
@Local
public interface DiscountFacadeLocal {

    void create(Discount discount);

    void edit(Discount discount);

    void remove(Discount discount);

    Discount find(Object id);

    List<Discount> findAll();

    public boolean findThisRecord();

    public boolean findThisRecord(String search);

    public List<Discount> findthisRecord(String search);

}
