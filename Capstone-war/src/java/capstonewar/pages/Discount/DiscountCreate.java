/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package capstonewar.pages.Discount;

import admin.entity.Discount;
import admin.entity.Product;
import admin.session.DiscountFacadeLocal;
import admin.session.ProductFacadeLocal;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Checkbox;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.MessageGroup;
import com.sun.webui.jsf.component.RadioButtonGroup;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.ejb.EJB;
import javax.faces.FacesException;
import capstonewar.SessionBean1;
import capstonewar.RequestBean1;
import capstonewar.ApplicationBean1;
import com.sun.webui.jsf.model.Option;
import java.util.ArrayList;
import java.util.List;
import javax.faces.event.ValueChangeEvent;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version DiscountCreate.java
 * @version Created on Oct 8, 2017, 11:16:45 PM
 * @author Jefferson Van
 */

public class DiscountCreate extends AbstractPageBean {
    @EJB
    private DiscountFacadeLocal discountFacade;
    @EJB
    private ProductFacadeLocal productFacade;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        rbTypeDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("0", "Whole"), new com.sun.webui.jsf.model.Option("1", "Individual")});
    }
    private Hyperlink btnMenu = new Hyperlink();

    public Hyperlink getBtnMenu() {
        return btnMenu;
    }

    public void setBtnMenu(Hyperlink h) {
        this.btnMenu = h;
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
    private TextField txtDiscount = new TextField();

    public TextField getTxtDiscount() {
        return txtDiscount;
    }

    public void setTxtDiscount(TextField tf) {
        this.txtDiscount = tf;
    }
    private MessageGroup messageGroup1 = new MessageGroup();

    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }

    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    private SingleSelectOptionsList rbTypeDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getRbTypeDefaultOptions() {
        return rbTypeDefaultOptions;
    }

    public void setRbTypeDefaultOptions(SingleSelectOptionsList ssol) {
        this.rbTypeDefaultOptions = ssol;
    }
    private RadioButtonGroup rbType = new RadioButtonGroup();

    public RadioButtonGroup getRbType() {
        return rbType;
    }

    public void setRbType(RadioButtonGroup rbg) {
        this.rbType = rbg;
    }
    private TextField txtRate = new TextField();

    public TextField getTxtRate() {
        return txtRate;
    }

    public void setTxtRate(TextField tf) {
        this.txtRate = tf;
    }
    private Checkbox cbVatExempt = new Checkbox();

    public Checkbox getCbVatExempt() {
        return cbVatExempt;
    }

    public void setCbVatExempt(Checkbox c) {
        this.cbVatExempt = c;
    }
    private SingleSelectOptionsList prodDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getProdDefaultOptions() {
        return prodDefaultOptions;
    }

    public void setProdDefaultOptions(SingleSelectOptionsList ssol) {
        this.prodDefaultOptions = ssol;
    }
    private DropDown prod = new DropDown();

    public DropDown getProd() {
        return prod;
    }

    public void setProd(DropDown dd) {
        this.prod = dd;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public DiscountCreate() {
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
            log("DiscountCreate Initialization Failure", e);
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
        Discount disc = sb1.getDiscount();
        if(disc == null){
               sb1.setDiscount(new Discount());
        }

        List<Option> prodOptions = new ArrayList<Option>();
        List<Product>prodList = this.productFacade.findAll();
        for(Product type : prodList){
        Option opt = new Option();
        opt.setLabel(type.getName());
        opt.setValue(type.getId());
        prodOptions.add(opt);
        }

        Option[] prodOptionArr = prodOptions.toArray(new Option[0]);
        prodDefaultOptions.setOptions(prodOptionArr);
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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    public String btnSave_action() {
        String discount = "";
        Double rate;
        String type = "";

        SessionBean1 sb1 = this.getSessionBean1();

        try{
            discount = (String) this.txtDiscount.getText();
            rate =  Double.parseDouble(txtRate.getText().toString());


            if(rbType.getValue().equals("1"))
            {
                Discount disc = new Discount();
                disc.setName(discount);
                disc.setRate(rate);
                disc.setIsWhole(false);
                disc.setIsVatExempt(false);
                disc.setIsActive(true);
                discountFacade.create(disc);
                this.info("SAVED!");
            }
            if(rbType.getValue().equals("0"))
            {
                Discount disc = new Discount();
                disc.setName(discount);
                disc.setRate(rate);
                disc.setIsWhole(true);
                disc.setIsVatExempt(true);
                disc.setIsActive(true);
                discountFacade.create(disc);
                this.info("SAVED!");
            }
            




        }catch(NullPointerException ex)
        {

        }
        return null;
    }

    public void rbType_processValueChange(ValueChangeEvent vce) {
       if(rbType.getValue().equals("0"))
        {
           System.out.println("123");

            cbVatExempt.setVisible(true);

        }
       else
       {
            cbVatExempt.setSelected(false);
            cbVatExempt.setVisible(false);
       }
       
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

