<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : PurchaseOrder
    Created on : Aug 4, 2017, 9:21:53 PM
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
                            <webuijsf:hyperlink actionExpression="#{pages$PurchaseOrder.purchaseOrder_action}" id="purchaseOrder"
                                style="color: rgb(255, 255, 255); font-size: 18px; left: 20px; top: 130px; position: absolute" text="Purchase Order"/>
                            <webuijsf:hyperlink actionExpression="#{pages$PurchaseOrder.receiveDelivery_action}" id="receiveDelivery"
                                style="color: rgb(255, 255, 255); font-size: 18px; left: 20px; top: 160px; position: absolute" text="Receive Delivery"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout id="layoutPanel2" panelLayout="flow" style="background-color: #f39c12; height: 50px; left: 0px; top: 0px; position: absolute; width: 1363px"/>
                        <webuijsf:panelLayout id="layoutPanel3" panelLayout="flow" style="background-color: rgb(26, 34, 38); height: 46px; left: 0px; top: 72px; position: absolute; width: 238px">
                            <webuijsf:label id="label1" style="margin: 40px 10px 10px 40px; color: rgb(255, 255, 255); font-size: 24px; padding-top: 10px" text="Transactions"/>
                        </webuijsf:panelLayout>
                        <webuijsf:label id="label2" style="font-size: 24px; left: 312px; top: 96px; position: absolute" text="Purchase Order"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="height: 485px; left: 288px; top: 144px; position: absolute" title="Table" width="1056">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{pages$PurchaseOrder.defaultTableDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Purchase Id" id="tableColumn1" sort="column1">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['column1']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Supplier" id="tableColumn2" sort="column2">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['column2']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Status" id="tableColumn3" sort="column3">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['column3']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Action" id="tableColumn4" width="200">
                                    <webuijsf:staticText id="staticText4" text="Static Text"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{pages$PurchaseOrder.btnNewRecord_action}" id="btnNewRecord"
                            style="background-color: #006600; left: 1271px; top: 120px; position: absolute" text="New Record"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
