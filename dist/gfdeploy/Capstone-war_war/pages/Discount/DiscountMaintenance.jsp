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
                            <webuijsf:hyperlink actionExpression="#{pages$Discount$DiscountMaintenance.btnMenu_action}"
                                binding="#{pages$Discount$DiscountMaintenance.btnMenu}" id="btnMenu"
                                style="background-color: rgb(34, 45, 50); color: rgb(204, 204, 204); font-size: 24px; font-style: normal; left: 58px; top: 220px; position: absolute" text="Main Menu"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout id="layoutPanel2" panelLayout="flow" style="background-color: #3c8dbc; height: 50px; left: 0px; top: 0px; position: absolute; width: 1363px"/>
                        <webuijsf:button actionExpression="#{pages$Discount$DiscountMaintenance.btnNew_action}"
                            binding="#{pages$Discount$DiscountMaintenance.btnNew}" id="btnNew"
                            style="font-size: 18px; left: 1031px; top: 192px; position: absolute" text="New Record"/>
                        <webuijsf:label id="label1" style="font-size: 36px; left: 336px; top: 120px; position: absolute; width: 502px" text="Discount Maintenance"/>
                        <webuijsf:label id="label2" style="font-size: 18px; left: 456px; top: 192px; position: absolute" text="Search"/>
                        <webuijsf:textField binding="#{pages$Discount$DiscountMaintenance.txtSearch}" columns="40" id="txtSearch" style="font-size: 18px; left: 528px; top: 192px; position: absolute"/>
                        <webuijsf:button actionExpression="#{pages$Discount$DiscountMaintenance.btnSearch_action}"
                            binding="#{pages$Discount$DiscountMaintenance.btnSearch}" id="btnSearch"
                            style="font-size: 18px; left: 935px; top: 192px; position: absolute" text="Submit"/>
                        <webuijsf:checkbox binding="#{pages$Discount$DiscountMaintenance.all}" id="all" label="View all"
                            onClick="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'all');"
                            style="font-size: 18px; left: 336px; top: 192px; position: absolute" valueChangeListenerExpression="#{pages$Discount$DiscountMaintenance.all_processValueChange}"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="height: 149px; left: 336px; top: 240px; position: absolute; width: 816px"
                            title="Table" width="816">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.discountData}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Discount" id="tableColumn1" sort="name">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['name']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Type" id="tableColumn2" sort="isWhole">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['isWhole']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Rate" id="tableColumn3" sort="rate">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['rate']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Actions" id="tableColumn4">
                                    <webuijsf:button actionExpression="#{pages$Discount$DiscountMaintenance.btnUpdate_action}"
                                        binding="#{pages$Discount$DiscountMaintenance.btnUpdate}" id="btnUpdate" style="font-size: 18px" text="Update"/>
                                    <webuijsf:button actionExpression="#{pages$Discount$DiscountMaintenance.btnDelete_action}"
                                        binding="#{pages$Discount$DiscountMaintenance.btnDelete}" id="btnDelete" style="font-size: 18px" text="Deactivate"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
