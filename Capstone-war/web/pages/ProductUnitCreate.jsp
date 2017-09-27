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
                            <webuijsf:hyperlink actionExpression="#{pages$ProductUnitCreate.purchaseOrder_action}" id="purchaseOrder"
                                style="color: rgb(255, 255, 255); font-size: 18px; left: 20px; top: 130px; position: absolute" text="Purchase Order"/>
                            <webuijsf:hyperlink actionExpression="#{pages$ProductUnitCreate.receiveDelivery_action}" id="receiveDelivery"
                                style="color: rgb(255, 255, 255); font-size: 18px; left: 20px; top: 160px; position: absolute" text="Receive Delivery"/>
                            <webuijsf:hyperlink actionExpression="#{pages$ProductUnitCreate.hyperlink1_action}" id="hyperlink1"
                                style="color: rgb(255, 255, 255); font-size: 18px; left: 20px; top: 190px; position: absolute" text="Supplier Maintenance"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout id="layoutPanel2" panelLayout="flow" style="background-color: #f39c12; height: 50px; left: 0px; top: 0px; position: absolute; width: 1363px"/>
                        <webuijsf:button actionExpression="#{pages$ProductUnitCreate.btnSave_action}" binding="#{pages$SupplierMaintenanceCreate.btnSave}"
                            id="btnSave" style="left: 287px; top: 480px; position: absolute" text="Save"/>
                        <webuijsf:label id="label1" style="font-size: 36px; left: 288px; top: 120px; position: absolute; width: 480px" text="Product Unit Information"/>
                        <webuijsf:label id="label2" style="left: 288px; top: 192px; position: absolute" text="Unit of Measurement *"/>
                        <webuijsf:textField binding="#{pages$ProductUnitCreate.txtName}" columns="40" id="txtName" style="font-size: 18px; left: 288px; top: 216px; position: absolute"/>
                        <webuijsf:messageGroup binding="#{pages$SupplierMaintenanceCreate.messageGroup1}" id="messageGroup1" style="left: 1032px; top: 96px; position: absolute; width: 310px"/>
                        <webuijsf:button actionExpression="#{pages$ProductUnitCreate.btnBack_action}" binding="#{pages$SupplierMaintenanceCreate.btnBack}"
                            id="btnBack" style="left: 287px; top: 456px; position: absolute" text="Back"/>
                        <webuijsf:label id="label3" style="left: 816px; top: 192px; position: absolute; width: 120px" text="Unit of Category*"/>
                        <webuijsf:dropDown binding="#{pages$ProductUnitCreate.category}" id="category"
                            items="#{pages$ReceiveDeliveryCreate.categoryDefaultOptions.options}"
                            style="left: 816px; top: 216px; position: absolute; width: 30px" width="200"/>
                        <webuijsf:label for="txtDesc" id="label4" style="position: absolute; left: 288px; top: 264px" text="Description*"/>
                        <webuijsf:textArea binding="#{pages$ProductUnitCreate.txtDesc}" columns="118" id="txtDesc" rows="5" style="left: 288px; top: 288px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
