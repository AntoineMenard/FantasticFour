<%-- 
    Document   : compte
    Created on : 28 févr. 2020, 11:33:01
    Author     : esic
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Compte</title>

    </head>
    <body>
        <%@include file = "menuClient.jsp"%>
        <div class="container">
            <br>
            <h4 >Liste des comptes : </h4> 
            <table class="table">
                <thead class="thead-light">
                    <tr>
                        <th>Numéro de compte</th>
                        <th>Solde</th>
                        <th>a </th>
                        <th> a</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items = "${comptes}" var = "c">
                    <tr>
                        <td class="align-center">${c.idcomtpe}</td>
                        <td class="align-center">${c.solde}</td>
                        <td class="align-center">${c.decouvertpermis}</td>
                        <td><button class="btn btn-primary align-center btnConnex"  ><i class="fas fa-pen"></i></button></td>
                        <td><button class="btn btn-primary align-center btnConnex"  >
                                <i class="fas fa-times"></i></button></td>

                    </tr>
                </c:forEach>

                </tbody>
            </table>


        </div>


    </body>
</html>
