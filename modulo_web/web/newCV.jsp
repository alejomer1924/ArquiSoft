<%-- 
    Document   : newCV
    Created on : Oct 16, 2019, 10:07:55 PM
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="style.css">
        <!-- Optional theme-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">    
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
   
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
        <h1>Ingresar cv</h1>
        <div class="container well">
            <div align="center">
            <form action="servlet?action=insert" method="post">
                <table>
                    <tr>
                        <th><label><b>Nombre:</b></label></th>
                        <th>
                            <input type="text" minlength="1" maxlength="30" placeholder="Ingrese nombre" class="form-control" name="nombre" required=""/>
                        </th>
                    </tr>
                    <tr>
                        <th><label><b>Apellido:</b></label></th>
                        <th>
                            <input type="text" maxlength="30" placeholder="Ingrese apellido" class="form-control" name="apellido" />
                        </th>
                    </tr>
                    <tr>
                        <th><label><b>Edad:</b></label></th>
                        <th>
                            <input type="number" maxlength="3" placeholder="Ingrese la edad" class="form-control" name="edad" />                            
                        </th>
                    </tr>                       
                    <tr>
                        <th><label><b>Sexo:</b></label></th>
                        <th>                            
                            <input type="text" maxlength="1" placeholder="Ingrese el sexo" class="form-control" name="sexo" />
                        </th>
                    </tr>
                    <tr>
                        <th><label><b>Email:</b></label></th>
                        <th>        
                            <input type="text"  maxlength="50" placeholder="Ingrese el email" class="form-control" name="email" />                            
                        </th>
                    </tr>
                    <tr>
                        <th><label><b>Numero contacto:</b></label></th>
                        <th>  
                            <input type="number" maxlength="50" placeholder="Ingrese el nro de contacto" class="form-control" name="nroContacto" />                            
                        </th>
                    </tr>                    
                    <tr>
                        <th><label><b>Nombre referencia Laboral:</b></label></th>
                        <th>  
                            <input type="text" placeholder="Ingrese el nombre de referencia laboral" class="form-control" name="nombreRefLab" />                            
                        </th>
                    </tr>
                    <tr>
                        <th><label><b>Numero referencia laboral:</b></label></th>
                        <th>  
                            <input type="text" placeholder="Ingrese el nro de rferencia" class="form-control" name="nroRefLab" />                            
                        </th>
                    </tr>
                    <tr>
                        <th><label><b>Estudios:</b></label></th>
                        <th>  
                            <input type="text" placeholder="Ingrese estudios" class="form-control" name="estudios" />                            
                        </th>
                    </tr>
                    <tr>
                        <th><label><b>Experiencia:</b></label></th>
                        <th>  
                            <input type="text" placeholder="Ingrese experiencia" class="form-control" name="experiencia" />                            
                        </th>
                    </tr>                    
                    <div class="break"></div>
                    </div>
                    <tr>
                        <td colspan="2">
                            <input class="btn icon-btn btn-success" type="submit" name="action" value="Insert">
                            <span class="glyphicon glyphicon-ok-sign"></span>
                            <input class="btn icon-btn btn-lg" type="reset" name="action" value="Reset">
                            <span class="glyphicon glyphicon-remove"></span>
                        </td>
                    </tr>
                </table>    
        </form> 
            </div>
            <br>
        </div>        
    </body>
</html>
