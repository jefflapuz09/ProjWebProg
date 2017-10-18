/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package capstonewar.pages.Product;

import admin.entity.Product;
import admin.entity.ProductBrand;
import admin.entity.ProductType;
import admin.entity.ProductVariance;
import admin.session.ProductBrandFacadeLocal;
import admin.session.ProductFacadeLocal;
import admin.session.ProductTypeFacadeLocal;
import admin.session.ProductVarianceFacadeLocal;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.MessageGroup;
import com.sun.webui.jsf.component.RadioButtonGroup;
import com.sun.webui.jsf.component.TextArea;
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
 * @version ProductCreate.java
 * @version Created on Oct 6, 2017, 8:33:02 PM
 * @author Jefferson Van
 */

public class ProductCreate extends AbstractPageBean {
    @EJB
    private ProductFacadeLocal productFacade;
    @EJB
    private ProductBrandFacadeLocal productBrandFacade;

    @EJB
    private ProductVarianceFacadeLocal productVarianceFacade;
    @EJB
    private ProductTypeFacadeLocal productTypeFacade;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        ptypeDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("Parts", "Parts"), new com.sun.webui.jsf.model.Option("Supplies", "Supplies")});
    }
    private SingleSelectOptionsList ptypeDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getPtypeDefaultOptions() {
        return ptypeDefaultOptions;
    }

    public void setPtypeDefaultOptions(SingleSelectOptionsList ssol) {
        this.ptypeDefaultOptions = ssol;
    }
    private SingleSelectOptionsList prodtypeDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getProdtypeDefaultOptions() {
        return prodtypeDefaultOptions;
    }

    public void setProdtypeDefaultOptions(SingleSelectOptionsList ssol) {
        this.prodtypeDefaultOptions = ssol;
    }
    private SingleSelectOptionsList varianceDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getVarianceDefaultOptions() {
        return varianceDefaultOptions;
    }

    public void setVarianceDefaultOptions(SingleSelectOptionsList ssol) {
        this.varianceDefaultOptions = ssol;
    }
    private TextField txtReorder = new TextField();

    public TextField getTxtReorder() {
        return txtReorder;
    }

    public void setTxtReorder(TextField tf) {
        this.txtReorder = tf;
    }
    private TextField txtPrice = new TextField();

    public TextField getTxtPrice() {
        return txtPrice;
    }

    public void setTxtPrice(TextField tf) {
        this.txtPrice = tf;
    }
    private TextArea txtDescription = new TextArea();

    public TextArea getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(TextArea ta) {
        this.txtDescription = ta;
    }
    private TextField txtProduct = new TextField();

    public TextField getTxtProduct() {
        return txtProduct;
    }

    public void setTxtProduct(TextField tf) {
        this.txtProduct = tf;
    }
    private DropDown variance = new DropDown();

    public DropDown getVariance() {
        return variance;
    }

    public void setVariance(DropDown dd) {
        this.variance = dd;
    }
    private DropDown prodtype = new DropDown();

    public DropDown getProdtype() {
        return prodtype;
    }

    public void setProdtype(DropDown dd) {
        this.prodtype = dd;
    }
    private RadioButtonGroup ptype = new RadioButtonGroup();

    public RadioButtonGroup getPtype() {
        return ptype;
    }

    public void setPtype(RadioButtonGroup rbg) {
        this.ptype = rbg;
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
    private Button btnSave = new Button();

    public Button getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(Button b) {
        this.btnSave = b;
    }
    private SingleSelectOptionsList brandDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getBrandDefaultOptions() {
        return brandDefaultOptions;
    }

    public void setBrandDefaultOptions(SingleSelectOptionsList ssol) {
        this.brandDefaultOptions = ssol;
    }
    private DropDown brand = new DropDown();

    public DropDown getBrand() {
        return brand;
    }

    public void setBrand(DropDown dd) {
        this.brand = dd;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public ProductCreate() {
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
            log("ProductCreate Initialization Failure", e);
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
        List<Option> typeOptions = new ArrayList<Option>();
        List<ProductType>typeList = this.productTypeFacade.findAll();
        for(ProductType type : typeList){
        Option opt = new Option();
        opt.setLabel(type.getName());
        opt.setValue(type.getId());
        typeOptions.add(opt);
        }

        Option[] typeOptionArr = typeOptions.toArray(new Option[0]);
        prodtypeDefaultOptions.setOptions(typeOptionArr);

        List<Option> varOptions = new ArrayList<Option>();
        List<ProductVariance>varList = this.productVarianceFacade.findAll();
        for(ProductVariance variance : varList){
        Option opt = new Option();
        opt.setLabel(variance.getName());
        opt.setValue(variance.getId());
        varOptions.add(opt);
        }

        Option[] varOptionArr = varOptions.toArray(new Option[0]);
        varianceDefaultOptions.setOptions(varOptionArr);

        List<Option> brandOptions = new ArrayList<Option>();
        List<ProductBrand>brandList = this.productBrandFacade.findAll();
        for(ProductBrand brand : brandList){
        Option opt = new Option();
        opt.setLabel(brand.getName());
        opt.setValue(brand.getId());
        brandOptions.add(opt);
        }

        Option[] brandOptionArr = brandOptions.toArray(new Option[0]);
        brandDefaultOptions.setOptions(brandOptionArr);
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
        String type, var, prod, desc ;
        int reorder, prodbrand;
        double price;

        SessionBean1 sb1 = this.getSessionBean1();
        try
        {
            type = (String) prodtype.getValue();
            var = (String) variance.getValue();
            prod = (String) txtProduct.getText();
            desc = (String) txtDescription.getText();
            reorder = Integer.parseInt(txtReorder.getText().toString());
            price = Double.parseDouble(txtPrice.getText().toString());
            prodbrand =  Integer.parseInt(brand.getValue().toString());

            

            Product product = new Product();
            product.setIsActive(true);
            product.setName(prod);
            product.setDescription(desc);
            product.setPrice(price);
            product.setReorder(reorder);

           // product.setBrandId(brandId)
//            product.setTypeId(1);
//            product.setVarianceId(1);
//            product.setVarianceId(0);
            product.setIsActive(true);
            productFacade.create(product);
            this.info("Successfully Saved Record!");
            
           
    
            
           
        }
        catch(NullPointerException e)
        {
            this.info("Missing required fields");
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

