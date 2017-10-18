/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.PackageProduct;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jefferson Van
 */
@Local
public interface PackageProductFacadeLocal {

    void create(PackageProduct packageProduct);

    void edit(PackageProduct packageProduct);

    void remove(PackageProduct packageProduct);

    PackageProduct find(Object id);

    List<PackageProduct> findAll();

}
