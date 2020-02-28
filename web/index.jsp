<%-- 
    Document   : index
    Created on : 28 févr. 2020, 09:43:21
    Author     : esic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

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
        <br>
        <br>

        <!-- début formulaire de connexion -->
        <div class="container">
            <div class="row">
                <div class = "col-sm-3"></div>

                <div class="col-sm-5">
                    <div class="card">
                        <div class = "card-header cardHeaderPerso">
                            <h4 class="text-center">Bienvenue chez FantasticFour !</h4>                        
                        </div>
                        <div class="card-body">
                            <div >
                                <form action="login" method="POST">
                                    <div class="form-group" >
                                        <input type="text" name="username" class="form-control" value="${param["username"]}" placeholder="username">
                                    </div>
                                    <div class="form-group" >
                                        <input type="password" name="mdp" class="form-control" placeholder="password">
                                    </div>
                                    <button type="submit" class="btn  btn-block ">connexion</button>
                                    <hr>
                                    <button type ="button" class = "btn btn-black   btn-block " onclick="location.href = 'DemandeCreation'" > Vous n'avez pas encore de compte ? </button>

                                </form>

                                <p class = "pmsgr">
                                    ${msg}

                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


        </div>
    </body>
</html>
