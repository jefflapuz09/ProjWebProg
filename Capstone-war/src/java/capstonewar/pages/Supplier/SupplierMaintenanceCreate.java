/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package capstonewar.pages.Supplier;

import admin.entity.Supplier;

import admin.entity.SupplierContact;
import admin.entity.SupplierPerson;
import admin.session.SupplierContactFacadeLocal;
import admin.session.SupplierFacadeLocal;

import admin.session.SupplierPersonFacadeLocal;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.MessageGroup;
import com.sun.webui.jsf.component.TextField;
import javax.ejb.EJB;
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
 * @version SupplierMaintenanceCreate.java
 * @version Created on Sep 23, 2017, 8:20:45 AM
 * @author Jefferson Van
 */

public class SupplierMaintenanceCreate extends AbstractPageBean {
    @EJB
    private SupplierPersonFacadeLocal supplierPersonFacade;
    @EJB
    private SupplierContactFacadeLocal supplierContactFacade;
  

    @EJB
    private SupplierFacadeLocal supplierFacade;
    

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private TextField txtPContactNum = new TextField();

    public TextField getTxtPContactNum() {
        return txtPContactNum;
    }

    public void setTxtPContactNum(TextField tf) {
        this.txtPContactNum = tf;
    }
    private TextField txtContactP = new TextField();

    public TextField getTxtContactP() {
        return txtContactP;
    }

    public void setTxtContactP(TextField tf) {
        this.txtContactP = tf;
    }
    private TextField txtSupplier = new TextField();

    public TextField getTxtSupplier() {
        return txtSupplier;
    }

    public void setTxtSupplier(TextField tf) {
        this.txtSupplier = tf;
    }
    private TextField txtSt = new TextField();

    public TextField getTxtSt() {
        return txtSt;
    }

    public void setTxtSt(TextField tf) {
        this.txtSt = tf;
    }
    private TextField txtBrgy = new TextField();

    public TextField getTxtBrgy() {
        return txtBrgy;
    }

    public void setTxtBrgy(TextField tf) {
        this.txtBrgy = tf;
    }
    private TextField txtCity = new TextField();

    public TextField getTxtCity() {
        return txtCity;
    }

    public void setTxtCity(TextField tf) {
        this.txtCity = tf;
    }
    private Button btnSave = new Button();

    public Button getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(Button b) {
        this.btnSave = b;
    }
    private MessageGroup messageGroup1 = new MessageGroup();

    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }

    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    private Button btnBack = new Button();

    public Button getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(Button b) {
        this.btnBack = b;
    }
    private TextField txtContact = new TextField();

    public TextField getTxtContact() {
        return txtContact;
    }

    public void setTxtContact(TextField tf) {
        this.txtContact = tf;
    }
    private Hyperlink btnMenu = new Hyperlink();

    public Hyperlink getBtnMenu() {
        return btnMenu;
    }

    public void setBtnMenu(Hyperlink h) {
        this.btnMenu = h;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public SupplierMaintenanceCreate() {
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
            log("SupplierMaintenanceCreate Initialization Failure", e);
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
        Supplier supp = sb1.getSupplier();
        if(supp == null){
               sb1.setSupplier(new Supplier());
        }
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

    public String btnSave_action() {
        String supplierName = "";
        String st = "";
        String brgy = "";
        String city = "";
        String suppContact = "";
        String suppPContactName = "";
        String suppPContactNo ;
        int sid,spid;
        String ssup;

        SessionBean1 sb1 = this.getSessionBean1();
       
       try
       {
            

            supplierName = (String) txtSupplier.getText();
            st = (String) txtSt.getText();
            brgy = (String) txtBrgy.getText();
            city = (String) txtCity.getText();

            Supplier supp = sb1.getSupplier();
            supp.setName(supplierName);
            supp.setStreet(st);
            supp.setBrgy(brgy);
            supp.setCity(city);
            supp.setIsActive(true);
            supplierFacade.create(supp);
            
            Supplier suppEntry = sb1.getSupplier();
            sid = (suppEntry.getId());
            suppContact = (String) txtContact.getText();
            SupplierContact supContact = sb1.getSupplierContact();
            supContact.setScId(sid);
            supContact.setScNo(suppContact);
            supplierContactFacade.create(supContact);

            spid = (suppEntry.getId());
            suppPContactName = (String) txtContactP.getText();
            suppPContactNo = (String) txtPContactNum.getText();
            SupplierPerson supPerson = sb1.getSupplierPerson();
            supPerson.setSpId(spid);
            supPerson.setSpName(suppPContactName);
            supPerson.setSpContact(suppPContactNo);
            supPerson.setIsMain(true);
            supplierPersonFacade.create(supPerson);
//            supp.setContactNo(suppContactNo);
//            supp.setContactPerson(suppContactName);

            

            this.info("Successfully Saved!");
            
            
       }
       catch(NullPointerException e)
       {
           this.info("Missing required fields!");
       }
        return null;
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
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case2";
    }

    public String btnBack_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case1";
    }

    public String btnMenu_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case2";
    }
    
}

