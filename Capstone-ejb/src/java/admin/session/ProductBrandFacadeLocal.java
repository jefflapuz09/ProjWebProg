/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.ProductBrand;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jefferson Van
 */
@Local
public interface ProductBrandFacadeLocal {

    void create(ProductBrand productBrand);

    void edit(ProductBrand productBrand);

    void remove(ProductBrand productBrand);

    ProductBrand find(Object id);

    List<ProductBrand> findAll();

    public boolean findThisRecord();

    public boolean findThisRecord(String search);

    public List<ProductBrand> findthisRecord(String search);

    public boolean checkItemName(String name);
    

}
