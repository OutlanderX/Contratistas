<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Contratistas</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
	<div id="logo">
		<h1><a href="#">HandyMan  </a></h1>
		
	</div>
	<hr />
	<!-- end #logo -->
	<div id="splash">
		<div class="col1"><img src="images/handymanLogo.jpg" width="660" height="300" alt="" /></div>
		<div class="col2">
			<blockquote>&#8220;La manera más fácil y rápida de conseguir contratistas.&#8221;</blockquote>
		</div>
	</div>
	<div id="header">
		<div id="menu">
			<ul>
				<li class="current_page_item"><a href="inicio.jsp" class="first">Inicio</a></li>
				<li><a href="foro.jsp">Foro</a></li>
				<li><a href="login.jsp">Ingresar</a></li>
				<li><a href="#">Acerca de</a></li>
			</ul>
		</div>
		<!-- end #menu -->
		<div id="search">
			<form method="get" action="">
				<fieldset>
				<input type="text" name="s" id="search-text" size="15" />
				<input type="submit" id="search-submit" value="" />
				</fieldset>
			</form>
		</div>
		<!-- end #search -->
	</div>
	<!-- end #header -->
	<!-- end #header-wrapper -->
	<div id="page">
		<div id="content">
		  <div class="post">
		
	
	<b>Employee Record</b></td>
	</tr>
	<tr style="background-color:efefef;">
	<td><b>Nombre</b></td>
	<td><b>Descripcion</b></td>
	<td><b>Tipo</b></td>
	<td><b>Numero</b></td>
	<td><b>Distrito</b></td>


</tr>
<%
	int count=0;
	String color = "#F9EBB3";


	if(request.getAttribute("listado")!=null)
	{
	ArrayList al = (ArrayList)request.getAttribute("listado");
	Iterator itr = al.iterator();


	while(itr.hasNext()){

	if((count%2)==0){
	color = "#eeffee";
	}
	else{
	color = "#F9EBB3";
	}
	count++;
	ArrayList list = (ArrayList)itr.next();
	%>
	<tr style="background-color:<%=color%>;">
	<td><%=list.get(1)%></td>
	<td><%=list.get(2)%></td>
	<td><%=list.get(3)%></td>
	<td><%=list.get(4)%></td>
	<td><%=list.get(5)%></td>
	</tr>
	<%
	}
	}
	%>
	<%
	if(count==0){
	%>
	<tr>
	<td colspan=8 align="center"	
	style="background-color:eeffee"><b>No Record</b></td>
	</tr>
	<%
	}
	%>
	</table>
		 
		  </div>
		</div><!-- end #content -->
		<div id="sidebar">
			<ul>
				<li>
					<h2>Tags </h2>
					<ul>
						<li><a href="#">Plomeria</a></li>
						<li><a href="#">Albañilería</a></li>
						<li><a href="#">Electricidad</a></li>
						<li><a href="#">Carpinteria</a></li>
						<li><a href="#">Ventanería</a></li>
						<li><a href="#">Herrería</a></li>
						<li><a href="#">Instalación de pisos</a></li>
						<li><a href="#">Pintura</a></li>
						<li><a href="#">Jardinería</a></li>
						<li><a href="#">Redes</a></li>
						<li><a href="#">Aire acondicionado</a></li>
						
					
					</ul>
				</li>
				
			</ul>
		</div>
		<!-- end #sidebar -->
		<div style="clear: both;">&nbsp;</div>
	</div>
	
	<!-- end #page -->
	<div id="footer">
		<p>&copy; Untitled. All rights reserved. Design by <a href="http://templated.co" rel="nofollow">TEMPLATED</a>.</p>
	</div>
	<!-- end #footer -->
</body>
</html>