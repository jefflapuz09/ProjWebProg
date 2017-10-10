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
                            <webuijsf:hyperlink actionExpression="#{pages$ProductBrand$ProductBrandCreate.btnMenu_action}"
                                binding="#{pages$Discount$DiscountCreate.btnMenu}" id="btnMenu"
                                style="background-color: rgb(34, 45, 50); color: rgb(204, 204, 204); font-size: 24px; font-style: normal; left: 58px; top: 220px; position: absolute" text="Main Menu"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout id="layoutPanel2" panelLayout="flow" style="background-color: #3c8dbc; height: 50px; left: 0px; top: 0px; position: absolute; width: 1363px"/>
                        <webuijsf:button actionExpression="#{pages$Discount$DiscountCreate.btnSave_action}" binding="#{pages$Discount$DiscountCreate.btnSave}"
                            id="btnSave" style="left: 287px; top: 504px; position: absolute" text="Save"/>
                        <webuijsf:label id="label1" style="font-size: 36px; left: 288px; top: 120px; position: absolute; width: 480px" text="Discount Information"/>
                        <webuijsf:label id="label2" style="left: 288px; top: 192px; position: absolute" text="Discount*"/>
                        <webuijsf:textField binding="#{pages$Discount$DiscountCreate.txtDiscount}" columns="40" id="txtDiscount" style="font-size: 18px; left: 288px; top: 216px; position: absolute"/>
                        <webuijsf:messageGroup binding="#{pages$Discount$DiscountCreate.messageGroup1}" id="messageGroup1" style="left: 1032px; top: 96px; position: absolute; width: 310px"/>
                        <webuijsf:button actionExpression="#{pages$ProductBrand$ProductBrandCreate.btnBack_action}"
                            binding="#{pages$Discount$DiscountCreate.btnBack}" id="btnBack" style="left: 287px; top: 480px; position: absolute" text="Back"/>
                        <webuijsf:label id="label4" style="left: 744px; top: 192px; position: absolute; width: 120px" text="Product(s)*"/>
                        <webuijsf:label id="label3" style="left: 288px; top: 264px; position: absolute" text="Rate*"/>
                        <webuijsf:textField binding="#{pages$Discount$DiscountCreate.txtRate}" columns="40" id="txtRate" style="font-size: 18px; left: 288px; top: 288px; position: absolute"/>
                        <webuijsf:label id="label5" style="left: 288px; top: 336px; position: absolute" text="Type*"/>
                        <webuijsf:checkbox binding="#{pages$Discount$DiscountCreate.cbVatExempt}" id="cbVatExempt" label="Vat Exempted"
                            style="left: 288px; top: 432px; position: absolute" visible="false"/>
                        <webuijsf:radioButtonGroup binding="#{pages$Discount$DiscountCreate.rbType}" id="rbType"
                            items="#{pages$Discount$DiscountCreate.rbTypeDefaultOptions.options}"
                            onClick="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'rbType');" style="left: 288px; top: 360px; position: absolute" valueChangeListenerExpression="#{pages$Discount$DiscountCreate.rbType_processValueChange}"/>
                        <webuijsf:dropDown binding="#{pages$Discount$DiscountCreate.prod}" id="prod"
                            items="#{pages$Discount$DiscountCreate.prodDefaultOptions.options}"
                            style="font-size: 18px; left: 744px; top: 216px; position: absolute" width="200"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
