/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package capstonewar.pages;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Hyperlink;
import javax.faces.FacesException;
import capstonewar.ApplicationBean1;
import capstonewar.SessionBean1;
import capstonewar.RequestBean1;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Menu.java
 * @version Created on Oct 1, 2017, 1:16:57 PM
 * @author Jefferson Van
 */

public class Menu extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private Hyperlink btnReceive = new Hyperlink();

    public Hyperlink getBtnReceive() {
        return btnReceive;
    }

    public void setBtnReceive(Hyperlink h) {
        this.btnReceive = h;
    }
    private Hyperlink btnPurchase = new Hyperlink();

    public Hyperlink getBtnPurchase() {
        return btnPurchase;
    }

    public void setBtnPurchase(Hyperlink h) {
        this.btnPurchase = h;
    }
    private Hyperlink btnTransaction = new Hyperlink();

    public Hyperlink getBtnTransaction() {
        return btnTransaction;
    }

    public void setBtnTransaction(Hyperlink h) {
        this.btnTransaction = h;
    }
    private Hyperlink btnVariance = new Hyperlink();

    public Hyperlink getBtnVariance() {
        return btnVariance;
    }

    public void setBtnVariance(Hyperlink h) {
        this.btnVariance = h;
    }
    private Hyperlink btnUnit = new Hyperlink();

    public Hyperlink getBtnUnit() {
        return btnUnit;
    }

    public void setBtnUnit(Hyperlink h) {
        this.btnUnit = h;
    }
    private Hyperlink btnSupplier = new Hyperlink();

    public Hyperlink getBtnSupplier() {
        return btnSupplier;
    }

    public void setBtnSupplier(Hyperlink h) {
        this.btnSupplier = h;
    }
    private Hyperlink btnMaintenance = new Hyperlink();

    public Hyperlink getBtnMaintenance() {
        return btnMaintenance;
    }

    public void setBtnMaintenance(Hyperlink h) {
        this.btnMaintenance = h;
    }
    private Hyperlink btnType = new Hyperlink();

    public Hyperlink getBtnType() {
        return btnType;
    }

    public void setBtnType(Hyperlink h) {
        this.btnType = h;
    }
    private Hyperlink btnBrand = new Hyperlink();

    public Hyperlink getBtnBrand() {
        return btnBrand;
    }

    public void setBtnBrand(Hyperlink h) {
        this.btnBrand = h;
    }
    private Hyperlink btnProduct = new Hyperlink();

    public Hyperlink getBtnProduct() {
        return btnProduct;
    }

    public void setBtnProduct(Hyperlink h) {
        this.btnProduct = h;
    }
    private Hyperlink btnPackage = new Hyperlink();

    public Hyperlink getBtnPackage() {
        return btnPackage;
    }

    public void setBtnPackage(Hyperlink h) {
        this.btnPackage = h;
    }
    private Hyperlink btnPromo = new Hyperlink();

    public Hyperlink getBtnPromo() {
        return btnPromo;
    }

    public void setBtnPromo(Hyperlink h) {
        this.btnPromo = h;
    }
    private Hyperlink btnDiscount = new Hyperlink();

    public Hyperlink getBtnDiscount() {
        return btnDiscount;
    }

    public void setBtnDiscount(Hyperlink h) {
        this.btnDiscount = h;
    }
    private Hyperlink btnSales = new Hyperlink();

    public Hyperlink getBtnSales() {
        return btnSales;
    }

    public void setBtnSales(Hyperlink h) {
        this.btnSales = h;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Menu() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
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
            log("Menu Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    public String btnMaintenance_action() {
        if(btnSupplier.isVisible())
        {
            btnSupplier.setVisible(false);
        }
        else
        {
            btnSupplier.setVisible(true);
        }

        if(btnType.isVisible())
        {
            btnType.setVisible(false);
        }
        else
        {
            btnType.setVisible(true);
        }

        if(btnUnit.isVisible())
        {
            btnUnit.setVisible(false);
        }
        else
        {
            btnUnit.setVisible(true);
        }

        if(btnVariance.isVisible())
        {
            btnVariance.setVisible(false);
        }
        else
        {
            btnVariance.setVisible(true);
        }

         if(btnBrand.isVisible())
        {
            btnBrand.setVisible(false);
        }
        else
        {
            btnBrand.setVisible(true);
        }
        return null;
    }

    public String btnTransaction_action() {
       if(btnPurchase.isVisible())
        {
            btnPurchase.setVisible(false);
        }
        else
        {
            btnPurchase.setVisible(true);
        }
       
       if(btnReceive.isVisible())
        {
            btnReceive.setVisible(false);
        }
        else
        {
            btnReceive.setVisible(true);
        }

        return null;
    }

    public String btnSupplier_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case6";
    }

    public String btnUnit_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case8";
    }

    public String btnVariance_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case7";
    }

    public String btnPurchase_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case9";
    }

    public String btnReceive_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case10";
    }

    public String btnType_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case13";
    }

    public String btnBrand_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case12";
    }

    public String btnProduct_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case14";
    }

    public String btnPackage_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case15";
    }

    public String btnPromo_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case16";
    }

    public String btnDiscount_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case17";
    }

    public String btnSales_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case18";
    }
    
}

