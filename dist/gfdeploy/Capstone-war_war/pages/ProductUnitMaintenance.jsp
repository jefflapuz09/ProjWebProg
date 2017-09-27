<?xml version="1.0" encoding="UTF-8"?>
<!--
    Document   : ReceiveDeliveryCreate
    Created on : Aug 4, 2017, 10:37:53 PM
    Author     : Jefferson Van
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid; background-color: #e6ebf2">
                    <webuijsf:form id="form1">
                        <webuijsf:panelLayout id="layoutPanel1" panelLayout="flow" style="background-color: rgb(34, 45, 50); height: 662px; left: 0px; top: 0px; position: absolute; width: 238px">
                            <webuijsf:hyperlink actionExpression="#{pages$ProductUnitMaintenance.purchaseOrder_action}" id="purchaseOrder"
                                style="color: rgb(255, 255, 255); font-size: 18px; left: 20px; top: 130px; position: absolute" text="Purchase Order"/>
                            <webuijsf:hyperlink actionExpression="#{pages$ProductUnitMaintenance.receiveDelivery_action}" id="receiveDelivery"
                                style="color: rgb(255, 255, 255); font-size: 18px; left: 20px; top: 160px; position: absolute" text="Receive Delivery"/>
                            <webuijsf:hyperlink actionExpression="#{pages$ProductUnitMaintenance.hyperlink1_action}" id="hyperlink1"
                                style="color: rgb(255, 255, 255); font-size: 18px; left: 24px; top: 192px; position: absolute" text="Supplier Maintenance"/>
                            <webuijsf:hyperlink actionExpression="#{pages$ProductUnitMaintenance.hyperlink2_action}" id="hyperlink2"
                                style="color: rgb(255, 255, 255); font-size: 18px; left: 24px; top: 220px; position: absolute" text="Product Unit Maintenance"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout id="layoutPanel2" panelLayout="flow" style="background-color: #f39c12; height: 50px; left: 0px; top: 0px; position: absolute; width: 1363px"/>
                        <webuijsf:button actionExpression="#{pages$ProductUnitMaintenance.btnNew_action}" binding="#{pages$ProductUnitMaintenance.btnNew}"
                            id="btnNew" style="font-size: 18px; left: 1031px; top: 192px; position: absolute" text="New Record"/>
                        <webuijsf:label id="label1" style="font-size: 36px; left: 336px; top: 120px; position: absolute; width: 502px" text="Product Unit Maintenance"/>
                        <webuijsf:table augmentTitle="false" binding="#{pages$SupplierMaintenance.table1}" id="table1"
                            style="height: 197px; left: 312px; top: 240px; position: absolute" title="Table" width="888">
                            <webuijsf:tableRowGroup binding="#{pages$ProductUnitMaintenance.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{SessionBean1.productUnitData}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Unit" id="tableColumn1" sort="name">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['name']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Description" id="tableColumn2" sort="description">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['description']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Actions" id="tableColumn3" width="353">
                                    <webuijsf:button actionExpression="#{pages$ProductUnitMaintenance.button1_action}" id="button1" style="font-size: 18px" text="Update"/>
                                    <webuijsf:button actionExpression="#{pages$ProductUnitMaintenance.btnDelete_action}" id="btnDelete" style="font-size: 18px" text="Deactivate"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:label id="label2" style="font-size: 18px; left: 456px; top: 192px; position: absolute" text="Search"/>
                        <webuijsf:textField binding="#{pages$ProductUnitMaintenance.txtSearch}" columns="40" id="txtSearch" style="font-size: 18px; left: 528px; top: 192px; position: absolute"/>
                        <webuijsf:button actionExpression="#{pages$ProductUnitMaintenance.btnSearch_action}" binding="#{pages$ProductUnitMaintenance.btnSearch}"
                            id="btnSearch" style="font-size: 18px; left: 935px; top: 192px; position: absolute" text="Submit"/>
                        <webuijsf:checkbox binding="#{pages$ProductUnitMaintenance.all}" id="all" label="View all"
                            onClick="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'all');"
                            style="font-size: 18px; left: 336px; top: 192px; position: absolute" valueChangeListenerExpression="#{pages$ProductUnitMaintenance.all_processValueChange}"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
