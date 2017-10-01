<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : SupplierMaintenanceUpdate
    Created on : Oct 1, 2017, 8:52:43 PM
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
                            <webuijsf:hyperlink actionExpression="#{pages$Supplier$SupplierMaintenanceUpdate.btnMenu_action}"
                                binding="#{pages$Supplier$SupplierMaintenanceUpdate.btnMenu}" id="btnMenu"
                                style="background-color: rgb(34, 45, 50); color: rgb(204, 204, 204); font-size: 24px; font-style: normal; left: 58px; top: 220px; position: absolute" text="Main Menu"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout id="layoutPanel2" panelLayout="flow" style="background-color: #3c8dbc; height: 50px; left: 0px; top: 0px; position: absolute; width: 1363px"/>
                        <webuijsf:button actionExpression="#{pages$Supplier$SupplierMaintenanceUpdate.btnSave_action}"
                            binding="#{pages$Supplier$SupplierMaintenanceUpdate.btnSave}" id="btnSave" style="left: 287px; top: 480px; position: absolute" text="Save"/>
                        <webuijsf:label id="label1" style="font-size: 36px; left: 288px; top: 96px; position: absolute; width: 406px" text="Supplier Information"/>
                        <webuijsf:label id="label2" style="left: 288px; top: 192px; position: absolute" text="Supplier *"/>
                        <webuijsf:textField binding="#{pages$Supplier$SupplierMaintenanceUpdate.txtSupplier}" columns="40" id="txtSupplier" style="font-size: 18px; left: 288px; top: 216px; position: absolute"/>
                        <webuijsf:label id="label3" style="left: 288px; top: 264px; position: absolute" text="Address"/>
                        <webuijsf:label id="label4" style="position: absolute; left: 288px; top: 288px" text="No. &amp; St./Bldg."/>
                        <webuijsf:textField binding="#{pages$Supplier$SupplierMaintenanceUpdate.txtSt}" columns="15" id="txtSt" style="font-size: 18px; left: 288px; top: 312px; position: absolute"/>
                        <webuijsf:label id="label5" style="position: absolute; left: 432px; top: 288px" text="Brgy./Subd."/>
                        <webuijsf:textField binding="#{pages$Supplier$SupplierMaintenanceUpdate.txtBrgy}" columns="15" id="txtBrgy" style="font-size: 18px; left: 456px; top: 312px; position: absolute"/>
                        <webuijsf:label id="label6" style="left: 576px; top: 288px; position: absolute" text="City/Municipality*"/>
                        <webuijsf:textField binding="#{pages$Supplier$SupplierMaintenanceUpdate.txtCity}" columns="15" id="txtCity" style="font-size: 18px; left: 624px; top: 312px; position: absolute"/>
                        <webuijsf:label id="label9" style="left: 816px; top: 192px; position: absolute; width: 144px" text="Contact Person(s)"/>
                        <webuijsf:label id="label10" style="left: 816px; top: 216px; position: absolute; width: 120px" text="Main Contact Person"/>
                        <webuijsf:textField binding="#{pages$Supplier$SupplierMaintenanceUpdate.txtContactP}" id="txtContactP" style="font-size: 18px; left: 816px; top: 240px; position: absolute"/>
                        <webuijsf:label id="label11" style="left: 1032px; top: 216px; position: absolute; width: 168px" text="Contact Number"/>
                        <webuijsf:textField binding="#{pages$Supplier$SupplierMaintenanceUpdate.txtPContactNum}" id="txtPContactNum" style="font-size: 18px; left: 1032px; top: 240px; position: absolute"/>
                        <webuijsf:messageGroup binding="#{pages$Supplier$SupplierMaintenanceUpdate.messageGroup1}" id="messageGroup1" style="left: 1032px; top: 96px; position: absolute; width: 310px"/>
                        <webuijsf:button actionExpression="#{pages$Supplier$SupplierMaintenanceUpdate.btnBack_action}"
                            binding="#{pages$Supplier$SupplierMaintenanceUpdate.btnBack}" id="btnBack" style="left: 287px; top: 456px; position: absolute" text="Back"/>
                        <webuijsf:label id="label7" style="left: 288px; top: 360px; position: absolute" text="Contact"/>
                        <webuijsf:label id="label8" style="position: absolute; left: 288px; top: 384px" text="Contact Number"/>
                        <webuijsf:textField binding="#{pages$Supplier$SupplierMaintenanceUpdate.txtContact}" columns="40" id="txtContact" style="font-size: 18px; left: 288px; top: 408px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
