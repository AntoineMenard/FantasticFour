<%-- 
    Document   : consultationConseiller
    Created on : 28 févr. 2020, 11:56:08
    Author     : esic
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Conseillers</title>

    </head>
    <body>
        <%@include file = "menuConseiller.jsp"%>
        <div class="text-center">
            
        </div>
        
        
        <br>

        <div class="container"> 
            <div class="row">
                <div class="col-sm-2"></div>
                <div class="col-sm-8">
                    <h4 >Liste des demandes d'inscription : </h4> 
                    <table class="table">
                        <thead class="thead-light">
                            <tr>
                                <th class="text-center">EMAIL</th>
                                <th class="text-center">NOM</th>
                                <th class="text-center">PRENOM</th>
                                <th class="text-center">ADRESSE</th>
                                <th class="text-center">TEL</th>
                                <th class="text-center">EDIT</th>
                                <th class="text-center">DELETE</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${creationclient}" var="li">
                                <tr>
                                    <td class="text-center">${li.mail}</td>
                                    <td class="text-center">${li.nom}</td>
                                    <td class="text-center">${li.prenom}</td>
                                    <td class="text-center">${li.adresse}</td>
                                    <td class="text-center">${li.tel}</td>
                                    <td class="text-center">
                                        <button class="btn"><i class="material-icons">edit</i></button>
                                    </td>
                                    <!--td class="text-center">

                                        <button class="btn" onclick="idDelete(${li.iddemandeInscription})"><i style="color:darkred" class="material-icons" >delete</i></button>
                                    </td-->


                                </tr>

                            </c:forEach>
                        </tbody>
                    </table>

                    <form action='deleteinscription' method="post" id="myForm">

                        <input type="hidden" id="id" name ="id">

                    </form>


                </div>

            </div>
  
            
        </div>
                    
        <script>

            function idDelete(idrecup) {

                // console.log("Test test", idrecup);
                document.querySelector('#id').value = idrecup;
                document.querySelector("#myForm").submit();

            }

        </script>
        
        
    </body>
</html>
