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
                            <webuijsf:hyperlink actionExpression="#{pages$ProductType$ProductTypeUpdate.btnMenu_action}"
                                binding="#{pages$ProductType$ProductTypeUpdate.btnMenu}" id="btnMenu"
                                style="background-color: rgb(34, 45, 50); color: rgb(204, 204, 204); font-size: 24px; font-style: normal; left: 58px; top: 220px; position: absolute" text="Main Menu"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout id="layoutPanel2" panelLayout="flow" style="background-color: #3c8dbc; height: 50px; left: 0px; top: 0px; position: absolute; width: 1363px"/>
                        <webuijsf:button actionExpression="#{pages$ProductType$ProductTypeUpdate.btnSave_action}"
                            binding="#{pages$ProductType$ProductTypeUpdate.btnSave}" id="btnSave" style="left: 287px; top: 480px; position: absolute" text="Save"/>
                        <webuijsf:label id="label1" style="font-size: 36px; left: 288px; top: 120px; position: absolute; width: 480px" text="Product Type Information"/>
                        <webuijsf:label id="label2" style="left: 288px; top: 192px; position: absolute" text="Product Type*"/>
                        <webuijsf:textField binding="#{pages$ProductType$ProductTypeUpdate.txtName}" columns="40" id="txtName" style="font-size: 18px; left: 288px; top: 216px; position: absolute"/>
                        <webuijsf:messageGroup binding="#{pages$ProductType$ProductTypeUpdate.messageGroup1}" id="messageGroup1" style="left: 1032px; top: 96px; position: absolute; width: 310px"/>
                        <webuijsf:button actionExpression="#{pages$ProductType$ProductTypeUpdate.btnBack_action}"
                            binding="#{pages$ProductType$ProductTypeUpdate.btnBack}" id="btnBack" style="left: 287px; top: 456px; position: absolute" text="Back"/>
                        <webuijsf:label id="label4" style="position: absolute; left: 288px; top: 264px" text="Category*"/>
                        <webuijsf:radioButtonGroup binding="#{pages$ProductType$ProductTypeUpdate.category}" columns="2" id="category"
                            items="#{pages$ProductType$ProductTypeCreate.categoryDefaultOptions.options}" style="font-size: 18px; left: 288px; top: 288px; position: absolute"/>
                        <webuijsf:label id="label3" style="position: absolute; left: 816px; top: 192px" text="Brand*"/>
                        <webuijsf:textField binding="#{pages$ProductType$ProductTypeUpdate.txtBrand}" columns="40" id="txtBrand" style="font-size: 18px; left: 792px; top: 216px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
