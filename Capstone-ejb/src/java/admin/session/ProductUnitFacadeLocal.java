/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.ProductUnit;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jefferson Van
 */
@Local
public interface ProductUnitFacadeLocal {

    void create(ProductUnit productUnit);

    void edit(ProductUnit productUnit);

    void remove(ProductUnit productUnit);

    ProductUnit find(Object id);

    List<ProductUnit> findAll();

}
