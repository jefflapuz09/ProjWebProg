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
import capstonewar.RequestBean1;
import capstonewar.SessionBean1;
import com.sun.data.provider.RowKey;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Checkbox;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.Table;
import com.sun.webui.jsf.component.TableColumn;
import com.sun.webui.jsf.component.TableRowGroup;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.DefaultTableDataProvider;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.SessionBean;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;
import capstonewar.ApplicationBean1;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version SupplierMaintenance.java
 * @version Created on Sep 23, 2017, 7:44:37 AM
 * @author Jefferson Van
 */
public class SupplierMaintenance extends AbstractPageBean {
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
    private Button btnSearch = new Button();

    public Button getBtnSearch() {
        return btnSearch;
    }

    public void setBtnSearch(Button b) {
        this.btnSearch = b;
    }
    private TextField txtSearch = new TextField();

    public TextField getTxtSearch() {
        return txtSearch;
    }

    public void setTxtSearch(TextField tf) {
        this.txtSearch = tf;
    }
    private Checkbox all = new Checkbox();

    public Checkbox getAll() {
        return all;
    }

    public void setAll(Checkbox c) {
        this.all = c;
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
    private Table table1 = new Table();

    public Table getTable1() {
        return table1;
    }

    public void setTable1(Table t) {
        this.table1 = t;
    }
    private TableColumn tableColumn6 = new TableColumn();

    public TableColumn getTableColumn6() {
        return tableColumn6;
    }

    public void setTableColumn6(TableColumn tc) {
        this.tableColumn6 = tc;
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
    public SupplierMaintenance() {
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
            log("SupplierMaintenance Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
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
      

        List<SupplierPerson> listOfSupplierPerson = this.supplierPersonFacade.findAll();
        List<SupplierContact> listOfSupplierContact = this.supplierContactFacade.findAll();
        List<Supplier> listofSupplier = supplierFacade.findAll();
        Supplier[] arrayOfSupplier = listofSupplier.toArray(new Supplier[0]);
        SupplierPerson[] arrayOfSupplierPerson = listOfSupplierPerson.toArray(new SupplierPerson[0]);
        SupplierContact[] arrayOfSupplierContact = listOfSupplierContact.toArray(new SupplierContact[0]);
        sb1.setSupplierData(arrayOfSupplier);
        sb1.setSupplierPersonData(arrayOfSupplierPerson);
        sb1.setSupplierContactData(arrayOfSupplierContact);

        for(int i = 0; i < arrayOfSupplier.length; i++)
        {
            for(SupplierContact supplierContact : listOfSupplierContact)
            {
                System.out.println(arrayOfSupplier[i].getId().equals(supplierContact.getScId()));
                
                if(arrayOfSupplier[i].getId().equals(supplierContact.getScId()))
                {
                    arrayOfSupplier[i].setSuppContact(supplierContact.getScNo());
                }
            }
        }
        
         for(int i = 0; i < arrayOfSupplier.length; i++)
        {
            for(SupplierPerson supplierPerson : listOfSupplierPerson)
            {
                if(arrayOfSupplier[i].getId().equals(supplierPerson.getSpId()))
                {
                    arrayOfSupplier[i].setSuppPerson(supplierPerson.getSpName());
                }
            }
        }

        if(arrayOfSupplier==null){
            sb1.setSupplierData(new Supplier[0]);
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

    public String purchaseOrder_action() {
        // TODO: Replace with your code
        return "case3";
    }

    public String receiveDelivery_action() {
        // TODO: Replace with your code
        return "case2";
    }

    public String hyperlink1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case5";
    }

    public String save_action() {
        // TODO: Replace with your code
        return null;
    }

    public String btnNew_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case1";
    }

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

    public void all_processValueChange(ValueChangeEvent event) {
        SessionBean1 sb1 = this.getSessionBean1();

        if(all.isChecked()){
            List<Supplier> caseList = supplierFacade.findAll();
            Supplier[] arrayOfSupplier = caseList.toArray(new Supplier[0]);
            sb1.setSupplierData(arrayOfSupplier);
            }
            else{
                sb1.setSupplierData(null);
                return;
            }
    }

    public String btnSearch_action() {
        String search = (String) this.txtSearch.getText();
        SessionBean1 sb1 = this.getSessionBean1();

        boolean checkIfExists = supplierFacade.findThisRecord(search);
        if(checkIfExists){
        List<Supplier> listOfUsers = supplierFacade.findthisRecord(search);
        Supplier[] arrayOfUsers = listOfUsers.toArray(new Supplier[0]);
        sb1.setSupplierData(arrayOfUsers);
        }
        else{
            this.info("Sorry!, no record found.");
            sb1.setSupplierData(null);
        }
        return null;
    }

    public String btnUpdate_action() {
//        RowKey rowKey = this.tableRowGroup1.getRowKey();
//        String rowId = "";
//        rowId = rowKey.getRowId();
//
//        SessionBean1 sb1 = this.getSessionBean1();
//        Supplier[] suppEntryArray = sb1.getSupplierData();
//        Supplier listOfEntry = suppEntryArray[Integer.parseInt(rowId)];
//        sb1.setSuppEntryforEdit(listOfEntry);

        RowKey rowKey = this.tableRowGroup1.getRowKey();
        String rowId = "";
        rowId = rowKey.getRowId();

        SessionBean1 sb1 = this.getSessionBean1();
        Supplier[] suppEntryArray = sb1.getSupplierData();
        Supplier listOfEntry = suppEntryArray[Integer.parseInt(rowId)];
        SupplierContact[] suppCEntryArray = sb1.getSupplierContactData();
        SupplierContact upOfEntry = suppCEntryArray[Integer.parseInt(rowId)];
        SupplierPerson[] suppCPntryArray = sb1.getSupplierPersonData();
        SupplierPerson up2OfEntry = suppCPntryArray[Integer.parseInt(rowId)];
        sb1.setSuppEntryforEdit(listOfEntry);
        sb1.setSuppContactEntryforEdit(upOfEntry);
        sb1.setSuppPersonEntryforEdit(up2OfEntry);

        return "case2";
    }

    public String btnDelete_action() {
        RowKey rowKey = this.tableRowGroup1.getRowKey();

        String rowId = "";

        rowId = rowKey.getRowId();

        SessionBean1 sb1 = this.getSessionBean1();
        Supplier[] suppArray = sb1.getSupplierData();
        Supplier suppForEdit = suppArray[Integer.parseInt(rowId)];
        SupplierContact[] suppCEntryArray = sb1.getSupplierContactData();
        SupplierContact upOfEntry = suppCEntryArray[Integer.parseInt(rowId)];
        SupplierPerson[] suppCPntryArray = sb1.getSupplierPersonData();
        SupplierPerson up2OfEntry = suppCPntryArray[Integer.parseInt(rowId)];
        sb1.setSuppContactEntryforEdit(upOfEntry);
        sb1.setSuppPersonEntryforEdit(up2OfEntry);
        sb1.setSuppEntryforEdit(suppForEdit);
        SupplierContact scon = sb1.getSuppContactEntryforEdit();
        supplierContactFacade.remove(scon);
        SupplierPerson sper = sb1.getSuppPersonEntryforEdit();
        supplierPersonFacade.remove(sper);
        Supplier supp = sb1.getSuppEntryforEdit();
        supplierFacade.remove(supp);
        sb1.setSuppEntryforEditArray(null);

        this.info("Successfully Removed");
        return null;
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    public String btnMenu_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case3";
    }
}

