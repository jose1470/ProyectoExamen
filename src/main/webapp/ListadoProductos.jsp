<%@page import="model.TblProductocl2"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@page import="java.util.*" %>
      
    <%@page import="model.TblProductocl2" %>
   
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

  <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Productos</title>
</head>
<body bgcolor="#c5decf">
<h1>Listado de Productos Registrados en BD</h1>

<h2 align="center">
<a href="FormRegistrarProducto.jsp" style="text-decoration:none;color:blue;">Registrar Producto</a>
</h2>

<table border="2" align="center">

<tr>
 <td>Nombre</td>
 <td>Precioventa</td>
 <td>Preciocompra</td>
 <td>Estado</td>
 <td>Descripcion</td>
 </tr>
 

 <%
 List<TblProductocl2> listadoproducto=(List<TblProductocl2>)request.getAttribute("listadoproductos");
 
 //APLICAMOS UNA CONDICION
 if(listadoproducto!=null){
	 
	 //APLICAMOS UN BUVLE FOR..
	 for(TblProductocl2 lis:listadoproducto){
		 %>
		 <tr>
		 <td><%=lis.getIdproductocl2()%></td>
		 <td><%=lis.getNombrecl2()%></td>
		 <td><%=lis.getPrecioventacl2()%></td>
		 <td><%=lis.getPreciocompcl2()%></td>
		 <td><%=lis.getEstadocl2()%></td>
		 <td><%=lis.getDescripcl2()%></td>
		 </tr>
		 
 <% 
	 } //FIN DEL BUCLE FOR
	 %>
	 <% 
	 
 } //FIN DE LA CONDICION..
 
 %>

</table>

</body>
</html>