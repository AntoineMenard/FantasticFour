<%-- 
    Document   : creationClient
    Created on : 28 févr. 2020, 15:11:27
    Author     : esic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="row">
            <div class = "col-sm-2"></div>

            <div class="col-sm-8">
                <div class="card">
                    <div class = "card-header cardHeaderPerso">
                        <h3 class="text-center">Remplissez le formulaire pour créer un client</h3>  

                    </div>
                    <div class="card-body">
                        <div>
                            <form action="creationclient" method="POST">
                                <div  class="form-group" >
                                    Nom 
                                    <input required ="" type="text" name="nom" class="form-control"  placeholder="nom">
                                </div>                                
                                <div  class="form-group" >
                                    Prénom 
                                    <input required ="" type="text" name="prenom" class="form-control"  placeholder="prenom">
                                </div>
                                <div  class="form-group" >
                                    Email 
                                    <input required ="" type="text" name="mail" class="form-control"  placeholder="email">
                                </div>
                                <div  class="form-group" >
                                    Mot de passe
                                    <input required ="" type="text" name="mdp" class="form-control"  placeholder="mot de passe">
                                </div>
                                                            
                                <button type="submit" class="btn btn-primary btn-block font--bold ">Créer un conseiller</button>   
                            </form>                            

                        </div>
                        
                        <p >

                            ${bienCree}

                        </p>
                        
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
