<%-- 
    Document   : cadastrar
    Created on : 25/04/2018, 17:47:56
    Author     : Emerson F Silva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Livros</title>
        <style>
            .meios {
                width: 100vw;
                height: 100vh;
                background: #6C7A89;
                display: flex;
                flex-direction: row;
                justify-content: center;
                align-items: center;
                background-image:url(img/fundo.jpg);
                background-repeat: no-repeat;
                background-size: 100%;
            }
            .boxer {
                width: 500px;
                height: 550px;
                background: #fff;
                border-radius: 8px;
                background:#FFFFCC;
            }
            body {
                margin: 0px;

            }
            .h1 {
                background:#6C7A89;
            }
            .foto{
                width:50px;
                height:50px;
            }
            .imput{
                border-radius: 5px;
                text-align: center;
            }
            .p{
                width:255px;
                bottom:650px;
                position: absolute;              
                color:#FFFFCC;
                text-align: center;
                font-size: 45px;
            }

        </style>
    </head>
    <body>        
        <%
            request.setCharacterEncoding("utf8");
            String id = request.getParameter("id") == null ? "" : request.getParameter("id");
            String nome = request.getParameter("nome") == null ? "" : request.getParameter("nome");
            String autor = request.getParameter("autor") == null ? "" : request.getParameter("autor");
            String idioma = request.getParameter("idioma") == null ? "" : request.getParameter("idioma");
            String editora = request.getParameter("editora") == null ? "" : request.getParameter("editora");
            String pais = request.getParameter("pais") == null ? "" : request.getParameter("pais");

            String genero = request.getParameter("genero") == null ? "" : request.getParameter("genero");
            String genero1 = (genero.equals("Baseado em fatos reis") ? "selected" : "");
            String genero2 = (genero.equals("Contos") ? "selected" : "");
            String genero3 = (genero.equals("Crônica") ? "selected" : "");
            String genero4 = (genero.equals("Erótico") ? "selected" : "");
            String genero5 = (genero.equals("Fantasia") ? "selected" : "");
            String genero6 = (genero.equals("Ficção Cientifica") ? "selected" : "");
            String genero7 = (genero.equals("Poesia") ? "selected" : "");
            String genero8 = (genero.equals("Quadrinhos") ? "selected" : "");
            String genero9 = (genero.equals("Romance") ? "selected" : "");
            String genero10 = (genero.equals("Tragédia") ? "selected" : "");


        %>                       
        <div class="meios">
           <p class="p"></p>
            <div class="boxer">
                <br>
                <center><form action="salvar.jsp" method="get" >
                        Codigo<br>
                        <input  class="imput" style="background-color: #dddddd;border:1px solid black;" type="text" name="id" size="40" value="<%=id%>" readonly/><br><br>
                        Nome do livro<br>
                        <input class="imput" required="" type="text" name="nome" size="40" placeholder="Digite o nome do livro" value="<%=nome%>"/><br><br>
                        Autor<br>
                        <input class="imput" required="" type="text" name="autor" size="40" placeholder="Digite o nome do autor" value="<%=autor%>"/><br><br>
                        Idioma<br>
                        <input class="imput" required="" type="text" name="idioma" size="40" placeholder="Digite o idioma de Original" value="<%=idioma%>"/><br><br>
                        Editora<br>
                        <input class="imput" required="" type="text" name="editora" size="40" placeholder="Digite o nome da editora" value="<%=editora%>"/><br><br>
                        Pais<br>
                        <input class="imput" required="" type="text" name="pais" size="40" placeholder="Digite o pais de origem" value="<%=pais%>"/><br><br>

                        Genero:<br>
                        <select required ="" class="imput" name="genero" ></div>
                           <option<%=genero1%> value="Selecione a opção" >Selecione a opção</option>
                            <option <%=genero1%> value="Baseado em fatos reais">Baseado em fatos reais</option>
                            <option <%=genero2%> value="Contos">Contos</option>
                            <option <%=genero3%> value="Crõnica">Crônica</option>
                            <option <%=genero4%> value="Erótico">Erótico</option>
                            <option <%=genero5%> value="Fantasia">Fantasia</option>
                            <option <%=genero6%> value="Ficção">Ficção</option>
                            <option <%=genero7%> value="Poesia">Poesia</option>
                            <option <%=genero8%> value="Quadrinhos">Quadrinhos</option>
                            <option <%=genero9%> value="Romance">Romance</option>
                            <option <%=genero10%> value="Tragédia">Tragédia</option>
                        </select><br><br>
                        <input class="imput" type="submit" value="Enviar"/>                
                    
                    
                    </form>
                    <br>
                    <a href="menu.html"><img class="foto" src="img/home.png"  alt="menu" title="Inicio"/></a><br>
                </center>
            </div>
        </div>
    </body>
</html>
