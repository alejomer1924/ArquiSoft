<%-- 
    Document   : listCV
    Created on : Oct 16, 2019, 9:14:28 PM
    Author     : USUARIO
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
        <h1>Lista de CVs/  nombre | apellido | edad | sexo | email | numero de contacto | nombre de referencia laboral | numero de referencia laboral | estudios | experiencia laboral</h1>
        <c:forEach var="a" items="${curriculos}">
           |${a.nroCv}||${a.nombre}||${a.apellido}||${a.edad}||${a.sexo}||${a.email}|
           |${a.nroContacto}||${a.nombreRefLab}||${a.nroRefLab}||${a.estudios}| |${a.experiencia}|                   
           <hr/>
        </c:forEach> 
    </body>
</html>
