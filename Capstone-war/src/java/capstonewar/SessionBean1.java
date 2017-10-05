/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package capstonewar;

import admin.entity.ProductBrand;
import admin.entity.ProductType;
import admin.entity.ProductUnit;
import admin.entity.ProductVariance;
import admin.entity.Supplier;
import admin.entity.SupplierContact;
import admin.entity.SupplierPerson;
import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import javax.faces.FacesException;

/**
 * <p>Session scope data bean for your application.  Create properties
 *  here to represent cached data that should be made available across
 *  multiple HTTP requests for an individual user.</p>
 *
 * <p>An instance of this class will be created for you automatically,
 * the first time your application evaluates a value binding expression
 * or method binding expression that references a managed bean using
 * this class.</p>
 *
 * @version SessionBean1.java
 * @version Created on Aug 4, 2017, 9:21:53 PM
 * @author Jefferson Van
 */

public class SessionBean1 extends AbstractSessionBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    // </editor-fold>
    private Supplier supplier;
    private Supplier[] supplierData;
    private Supplier suppEntryforEdit;
    private Supplier[] suppEntryforEditArray;
    private SupplierContact supplierContact;
    private SupplierContact[] supplierContactData;
    private SupplierContact suppContactEntryforEdit;
    private SupplierContact[] suppContactEntryforEditArray;
    private SupplierPerson supplierPerson;
    private SupplierPerson[] supplierPersonData;
    private SupplierPerson suppPersonEntryforEdit;
    private SupplierPerson[] suppPersonEntryforEditArray;
    private ProductUnit productUnit;
    private ProductUnit[] productUnitData;
    private ProductUnit productUnitEdit;
    private ProductUnit[] productUnitEditArray;
    private ProductVariance productVariance;
    private ProductVariance[] productVarianceData;
    private ProductVariance productVarianceEdit;
    private ProductVariance[] productVarianceEditArray;
    private ProductBrand productBrand;
    private ProductBrand[] productBrandData;
    private ProductBrand productBrandEdit;
    private ProductBrand[] productBrandEditArray;
    private ProductType productType;
    private ProductType[] productTypeData;
    private ProductType productTypeEdit;
    private ProductType[] productTypeEditArray;

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public ProductType[] getProductTypeData() {
        return productTypeData;
    }

    public void setProductTypeData(ProductType[] productTypeData) {
        this.productTypeData = productTypeData;
    }

    public ProductType getProductTypeEdit() {
        return productTypeEdit;
    }

    public void setProductTypeEdit(ProductType productTypeEdit) {
        this.productTypeEdit = productTypeEdit;
    }

    public ProductType[] getProductTypeEditArray() {
        return productTypeEditArray;
    }

    public void setProductTypeEditArray(ProductType[] productTypeEditArray) {
        this.productTypeEditArray = productTypeEditArray;
    }

    public ProductBrand getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(ProductBrand productBrand) {
        this.productBrand = productBrand;
    }

    public ProductBrand[] getProductBrandData() {
        return productBrandData;
    }

    public void setProductBrandData(ProductBrand[] productBrandData) {
        this.productBrandData = productBrandData;
    }

    public ProductBrand getProductBrandEdit() {
        return productBrandEdit;
    }

    public void setProductBrandEdit(ProductBrand productBrandEdit) {
        this.productBrandEdit = productBrandEdit;
    }

    public ProductBrand[] getProductBrandEditArray() {
        return productBrandEditArray;
    }

    public void setProductBrandEditArray(ProductBrand[] productBrandEditArray) {
        this.productBrandEditArray = productBrandEditArray;
    }
    

    public ProductVariance getProductVariance() {
        return productVariance;
    }

    public void setProductVariance(ProductVariance productVariance) {
        this.productVariance = productVariance;
    }

    public ProductVariance[] getProductVarianceData() {
        return productVarianceData;
    }

    public void setProductVarianceData(ProductVariance[] productVarianceData) {
        this.productVarianceData = productVarianceData;
    }

    public ProductVariance getProductVarianceEdit() {
        return productVarianceEdit;
    }

    public void setProductVarianceEdit(ProductVariance productVarianceEdit) {
        this.productVarianceEdit = productVarianceEdit;
    }

    public ProductVariance[] getProductVarianceEditArray() {
        return productVarianceEditArray;
    }

    public void setProductVarianceEditArray(ProductVariance[] productVarianceEditArray) {
        this.productVarianceEditArray = productVarianceEditArray;
    }

    
    

    public ProductUnit getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(ProductUnit productUnit) {
        this.productUnit = productUnit;
    }

    public ProductUnit[] getProductUnitData() {
        return productUnitData;
    }

    public void setProductUnitData(ProductUnit[] productUnitData) {
        this.productUnitData = productUnitData;
    }

    public ProductUnit getProductUnitEdit() {
        return productUnitEdit;
    }

    public void setProductUnitEdit(ProductUnit productUnitEdit) {
        this.productUnitEdit = productUnitEdit;
    }

    public ProductUnit[] getProductUnitEditArray() {
        return productUnitEditArray;
    }

    public void setProductUnitEditArray(ProductUnit[] productUnitEditArray) {
        this.productUnitEditArray = productUnitEditArray;
    }

    public SupplierContact getSuppContactEntryforEdit() {
        return suppContactEntryforEdit;
    }

    public void setSuppContactEntryforEdit(SupplierContact suppContactEntryforEdit) {
        this.suppContactEntryforEdit = suppContactEntryforEdit;
    }

    public SupplierContact[] getSuppContactEntryforEditArray() {
        return suppContactEntryforEditArray;
    }

    public void setSuppContactEntryforEditArray(SupplierContact[] suppContactEntryforEditArray) {
        this.suppContactEntryforEditArray = suppContactEntryforEditArray;
    }

    public Supplier getSuppEntryforEdit() {
        return suppEntryforEdit;
    }

    public void setSuppEntryforEdit(Supplier suppEntryforEdit) {
        this.suppEntryforEdit = suppEntryforEdit;
    }

    public Supplier[] getSuppEntryforEditArray() {
        return suppEntryforEditArray;
    }

    public void setSuppEntryforEditArray(Supplier[] suppEntryforEditArray) {
        this.suppEntryforEditArray = suppEntryforEditArray;
    }

    public SupplierPerson getSuppPersonEntryforEdit() {
        return suppPersonEntryforEdit;
    }

    public void setSuppPersonEntryforEdit(SupplierPerson suppPersonEntryforEdit) {
        this.suppPersonEntryforEdit = suppPersonEntryforEdit;
    }

    public SupplierPerson[] getSuppPersonEntryforEditArray() {
        return suppPersonEntryforEditArray;
    }

    public void setSuppPersonEntryforEditArray(SupplierPerson[] suppPersonEntryforEditArray) {
        this.suppPersonEntryforEditArray = suppPersonEntryforEditArray;
    }


    public Supplier getSupplier() {
        return supplier;
    }

    public SupplierPerson getSupplierPerson() {
        return supplierPerson;
    }

    public void setSupplierPerson(SupplierPerson supplierPerson) {
        this.supplierPerson = supplierPerson;
    }

    public SupplierPerson[] getSupplierPersonData() {
        return supplierPersonData;
    }

    public void setSupplierPersonData(SupplierPerson[] supplierPersonData) {
        this.supplierPersonData = supplierPersonData;
    }

    public SupplierContact getSupplierContact() {
        return supplierContact;
    }

    public void setSupplierContact(SupplierContact supplierContact) {
        this.supplierContact = supplierContact;
    }

    public SupplierContact[] getSupplierContactData() {
        return supplierContactData;
    }

    public void setSupplierContactData(SupplierContact[] supplierContactData) {
        this.supplierContactData = supplierContactData;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Supplier[] getSupplierData() {
        return supplierData;
    }

    public void setSupplierData(Supplier[] supplierData) {
        this.supplierData = supplierData;
    }

   

    /**
     * <p>Construct a new session data bean instance.</p>
     */
    public SessionBean1() {

    }

    /**
     * <p>This method is called when this bean is initially added to
     * session scope.  Typically, this occurs as a result of evaluating
     * a value binding or method binding expression, which utilizes the
     * managed bean facility to instantiate this bean and store it into
     * session scope.</p>
     * 
     * <p>You may customize this method to initialize and cache data values
     * or resources that are required for the lifetime of a particular
     * user session.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("SessionBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>This method is called when the session containing it is about to be
     * passivated.  Typically, this occurs in a distributed servlet container
     * when the session is about to be transferred to a different
     * container instance, after which the <code>activate()</code> method
     * will be called to indicate that the transfer is complete.</p>
     * 
     * <p>You may customize this method to release references to session data
     * or resources that can not be serialized with the session itself.</p>
     */
    @Override
    public void passivate() {
    }

    /**
     * <p>This method is called when the session containing it was
     * reactivated.</p>
     * 
     * <p>You may customize this method to reacquire references to session
     * data or resources that could not be serialized with the
     * session itself.</p>
     */
    @Override
    public void activate() {
    }

    /**
     * <p>This method is called when this bean is removed from
     * session scope.  Typically, this occurs as a result of
     * the session timing out or being terminated by the application.</p>
     * 
     * <p>You may customize this method to clean up resources allocated
     * during the execution of the <code>init()</code> method, or
     * at any later time during the lifetime of the application.</p>
     */
    @Override
    public void destroy() {
    }
    
    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

}
