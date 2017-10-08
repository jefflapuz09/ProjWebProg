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
                            <webuijsf:hyperlink actionExpression="#{pages$Product$ProductCreate.btnMenu_action}"
                                binding="#{pages$ProductBrand$ProductBrandCreate.btnMenu}" id="btnMenu"
                                style="background-color: rgb(34, 45, 50); color: rgb(204, 204, 204); font-size: 24px; font-style: normal; left: 58px; top: 220px; position: absolute" text="Main Menu"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout id="layoutPanel2" panelLayout="flow" style="background-color: #3c8dbc; height: 50px; left: 0px; top: 0px; position: absolute; width: 1363px"/>
                        <webuijsf:button actionExpression="#{pages$Product$ProductCreate.btnSave_action}" binding="#{pages$Product$ProductCreate.btnSave}"
                            id="btnSave" style="left: 287px; top: 528px; position: absolute" text="Save"/>
                        <webuijsf:label id="label1" style="font-size: 36px; left: 288px; top: 120px; position: absolute; width: 480px" text="Product Information"/>
                        <webuijsf:label id="label2" style="left: 288px; top: 192px; position: absolute" text="Product Type*"/>
                        <webuijsf:messageGroup binding="#{pages$Product$ProductCreate.messageGroup1}" id="messageGroup1" style="left: 1032px; top: 96px; position: absolute; width: 310px"/>
                        <webuijsf:button actionExpression="#{pages$Product$ProductCreate.btnBack_action}" binding="#{pages$Product$ProductCreate.btnBack}"
                            id="btnBack" style="left: 287px; top: 504px; position: absolute" text="Back"/>
                        <webuijsf:radioButtonGroup binding="#{pages$Product$ProductCreate.ptype}" columns="2" id="ptype"
                            items="#{pages$Product$ProductCreate.ptypeDefaultOptions.options}" style="font-size: 18px; left: 288px; top: 216px; position: absolute"/>
                        <webuijsf:label id="label3" style="left: 288px; top: 264px; position: absolute" text="Type*"/>
                        <webuijsf:dropDown binding="#{pages$Product$ProductCreate.prodtype}" id="prodtype"
                            items="#{pages$Product$ProductCreate.prodtypeDefaultOptions.options}"
                            style="font-size: 18px; left: 288px; top: 288px; position: absolute" width="200"/>
                        <webuijsf:label id="label4" style="left: 288px; top: 360px; position: absolute" text="Variance*"/>
                        <webuijsf:dropDown binding="#{pages$Product$ProductCreate.variance}" id="variance"
                            items="#{pages$Product$ProductCreate.varianceDefaultOptions.options}"
                            style="font-size: 18px; left: 288px; top: 384px; position: absolute" width="200"/>
                        <webuijsf:label id="label5" style="position: absolute; left: 576px; top: 192px" text="Product*"/>
                        <webuijsf:textField binding="#{pages$Product$ProductCreate.txtProduct}" columns="30" id="txtProduct" style="font-size: 18px; left: 576px; top: 216px; position: absolute"/>
                        <webuijsf:label id="label6" style="position: absolute; left: 576px; top: 264px" text="Description"/>
                        <webuijsf:textArea binding="#{pages$Product$ProductCreate.txtDescription}" columns="50" id="txtDescription" rows="4" style="left: 576px; top: 288px; position: absolute"/>
                        <webuijsf:label id="leb" style="left: 576px; top: 360px; position: absolute" text="Price*"/>
                        <webuijsf:textField binding="#{pages$Product$ProductCreate.txtPrice}" columns="30" id="txtPrice" style="font-size: 18px; left: 576px; top: 384px; position: absolute"/>
                        <webuijsf:label id="label7" style="left: 576px; top: 432px; position: absolute" text="Reorder*"/>
                        <webuijsf:textField binding="#{pages$Product$ProductCreate.txtReorder}" columns="30" id="txtReorder" style="font-size: 18px; left: 576px; top: 456px; position: absolute"/>
                        <webuijsf:label id="label8" style="left: 288px; top: 312px; position: absolute" text="Brand*"/>
                        <webuijsf:dropDown binding="#{pages$Product$ProductCreate.brand}" id="brand"
                            items="#{pages$Product$ProductCreate.brandDefaultOptions.options}"
                            style="font-size: 18px; left: 288px; top: 336px; position: absolute" width="200"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
