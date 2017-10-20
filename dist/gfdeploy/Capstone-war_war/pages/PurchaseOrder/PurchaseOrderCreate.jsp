<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : PurchaseOrderCreate
    Created on : Aug 4, 2017, 9:52:17 PM
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
                            <webuijsf:hyperlink actionExpression="#{pages$PurchaseOrder$PurchaseOrderCreate.menu_action}"
                                binding="#{pages$PurchaseOrder$PurchaseOrderCreate.menu}" id="menu"
                                style="background-color: rgb(34, 45, 50); color: rgb(204, 204, 204); font-size: 24px; font-style: normal; left: 58px; top: 220px; position: absolute" text="Main Menu"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout id="layoutPanel2" panelLayout="flow" style="background-color: #3c8dbc; height: 50px; left: 0px; top: 0px; position: absolute; width: 1363px"/>
                        <webuijsf:label id="label2" style="font-size: 24px; left: 288px; top: 96px; position: absolute" text="Purchase Order"/>
                        <webuijsf:label id="label3" style="left: 312px; top: 144px; position: absolute" text="Purchase Order Details "/>
                        <webuijsf:label id="label4" style="left: 360px; top: 192px; position: absolute" text="Date"/>
                        <webuijsf:label id="label5" style="left: 624px; top: 192px; position: absolute" text="Supplier *"/>
                        <webuijsf:label id="label6" style="left: 864px; top: 192px; position: absolute; width: 94px" text="Product Search"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="height: 221px; left: 312px; top: 264px; position: absolute; width: 672px"
                            title="Table" width="748">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10"
                                sourceData="#{pages$PurchaseOrder$PurchaseOrderCreate.defaultTableDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Quantity" id="tableColumn1" sort="column1" width="89">
                                    <webuijsf:textField id="textField1"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Product" id="tableColumn2" sort="column2" width="161">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['column2']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Vehicle" id="tableColumn3" sort="column3">
                                    <webuijsf:dropDown binding="#{pages$PurchaseOrder$PurchaseOrderCreate.veh}" id="veh"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Unit Price" id="tableColumn4" width="119">
                                    <webuijsf:textField id="textField2" text="0.00"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Total Cost" id="tableColumn5" width="179">
                                    <webuijsf:staticText id="staticText5" text="Static Text"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Actions" id="tableColumn6" width="200">
                                    <webuijsf:button actionExpression="#{pages$PurchaseOrder$PurchaseOrderCreate.button1_action}" id="button1" text="Delete"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:label id="label7" style="left: 312px; top: 504px; position: absolute" text="Remarks"/>
                        <webuijsf:textArea binding="#{pages$PurchaseOrder$PurchaseOrderCreate.textArea1}" columns="120" id="textArea1" rows="7" style="left: 312px; top: 528px; position: absolute"/>
                        <webuijsf:button actionExpression="#{pages$PurchaseOrder$PurchaseOrderCreate.save_action}"
                            binding="#{pages$PurchaseOrder$PurchaseOrderCreate.save}" id="save" style="left: 311px; top: 648px; position: absolute" text="Save"/>
                        <webuijsf:calendar binding="#{pages$PurchaseOrder$PurchaseOrderCreate.purCalendar}" id="purCalendar" required="true" style="left: 312px; top: 216px; position: absolute"/>
                        <webuijsf:dropDown binding="#{pages$PurchaseOrder$PurchaseOrderCreate.supp}" id="supp"
                            items="#{pages$PurchaseOrder$PurchaseOrderCreate.suppDefaultOptions.options}" style="left: 624px; top: 216px; position: absolute"/>
                        <webuijsf:dropDown binding="#{pages$PurchaseOrder$PurchaseOrderCreate.prod}" id="prod"
                            items="#{pages$PurchaseOrder$PurchaseOrderCreate.prodDefaultOptions.options}" style="left: 864px; top: 216px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
