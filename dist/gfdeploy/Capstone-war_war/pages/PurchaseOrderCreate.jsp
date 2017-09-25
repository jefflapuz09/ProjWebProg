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
                            <webuijsf:hyperlink actionExpression="#{pages$PurchaseOrderCreate.purchaseOrder_action}" id="purchaseOrder"
                                style="color: rgb(255, 255, 255); font-size: 18px; left: 20px; top: 130px; position: absolute" text="Purchase Order"/>
                            <webuijsf:hyperlink actionExpression="#{pages$PurchaseOrderCreate.receiveDelivery_action}" id="receiveDelivery"
                                style="color: rgb(255, 255, 255); font-size: 18px; left: 20px; top: 160px; position: absolute" text="Receive Delivery"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout id="layoutPanel2" panelLayout="flow" style="background-color: #f39c12; height: 50px; left: 0px; top: 0px; position: absolute; width: 1363px"/>
                        <webuijsf:panelLayout id="layoutPanel3" panelLayout="flow" style="background-color: rgb(26, 34, 38); height: 46px; left: 0px; top: 72px; position: absolute; width: 238px">
                            <webuijsf:panelLayout id="layoutPanel4" panelLayout="flow" style="background-color: rgb(255, 255, 255); height: 573px; left: 264px; top: 0px; position: absolute; width: 838px; z-index: -1"/>
                            <webuijsf:label id="label1" style="margin: 40px 10px 10px 40px; color: rgb(255, 255, 255); font-size: 24px; padding-top: 10px" text="Transactions"/>
                        </webuijsf:panelLayout>
                        <webuijsf:label id="label2" style="font-size: 24px; left: 288px; top: 96px; position: absolute" text="Purchase Order"/>
                        <webuijsf:label id="label3" style="left: 312px; top: 144px; position: absolute" text="Purchase Order Details "/>
                        <webuijsf:dropDown id="dropDown1" items="#{pages$PurchaseOrderCreate.dropDown1DefaultOptions.options}" style="left: 360px; top: 240px; position: absolute"/>
                        <webuijsf:dropDown id="dropDown2" items="#{pages$PurchaseOrderCreate.dropDown2DefaultOptions.options}" style="left: 624px; top: 240px; position: absolute"/>
                        <webuijsf:dropDown id="dropDown3" items="#{pages$PurchaseOrderCreate.dropDown3DefaultOptions.options}" style="left: 888px; top: 240px; position: absolute"/>
                        <webuijsf:label id="label4" style="left: 360px; top: 192px; position: absolute" text="Date"/>
                        <webuijsf:label id="label5" style="left: 624px; top: 192px; position: absolute" text="Supplier *"/>
                        <webuijsf:label id="label6" style="left: 864px; top: 192px; position: absolute; width: 94px" text="Product Search"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="height: 221px; left: 312px; top: 264px; position: absolute; width: 672px"
                            title="Table" width="748">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{pages$PurchaseOrderCreate.defaultTableDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Quantity" id="tableColumn1" sort="column1" width="89">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['column1']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Product" id="tableColumn2" sort="column2" width="161">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['column2']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Vehicle" id="tableColumn3" sort="column3">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['column3']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Unit Price" id="tableColumn4" width="119">
                                    <webuijsf:staticText id="staticText4" text="Static Text"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Total Cost" id="tableColumn5" width="179">
                                    <webuijsf:staticText id="staticText5" text="Static Text"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Actions" id="tableColumn6" width="200">
                                    <webuijsf:staticText id="staticText6" text="Static Text"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:label id="label7" style="left: 312px; top: 504px; position: absolute" text="Remarks"/>
                        <webuijsf:textArea columns="120" id="textArea1" rows="7" style="left: 312px; top: 528px; position: absolute"/>
                        <webuijsf:button actionExpression="#{pages$PurchaseOrderCreate.save_action}" id="save"
                            style="left: 311px; top: 624px; position: absolute" text="Save"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
