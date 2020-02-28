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
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet"
              href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css"
              integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
                integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
        <script src="https://unpkg.com/popper.js@1.12.6/dist/umd/popper.js"
                integrity="sha384-fA23ZRQ3G/J53mElWqVJEGJzU0sTs+SvzG8fXVWP+kJQ1lwFAOkcUOysnlKJC33U"
        crossorigin="anonymous"></script>
        <script src="https://unpkg.com/bootstrap-material-design@4.1.1/dist/js/bootstrap-material-design.js"
                integrity="sha384-CauSuKpEqAFajSpkdjv3z9t8E7RlpJ1UP0lKM/+NdtSarroVKu069AlsRPKkFBz9"
        crossorigin="anonymous"></script>
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
                                <div  class="form-group" >
                                    Adresse
                                    <input required ="" type="text" name="nom" class="form-control"  placeholder="nom">
                                </div>                                
                                <div  class="form-group" >
                                    Numéro de téléphone 
                                    <input required ="" type="text" name="prenom" class="form-control"  placeholder="prenom">
                                </div>


                                                            
                                <button type="submit" class="btn btn-primary btn-block font--bold ">Créer un client</button>   
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
