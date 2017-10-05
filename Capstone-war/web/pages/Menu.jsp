<?xml version="1.0" encoding="UTF-8"?>
<!--
    Document   : Menu
    Created on : Oct 1, 2017, 1:16:57 PM
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
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:panelLayout id="layoutPanel1" panelLayout="flow" style="background-color: rgb(34, 45, 50); height: 662px; left: 0px; top: 0px; position: absolute; width: 238px">
                            <webuijsf:hyperlink actionExpression="#{pages$Menu.btnMaintenance_action}" binding="#{pages$Menu.btnMaintenance}"
                                id="btnMaintenance"
                                style="background-color: rgb(34, 45, 50); color: rgb(204, 204, 204); font-size: 24px; font-style: normal; left: 50px; top: 100px; position: absolute" text="Maintenance"/>
                            <webuijsf:hyperlink actionExpression="#{pages$Menu.btnSupplier_action}" binding="#{pages$Menu.btnSupplier}" id="btnSupplier"
                                style="background-color: rgb(34, 45, 50); color: #ffffff; font-size: 18px; font-style: normal; left: 85px; top: 135px; position: absolute"
                                text="Supplier" visible="false"/>
                            <webuijsf:hyperlink actionExpression="#{pages$Menu.btnType_action}" binding="#{pages$Menu.btnType}" id="btnType"
                                style="background-color: rgb(34, 45, 50); color: rgb(255, 255, 255); font-size: 18px; font-style: normal; left: 65px; top: 160px; position: absolute"
                                text="Product Type" visible="false"/>
                            <webuijsf:hyperlink actionExpression="#{pages$Menu.btnBrand_action}" binding="#{pages$Menu.btnBrand}" id="btnBrand"
                                style="background-color: rgb(34, 45, 50); color: rgb(255, 255, 255); font-size: 18px; font-style: normal; left: 60px; top: 185px; position: absolute"
                                text="Product Brand" visible="false"/>
                            <webuijsf:hyperlink actionExpression="#{pages$Menu.btnUnit_action}" binding="#{pages$Menu.btnUnit}" id="btnUnit"
                                style="background-color: rgb(34, 45, 50); color: rgb(255, 255, 255); font-size: 18px; font-style: normal; left: 70px; top: 210px; position: absolute"
                                text="Product Unit" visible="false"/>
                            <webuijsf:hyperlink actionExpression="#{pages$Menu.btnVariance_action}" binding="#{pages$Menu.btnVariance}" id="btnVariance"
                                style="background-color: rgb(34, 45, 50); color: rgb(255, 255, 255); font-size: 18px; font-style: normal; left: 50px; top: 235px; position: absolute"
                                text="Product Variance" visible="false"/>
                            <webuijsf:hyperlink actionExpression="#{pages$Menu.btnTransaction_action}" binding="#{pages$Menu.btnTransaction}"
                                id="btnTransaction"
                                style="background-color: rgb(34, 45, 50); color: rgb(204, 204, 204); font-size: 24px; font-style: normal; left: 58px; top: 260px; position: absolute" text="Transaction"/>
                            <webuijsf:hyperlink actionExpression="#{pages$Menu.btnPurchase_action}" binding="#{pages$Menu.btnPurchase}" id="btnPurchase"
                                style="background-color: rgb(34, 45, 50); color: rgb(255, 255, 255); font-size: 18px; font-style: normal; left: 57px; top: 295px; position: absolute"
                                text="Purchase Order" visible="false"/>
                            <webuijsf:hyperlink actionExpression="#{pages$Menu.btnReceive_action}" binding="#{pages$Menu.btnReceive}" id="btnReceive"
                                style="background-color: rgb(34, 45, 50); color: rgb(255, 255, 255); font-size: 18px; font-style: normal; left: 52px; top: 320px; position: absolute"
                                text="Receive Delivery" visible="false"/>
                            <webuijsf:image height="40" id="image1" style="left: 20px; top: 53px; position: absolute" url="/resources/logo.png" width="40"/>
                            <webuijsf:label id="label2" style="color: rgb(255, 255, 255); font-size: 14px; left: 73px; top: 65px; position: absolute" text="Administrator"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout id="layoutPanel2" panelLayout="flow" style="background-color: #3c8dbc; height: 50px; left: 0px; top: 0px; position: absolute; width: 1363px">
                            <webuijsf:label id="label1" style="color: rgb(255, 255, 255); font-size: 20px; left: 87px; top: 13px; position: absolute" text="iAyos"/>
                        </webuijsf:panelLayout>
                        <webuijsf:label id="label3"
                            style="color: #cccccc; font-family: Chivo; font-size: 84px; left: 336px; top: 240px; position: absolute; text-align: center; width: 982px" text="CAR CARE SERVICE MANAGEMENT SYSTEM"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
