/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.SupplierContact;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jefferson Van
 */
@Local
public interface SupplierContactFacadeLocal {

    void create(SupplierContact supplierContact);

    void edit(SupplierContact supplierContact);

    void remove(SupplierContact supplierContact);

    SupplierContact find(Object id);

    List<SupplierContact> findAll();

}
