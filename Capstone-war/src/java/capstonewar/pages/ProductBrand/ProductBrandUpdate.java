/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package capstonewar.pages.ProductBrand;

import admin.entity.ProductBrand;
import admin.entity.ProductType;
import admin.session.ProductBrandFacadeLocal;
import admin.session.ProductTypeFacadeLocal;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.MessageGroup;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.ejb.EJB;
import javax.faces.FacesException;
import capstonewar.ApplicationBean1;
import capstonewar.RequestBean1;
import capstonewar.SessionBean1;
import com.sun.webui.jsf.model.Option;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version ProductBrandUpdate.java
 * @version Created on Oct 5, 2017, 3:16:35 PM
 * @author Jefferson Van
 */

public class ProductBrandUpdate extends AbstractPageBean {
    @EJB
    private ProductTypeFacadeLocal productTypeFacade;
    @EJB
    private ProductBrandFacadeLocal productBrandFacade;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private MessageGroup messageGroup1 = new MessageGroup();

    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }

    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    private TextField txtName = new TextField();

    public TextField getTxtName() {
        return txtName;
    }

    public void setTxtName(TextField tf) {
        this.txtName = tf;
    }
    private Button btnBack = new Button();

    public Button getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(Button b) {
        this.btnBack = b;
    }
    private Button btnSave = new Button();

    public Button getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(Button b) {
        this.btnSave = b;
    }
    private Hyperlink btnMenu = new Hyperlink();

    public Hyperlink getBtnMenu() {
        return btnMenu;
    }

    public void setBtnMenu(Hyperlink h) {
        this.btnMenu = h;
    }
    private SingleSelectOptionsList ptypeDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getPtypeDefaultOptions() {
        return ptypeDefaultOptions;
    }

    public void setPtypeDefaultOptions(SingleSelectOptionsList ssol) {
        this.ptypeDefaultOptions = ssol;
    }
    private DropDown ptype = new DropDown();

    public DropDown getPtype() {
        return ptype;
    }

    public void setPtype(DropDown dd) {
        this.ptype = dd;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public ProductBrandUpdate() {
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
            log("ProductBrandUpdate Initialization Failure", e);
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
        List<Option> brandOptions = new ArrayList<Option>();
        List<ProductType>typeList = this.productTypeFacade.findAll();
        for(ProductType type : typeList){
        Option opt = new Option();
        opt.setLabel(type.getName());
        opt.setValue(type.getId());
        brandOptions.add(opt);
        }

        Option[] brandOptionArr = brandOptions.toArray(new Option[0]);
        ptypeDefaultOptions.setOptions(brandOptionArr);

        SessionBean1 sb1 = this.getSessionBean1();
        ProductBrand brandEntry = sb1.getProductBrandEdit();
        txtName.setText(brandEntry.getName());
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
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public String btnSave_action() {
         String name;

        SessionBean1 sb1 = this.getSessionBean1();
        try
        {
            name = (String) txtName.getText();

            boolean checkProductBrand = productBrandFacade.checkItemName(name);
            if(checkProductBrand)
            {
            ProductBrand pBrand = sb1.getProductBrandEdit();
            pBrand.setName(name);
            pBrand.setIsActive(true);
            productBrandFacade.edit(pBrand);
            this.info("Successfully updated record!");
            }
            if(checkProductBrand == false)
            {
                this.info("Product Type Already Taken!");
            }

        }
        catch(NullPointerException e)
        {
            this.info("Missing fields!");
        }
        return null;
    }

    public String btnMenu_action() {
        // TODO: Replace with your code
        return "case2";
    }

    public String btnBack_action() {
        // TODO: Replace with your code
        return "case1";
    }
    
}

