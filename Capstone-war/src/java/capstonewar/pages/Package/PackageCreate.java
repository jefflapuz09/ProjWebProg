/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package capstonewar.pages.Package;

import admin.entity.PackageProduct;
import admin.entity.Product;
import admin.session.PackageFacadeLocal;
import admin.session.PackageProductFacadeLocal;
import admin.session.ProductFacadeLocal;
import capstonewar.SessionBean1;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.MessageGroup;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.Option;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version PackageCreate.java
 * @version Created on Oct 18, 2017, 9:07:15 AM
 * @author Jefferson Van
 */

public class PackageCreate extends AbstractPageBean {
    @EJB
    private PackageProductFacadeLocal packageProductFacade;
    @EJB
    private PackageFacadeLocal packageFacade;
    @EJB
    private ProductFacadeLocal productFacade;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private TextField txtQuantity = new TextField();

    public TextField getTxtQuantity() {
        return txtQuantity;
    }

    public void setTxtQuantity(TextField tf) {
        this.txtQuantity = tf;
    }
    private TextField txtName = new TextField();

    public TextField getTxtName() {
        return txtName;
    }

    public void setTxtName(TextField tf) {
        this.txtName = tf;
    }
    private TextField txtPrice = new TextField();

    public TextField getTxtPrice() {
        return txtPrice;
    }

    public void setTxtPrice(TextField tf) {
        this.txtPrice = tf;
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
    private MessageGroup messageGroup1 = new MessageGroup();

    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }

    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    private SingleSelectOptionsList productDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getProductDefaultOptions() {
        return productDefaultOptions;
    }

    public void setProductDefaultOptions(SingleSelectOptionsList ssol) {
        this.productDefaultOptions = ssol;
    }
    private DropDown product = new DropDown();

    public DropDown getProduct() {
        return product;
    }

    public void setProduct(DropDown dd) {
        this.product = dd;
    }
    private Label lblQuantity = new Label();

    public Label getLblQuantity() {
        return lblQuantity;
    }

    public void setLblQuantity(Label l) {
        this.lblQuantity = l;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public PackageCreate() {
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
            log("PackageCreate Initialization Failure", e);
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
//        txtQuantity.setVisible(false);
//        lblQuantity.setVisible(false);

        List<Option> brandOptions = new ArrayList<Option>();
        List<Product>prodList = this.productFacade.findAll();
        for(Product prod : prodList){
        Option opt = new Option();
        opt.setLabel(prod.getName());
        opt.setValue(prod.getId());
        brandOptions.add(opt);
        }

        Option[] prodOptionArr = brandOptions.toArray(new Option[0]);
        productDefaultOptions.setOptions(prodOptionArr);
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

    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public void product_processValueChange(ValueChangeEvent event) {
        txtQuantity.setVisible(true);
        lblQuantity.setVisible(true);
    }

    public String btnSave_action() {

        String pack;
        Double price;
        int quantity, prod, pid;

        SessionBean1 sb1 = this.getSessionBean1();
        try
        {
            pack = txtName.getText().toString();
            price = Double.parseDouble(txtPrice.getText().toString());
            quantity = Integer.parseInt(txtQuantity.getText().toString());
            prod = Integer.parseInt(product.getValue().toString());

            admin.entity.Package packNew = new admin.entity.Package();
            packNew.setIsActive(true);
            packNew.setName(pack);
            packNew.setPrice(price);
            packageFacade.create(packNew);
            sb1.setPack(packNew);

            admin.entity.Package packEntry = sb1.getPack();
            pid = Integer.parseInt(packEntry.getId().toString());

            PackageProduct prodPack = new PackageProduct();
            prodPack.setPackageId(pid);
            prodPack.setIsActive(true);
            prodPack.setProductId(prod);
            prodPack.setQuantity(quantity);
            packageProductFacade.create(prodPack);
            this.info("Saved");
            

        }
        catch(NullPointerException e)
        {
            this.info(e.getMessage());
        }
        return null;
    }

    public String btnMenu_action() {
        // TODO: Replace with your code
        return "case1";
    }

    public String btnBack_action() {
        // TODO: Replace with your code
        return "case2";
    }
    
}

