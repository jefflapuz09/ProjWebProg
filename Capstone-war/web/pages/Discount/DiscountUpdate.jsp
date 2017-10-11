<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : DiscountUpdate
    Created on : Oct 10, 2017, 5:03:11 PM
    Author     : bunag
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:panelLayout id="layoutPanel1" panelLayout="flow" style="background-color: rgb(34, 45, 50); height: 662px; left: 0px; top: 0px; position: absolute; width: 238px">
                            <webuijsf:hyperlink actionExpression="#{pages$Discount$DiscountUpdate.btnMenu_action}" id="btnMenu1"
                                style="background-color: rgb(34, 45, 50); color: rgb(204, 204, 204); font-size: 24px; font-style: normal; left: 58px; top: 220px; position: absolute" text="Main Menu"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout id="layoutPanel2" panelLayout="flow" style="background-color: rgb(60, 141, 188); height: 50px; left: 0px; top: 0px; position: absolute; width: 1363px"/>
                        <webuijsf:button actionExpression="#{pages$Discount$DiscountUpdate.btnSave_action}" id="btnSave"
                            style="left: 263px; top: 480px; position: absolute" text="Save"/>
                        <webuijsf:label id="label1" style="font-size: 36px; left: 264px; top: 96px; position: absolute; width: 480px" text="Discount Information"/>
                        <webuijsf:label id="label2" style="left: 264px; top: 168px; position: absolute" text="Discount*"/>
                        <webuijsf:textField binding="#{pages$Discount$DiscountUpdate.txtDiscount}" columns="40" id="txtDiscount" style="font-size: 18px; left: 264px; top: 192px; position: absolute"/>
                        <webuijsf:messageGroup id="messageGroup1" style="left: 1008px; top: 72px; position: absolute; width: 310px"/>
                        <webuijsf:button actionExpression="#{pages$Discount$DiscountUpdate.btnBack_action}" id="btnBack"
                            style="left: 263px; top: 456px; position: absolute" text="Back"/>
                        <webuijsf:label id="label3" style="left: 720px; top: 168px; position: absolute; width: 120px" text="Product(s)*"/>
                        <webuijsf:label id="label4" style="left: 264px; top: 240px; position: absolute" text="Rate*"/>
                        <webuijsf:textField binding="#{pages$Discount$DiscountUpdate.txtRate}" columns="40" id="txtRate" style="font-size: 18px; left: 264px; top: 264px; position: absolute"/>
                        <webuijsf:label id="label5" style="left: 264px; top: 312px; position: absolute" text="Type*"/>
                        <webuijsf:checkbox binding="#{pages$Discount$DiscountUpdate.cbVatExempt}" id="cbVatExempt" label="Vat Exempted"
                            style="left: 264px; top: 408px; position: absolute" visible="false"/>
                        <webuijsf:radioButtonGroup binding="#{pages$Discount$DiscountUpdate.rbType}" id="rbType"
                            items="#{pages$Discount$DiscountUpdate.rbTypeDefaultOptions.options}"
                            onClick="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'rbType');" style="left: 264px; top: 336px; position: absolute" valueChangeListenerExpression="#{pages$Discount$DiscountUpdate.rbType_processValueChange}"/>
                        <webuijsf:dropDown id="prod1" items="#{pages$Discount$DiscountUpdate.prod1DefaultOptions.options}"
                            style="font-size: 18px; left: 720px; top: 192px; position: absolute" width="200"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
