<%-- 
    Document   : consulterMessageClient
    Created on : 28 févr. 2020, 16:32:32
    Author     : esic
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Messagerie</title>

    </head>
    <body>
        <%@include file = "menuClient.jsp"%>
        <div class="container">
            <br>
            <div class="row">
                <div class="col-sm-7">
                    <h4 >Boite de réception : </h4> 
                    <table class="table">
                        <thead class="thead-light">
                            <tr>
                                <th>Date</th>
                                <th class="text-align-center">Envoyé par</th>
                                <th> zefzfze</th>
                                
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items = "${messagesclient}" var = "m">
                                <tr>
                                    <td class="align-center">${m.date}</td>
                                    <td class="align-center">${m.idConseiller}</td>
                                    <td class="align-center">${m.message}</td>


                                </tr>
                            </c:forEach>
                                    

                        </tbody>
                    </table>
                </div>
            </div>


        </div>
            


    </body>
</html>
