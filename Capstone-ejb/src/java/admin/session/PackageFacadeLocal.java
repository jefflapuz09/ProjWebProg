/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.Package;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jefferson Van
 */
@Local
public interface PackageFacadeLocal {

    void create(Package Package);

    void edit(Package Package);

    void remove(Package Package);

    Package find(Object id);

    List<Package> findAll();

     public boolean findThisRecord();

    public boolean findThisRecord(String search);

    public List<Package> findthisRecord(String search);

}
