/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.Promo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jefferson Van
 */
@Local
public interface PromoFacadeLocal {

    void create(Promo promo);

    void edit(Promo promo);

    void remove(Promo promo);

    Promo find(Object id);

    List<Promo> findAll();

    public boolean findThisRecord();

    public boolean findThisRecord(String search);

    public List<Promo> findthisRecord(String search);

}
