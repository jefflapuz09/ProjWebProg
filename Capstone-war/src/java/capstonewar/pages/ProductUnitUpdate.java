/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package capstonewar.pages;

import admin.entity.ProductUnit;
import admin.session.ProductUnitFacadeLocal;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import javax.ejb.EJB;
import javax.faces.FacesException;
import capstonewar.RequestBean1;
import capstonewar.ApplicationBean1;
import capstonewar.SessionBean1;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version ProductUnitUpdate.java
 * @version Created on Sep 27, 2017, 12:36:01 PM
 * @author Jefferson Van
 */

public class ProductUnitUpdate extends AbstractPageBean {
    @EJB
    private ProductUnitFacadeLocal productUnitFacade;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private TextField txtName = new TextField();

    public TextField getTxtName() {
        return txtName;
    }

    public void setTxtName(TextField tf) {
        this.txtName = tf;
    }
    private TextArea txtDesc = new TextArea();

    public TextArea getTxtDesc() {
        return txtDesc;
    }

    public void setTxtDesc(TextArea ta) {
        this.txtDesc = ta;
    }
    private DropDown category = new DropDown();

    public DropDown getCategory() {
        return category;
    }

    public void setCategory(DropDown dd) {
        this.category = dd;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public ProductUnitUpdate() {
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
            log("ProductUnitUpdate Initialization Failure", e);
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
        SessionBean1 sb1 = this.getSessionBean1();
        ProductUnit caseEntry = sb1.getProductUnitEdit();
        txtName.setText(caseEntry.getName());
        txtDesc.setText(caseEntry.getDescription());
        category.setValue(caseEntry.getCategory());

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
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
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

    public String purchaseOrder_action() {
        // TODO: Replace with your code
        return null;
    }

    public String receiveDelivery_action() {
        // TODO: Replace with your code
        return null;
    }

    public String hyperlink1_action() {
        // TODO: Replace with your code
        return null;
    }

    public String btnSave_action() {
        String unitName,unitDesc;
        short unitCategory;

        SessionBean1 sb1 = this.getSessionBean1();
        try
        {
            unitName = (String) txtName.getText();
            unitDesc = (String) txtDesc.getText();
//            unitCategory =  Short.parseInt(category.getValue().toString());
            unitCategory = Short.parseShort(category.getValue().toString());
            ProductUnit pUnit = sb1.getProductUnit();
            pUnit.setName(unitName);
            pUnit.setDescription(unitDesc);
            pUnit.setCategory(unitCategory);
            pUnit.setIsActive(true);
            productUnitFacade.edit(pUnit);
            this.info("Data updated!");


        }
        catch(NullPointerException e)
        {

            this.info("Missing Fields!");
        }
        return null;
    }

    public String btnBack_action() {
        // TODO: Replace with your code
        return "case1";
    }
    
}

