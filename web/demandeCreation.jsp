<%-- 
    Document   : Inscription
    Created on : 26 févr. 2020, 15:57:22
    Author     : esic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "fr">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet"
              href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css"
              integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous">

        <title>Primo Dev 19</title>
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
        <br> <br>
        <div class="row">
            <div class = "col-sm-2"></div>

            <div class="col-sm-8">
                <div class="card">
                    <div class = "card-header cardHeaderPerso">
                        <h3 class="text-center">Remplissez le formulaire de demande de création</h3>  
                        
                    </div>
                    <div class="card-body">
                        <div>
                            <form action="inscription" method="POST">
                                <div  class="form-group" >
                                     Nom 
                                    <input required ="" type="text" name="nomUser" class="form-control"  placeholder="nom">
                                </div>                                
                                <div  class="form-group" >
                                     Prénom 
                                    <input required ="" type="text" name="prenomUser" class="form-control"  placeholder="prenom">
                                </div>
                                <div  class="form-group" >
                                     Adresse 
                                    <input required ="" type="text" name="nomUser" class="form-control"  placeholder="adresse">
                                </div>
                                <div  class="form-group" >
                                     Mail 
                                    <input required ="" type="text" name="nomUser" class="form-control"  placeholder="mail">
                                </div>
                                <div  class="form-group" >
                                    Telephone 
                                    <input required ="" type="text" name="nomUser" class="form-control" placeholder ="numéro de téléphone"  >
                                </div>                               
                                <button type="submit" class="btn btn-primary btn-block font--bold ">Envoyer demande </button>   
                            </form>




                                </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
