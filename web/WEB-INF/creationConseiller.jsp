<%-- 
    Document   : creationConseiller
    Created on : 28 févr. 2020, 11:54:10
    Author     : esic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Création conseiller</title>
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
        <div class="text-center">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="home">ACCUEIL</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown"
                        aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>


                <div class="collapse navbar-collapse" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                CONSEILLERS
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="creationconseiller">Créer un conseiller</a>
                                <a class="dropdown-item" href="listeconseiller">Consulter compte des consillers</a>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="historiqueconseiller" >HISTORIQUE DE CONNEXION</a>
                        </li>
                    </ul>
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item ">
                            <button type="button" class="btn btn-danger" onclick="location.href = 'deconnexion'">DECONNEXION</button>    
                        </li>
                    </ul>
                </div>
            </nav>
        </div>

        <br> <br>
        <div class="row">
            <div class = "col-sm-2"></div>

            <div class="col-sm-8">
                <div class="card">
                    <div class = "card-header cardHeaderPerso">
                        <h3 class="text-center">Remplissez le formulaire pour créer un conseiller</h3>  

                    </div>
                    <div class="card-body">
                        <div>
                            <form action="creationconseiller" method="POST">
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
                            
                            <p >

                                ${msg}

                            </p>

                        </div>
                        
                        
                        
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
