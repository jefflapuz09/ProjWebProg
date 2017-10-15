/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.SalesHeader;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jefferson Van
 */
@Local
public interface SalesHeaderFacadeLocal {

    void create(SalesHeader salesHeader);

    void edit(SalesHeader salesHeader);

    void remove(SalesHeader salesHeader);

    SalesHeader find(Object id);

    List<SalesHeader> findAll();

    public boolean findThisRecord();

    public boolean findThisRecord(String search);

    public List<SalesHeader> findthisRecord(String search);

}
