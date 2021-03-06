/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package capstonewar.pages.Package;


import admin.session.PackageFacade;
import admin.session.PackageFacadeLocal;
import capstonewar.SessionBean1;
import com.sun.data.provider.RowKey;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Checkbox;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.TableRowGroup;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.DefaultTableDataProvider;
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
 * @version PackageMaintenance.java
 * @version Created on Oct 8, 2017, 7:55:21 PM
 * @author Jefferson Van
 */

public class PackageMaintenance extends AbstractPageBean {

    @EJB
    private PackageFacadeLocal packageFacade;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private Hyperlink btnMenu = new Hyperlink();

    public Hyperlink getBtnMenu() {
        return btnMenu;
    }

    public void setBtnMenu(Hyperlink h) {
        this.btnMenu = h;
    }
    private Checkbox all = new Checkbox();

    public Checkbox getAll() {
        return all;
    }

    public void setAll(Checkbox c) {
        this.all = c;
    }
    private TextField txtSearch = new TextField();

    public TextField getTxtSearch() {
        return txtSearch;
    }

    public void setTxtSearch(TextField tf) {
        this.txtSearch = tf;
    }
    private Button btnSearch = new Button();

    public Button getBtnSearch() {
        return btnSearch;
    }

    public void setBtnSearch(Button b) {
        this.btnSearch = b;
    }
    private Button btnNew = new Button();

    public Button getBtnNew() {
        return btnNew;
    }

    public void setBtnNew(Button b) {
        this.btnNew = b;
    }
    private TableRowGroup tableRowGroup1 = new TableRowGroup();

    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    private Button btnUpdate = new Button();

    public Button getBtnUpdate() {
        return btnUpdate;
    }

    public void setBtnUpdate(Button b) {
        this.btnUpdate = b;
    }
    private Button btnDelete = new Button();

    public Button getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(Button b) {
        this.btnDelete = b;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public PackageMaintenance() {
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
            log("PackageMaintenance Initialization Failure", e);
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

     protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

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
        admin.entity.Package[] packArray = sb1.getPackData();
        if(packArray==null){
            sb1.setPackData(new admin.entity.Package[0]);
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

    public void all_processValueChange(ValueChangeEvent vce) {
        SessionBean1 sb1 = this.getSessionBean1();

        if(all.isChecked()){
            List<admin.entity.Package> caseList = packageFacade.findAll();
            admin.entity.Package[] packArray = caseList.toArray(new admin.entity.Package[0]);
            sb1.setPackData(packArray);
            }
            else{
                sb1.setPackData(null);
                return;
            }

    }

    public String btnSearch_action() {
         String search = (String) this.txtSearch.getText();
        SessionBean1 sb1 = this.getSessionBean1();

        boolean checkIfExists = packageFacade.findThisRecord(search);
        if(checkIfExists){
        List<admin.entity.Package> listOfPack = packageFacade.findthisRecord(search);
        admin.entity.Package[] arrayOfPack = listOfPack.toArray(new admin.entity.Package[0]);
        sb1.setPackData(arrayOfPack);
        }
        else{
            this.info("Sorry!, no record found.");
            sb1.setPackData(null);
        }
        return null;
    }

    public String hyperlink1_action() {
        // TODO: Replace with your code
        return null;
    }

    public String btnMenu_action() {
        // TODO: Replace with your code
        return "case1";
    }

    public String btnNew_action() {
        // TODO: Replace with your code
        return "case2";
    }

    public String btnUpdate_action() {
        RowKey rowKey = this.tableRowGroup1.getRowKey();
        String rowId = "";
        rowId = rowKey.getRowId();

        SessionBean1 sb1 = this.getSessionBean1();
        admin.entity.Package[] packEntryArray = sb1.getPackData();
        admin.entity.Package listOfEntry = packEntryArray[Integer.parseInt(rowId)];
        sb1.setPackEdit(listOfEntry);

        return "case3";
    }

    public String btnDelete_action() {
        RowKey rowKey = this.tableRowGroup1.getRowKey();

        String rowId = "";

        rowId = rowKey.getRowId();

        SessionBean1 sb1 = this.getSessionBean1();
        admin.entity.Package[] packArray = sb1.getPackData();
        admin.entity.Package packForEdit = packArray[Integer.parseInt(rowId)];
        sb1.setPackEdit(packForEdit);
        admin.entity.Package pack = sb1.getPackEdit();
        packageFacade.remove(pack);
        sb1.setPackEditArray(null);

        this.info("Successfully Removed");
        return null;
    }
    
}

