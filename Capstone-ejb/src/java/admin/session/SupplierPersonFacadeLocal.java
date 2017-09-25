/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.SupplierPerson;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jefferson Van
 */
@Local
public interface SupplierPersonFacadeLocal {

    void create(SupplierPerson supplierPerson);

    void edit(SupplierPerson supplierPerson);

    void remove(SupplierPerson supplierPerson);

    SupplierPerson find(Object id);

    List<SupplierPerson> findAll();

}
