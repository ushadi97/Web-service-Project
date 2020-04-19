<%@page import="com.model.Beverage"%>
<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleBeverageServiceImplProxyid" scope="session" class="com.service.BeverageServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleBeverageServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleBeverageServiceImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleBeverageServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.service.BeverageServiceImpl getBeverageServiceImpl10mtemp = sampleBeverageServiceImplProxyid.getBeverageServiceImpl();
if(getBeverageServiceImpl10mtemp == null){
%>
<%=getBeverageServiceImpl10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String beverageId_1id=  request.getParameter("beverageId18");
        int beverageId_1idTemp  = Integer.parseInt(beverageId_1id);
        boolean deleteBeverage15mtemp = sampleBeverageServiceImplProxyid.deleteBeverage(beverageId_1idTemp);
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteBeverage15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
break;
case 20:
        gotMethod = true;
        String beverageId_3id=  request.getParameter("beverageId25");
        int beverageId_3idTemp  = Integer.parseInt(beverageId_3id);
        String beverageQty_4id=  request.getParameter("beverageQty27");
        int beverageQty_4idTemp  = Integer.parseInt(beverageQty_4id);
        String beveragePrice_5id=  request.getParameter("beveragePrice29");
        double beveragePrice_5idTemp  = Double.parseDouble(beveragePrice_5id);
        String beveragType_6id=  request.getParameter("beveragType31");
            java.lang.String beveragType_6idTemp = null;
        if(!beveragType_6id.equals("")){
         beveragType_6idTemp  = beveragType_6id;
        }
        String beverageName_7id=  request.getParameter("beverageName33");
            java.lang.String beverageName_7idTemp = null;
        if(!beverageName_7id.equals("")){
         beverageName_7idTemp  = beverageName_7id;
        }
        %>
        <jsp:useBean id="com1model1Beverage_2id" scope="session" class="com.model.Beverage" />
        <%
        com1model1Beverage_2id.setBeverageId(beverageId_3idTemp);
        com1model1Beverage_2id.setBeverageQty(beverageQty_4idTemp);
        com1model1Beverage_2id.setBeveragePrice(beveragePrice_5idTemp);
        com1model1Beverage_2id.setBeveragType(beveragType_6idTemp);
        com1model1Beverage_2id.setBeverageName(beverageName_7idTemp);
        boolean addBeverage20mtemp = sampleBeverageServiceImplProxyid.addBeverage(com1model1Beverage_2id);
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addBeverage20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
break;
case 35:
        gotMethod = true;
        String beverageId_8id=  request.getParameter("beverageId48");
        int beverageId_8idTemp  = Integer.parseInt(beverageId_8id);
        com.model.Beverage getBeverage35mtemp = sampleBeverageServiceImplProxyid.getBeverage(beverageId_8idTemp);
if(getBeverage35mtemp == null){
%>
<%=getBeverage35mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">beverageId:</TD>
<TD>
<%
if(getBeverage35mtemp != null){
%>
<%=getBeverage35mtemp.getBeverageId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">beverageQty:</TD>
<TD>
<%
if(getBeverage35mtemp != null){
%>
<%=getBeverage35mtemp.getBeverageQty()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">beveragePrice:</TD>
<TD>
<%
if(getBeverage35mtemp != null){
%>
<%=getBeverage35mtemp.getBeveragePrice()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">beveragType:</TD>
<TD>
<%
if(getBeverage35mtemp != null){
java.lang.String typebeveragType44 = getBeverage35mtemp.getBeveragType();
        String tempResultbeveragType44 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebeveragType44));
        %>
        <%= tempResultbeveragType44 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">beverageName:</TD>
<TD>
<%
if(getBeverage35mtemp != null){
java.lang.String typebeverageName46 = getBeverage35mtemp.getBeverageName();
        String tempResultbeverageName46 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebeverageName46));
        %>
        <%= tempResultbeverageName46 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 50:
        gotMethod = true;
        com.model.Beverage[] getAllBeverages50mtemp = sampleBeverageServiceImplProxyid.getAllBeverages();
if(getAllBeverages50mtemp == null){
%>
<%=getAllBeverages50mtemp %>
<%
}else{
	 String tempreturnp43 = null;
     if(getAllBeverages50mtemp != null){
     java.util.List<Beverage> listreturnp43= java.util.Arrays.asList(getAllBeverages50mtemp);
     for(Beverage b : listreturnp43){
     	int beverageId = b.getBeverageId();
     	String beveragType=b.getBeveragType();
     	String beverageName = b.getBeverageName();
     	int beverageQty = b.getBeverageQty();
     	double beveragePrice=b.getBeveragePrice();
     	%>
     	<%=beverageId%>::<%=beveragType %>::<%=beverageName %>::<%=beverageQty %>::<%=beveragePrice %>
     	<%
     	}
     }
     }      
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>