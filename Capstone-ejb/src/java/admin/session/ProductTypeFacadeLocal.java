/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.ProductType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jefferson Van
 */
@Local
public interface ProductTypeFacadeLocal {

    void create(ProductType productType);

    void edit(ProductType productType);

    void remove(ProductType productType);

    ProductType find(Object id);

    List<ProductType> findAll();

    public boolean findThisRecord();

    public boolean findThisRecord(String search);

    public List<ProductType> findthisRecord(String search);

}
