<%-- 
    Document   : profil
    Created on : 28 févr. 2020, 11:31:48
    Author     : esic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Profil</title>

    </head>
    <body>
        <%@include file = "menuClient.jsp"%>
         <br> <br> <br> <br>
        <div class="card">
            <div class="card-header cardHeaderPerso">
                <h1 class="text-center">Profil</h1>
                <br>
                <div class="row">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-3">
                        <img src="${photoUser}" height= "200" width= "300" />
                    </div>
                    <div class="col-sm-7">
                        <br> <br>
                        <div class="row">
                            <div class="col-sm-2">
                                <div>
                                    ${nomUser} ${prenomUser} 
                                </div>
                                <div>
                                <br>
                                    contact : <br><br>
                                    adresse : <br><br>
                                </div>
                            </div>
                            <div class="col-sm-2">
                                <br><br>
                                telephone : ${telUser}
                                <br><br>
                                ${adresseUser}
                            </div>
                            <div class="col-sm-2">
                                <br><br>
                                mail : ${mailUser}
                            </div>
                            <div class="col-sm-6">
                                <br><br>
                                 <button  type="button"  class="btn btn-default btn-sm ">éditer le profil</button>
                            </div>
                        </div>
                           
                    </div>

                </div>
                <br> <br>
            </div>
        </div>
    </body>
</html>
