/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.session;

import admin.entity.ProductVariance;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jefferson Van
 */
@Local
public interface ProductVarianceFacadeLocal {

    void create(ProductVariance productVariance);

    void edit(ProductVariance productVariance);

    void remove(ProductVariance productVariance);

    ProductVariance find(Object id);

    List<ProductVariance> findAll();

    public boolean findThisRecord();

    public boolean findThisRecord(String search);

    public List<ProductVariance> findthisRecord(String search);

    public boolean checkItemName(String name);

}
