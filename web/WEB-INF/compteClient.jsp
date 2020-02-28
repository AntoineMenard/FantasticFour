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
            <div class="row">
                <div class="col-sm-7">
                    <h4 >Liste des comptes : </h4> 
                    <table class="table">
                        <thead class="thead-light">
                            <tr>
                                <th>Numéro de <br>compte</th>
                                <th class="text-align-center">Solde (€)</th>
                                <th>Decouvert <br> autorisé(€) </th>
                                
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items = "${comptesutilisateur}" var = "c">
                                <tr>
                                    <td class="align-center">${c.idcompte}</td>
                                    <td class="align-center">${c.solde}</td>
                                    <td class="align-center">${c.decouvertpermis}</td>


                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>
                </div>
            </div>


        </div>


    </body>
</html>
