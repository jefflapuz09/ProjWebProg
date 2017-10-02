/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package capstonewar.pages.ProductVariance;

import admin.entity.ProductType;
import admin.entity.ProductUnit;
import admin.session.ProductTypeFacadeLocal;
import admin.session.ProductUnitFacadeLocal;
import admin.session.ProductVarianceFacadeLocal;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextField;
import javax.ejb.EJB;
import javax.faces.FacesException;
import capstonewar.RequestBean1;
import capstonewar.SessionBean1;
import capstonewar.ApplicationBean1;
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
 * @version ProductVarianceUpdate.java
 * @version Created on Oct 2, 2017, 8:59:39 PM
 * @author Jefferson Van
 */

public class ProductVarianceUpdate extends AbstractPageBean {
    @EJB
    private ProductVarianceFacadeLocal productVarianceFacade;
    @EJB
    private ProductUnitFacadeLocal productUnitFacade;
    @EJB
    private ProductTypeFacadeLocal productTypeFacade;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private DropDown category = new DropDown();

    public DropDown getCategory() {
        return category;
    }

    public void setCategory(DropDown dd) {
        this.category = dd;
    }
    private TextField txtName = new TextField();

    public TextField getTxtName() {
        return txtName;
    }

    public void setTxtName(TextField tf) {
        this.txtName = tf;
    }
    private TextField txtDimension = new TextField();

    public TextField getTxtDimension() {
        return txtDimension;
    }

    public void setTxtDimension(TextField tf) {
        this.txtDimension = tf;
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
    private DropDown dunit = new DropDown();

    public DropDown getDunit() {
        return dunit;
    }

    public void setDunit(DropDown dd) {
        this.dunit = dd;
    }
    private DropDown type = new DropDown();

    public DropDown getType() {
        return type;
    }

    public void setType(DropDown dd) {
        this.type = dd;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public ProductVarianceUpdate() {
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
            log("ProductVarianceUpdate Initialization Failure", e);
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
        for(ProductType brand : typeList){
        Option opt = new Option();
        opt.setLabel(brand.getName());
        opt.setValue(brand.getId());
        brandOptions.add(opt);
        }

        Option[] brandOptionArr = brandOptions.toArray(new Option[0]);
//        typeDefaultOptions.setOptions(brandOptionArr);

        List<Option> unitOptions = new ArrayList<Option>();
        List<ProductUnit>unitList = this.productUnitFacade.findAll();
        for(ProductUnit unit : unitList){
        Option opt = new Option();
        opt.setLabel(unit.getName());
        opt.setValue(unit.getId());
        unitOptions.add(opt);
        }

        Option[] unitOptionArr = unitOptions.toArray(new Option[0]);
//        dUnitDefaultOptions.setOptions(unitOptionArr);
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
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
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
        // TODO: Replace with your code
        return null;
    }
    
}

