<%-- 
    Document   : messagerie
    Created on : 28 févr. 2020, 11:31:57
    Author     : esic
--%>

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
            <h5 >Envoyez un message à votre conseiller </h5> 
            <br>
            <hr>

            <form action="EnvoiMessageClient" method="POST" class="">
                <div  class="form-group" >
                    <textarea required ="" type="text" name="textemessage" id ="textmessage" class="form-control "  placeholder="Tapez ici votre message"></textarea>
                </div>
                <button type="button" class="btn btn-primary btn-block font--bold " data-toggle="modal" data-target="#exampleModalCenter">envoyer</button>   
            </form>           
        </div>

        <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLongTitle">Etes vous sur de ce message ? </h5>
                       
                         
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div>
                        test
                    </div>
                    
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Annuler</button>
                        <button type="button" class="btn btn-primary">Valider</button>
                    </div>
                </div>
            </div>
        </div>




    </body>
</html>
