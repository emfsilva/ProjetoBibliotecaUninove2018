<%-- 
    Document   : listar
    Created on : 26/04/2018, 08:16:55
    Author     : Emerson F da Silva
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Livros</title>

        <link rel="stylesheet" type="text/css" href="css/listar.css">
        <%--
        CSS interno
        --%>
        <style>
            .meio {
                width: 100vw;
                height: 100vh;
                display: flex;
                flex-direction: row;
                justify-content: center;
                align-items: center;

            }
            .boxe {
                width: auto;
                height: auto;
                background: #fff;
                border-radius:8px;
                background:#FFFFCC;
            }
            body {
                margin: 0px;
                padding: 0px;
            }
            .foto{
                width:50px;
                height:50px;
            }
            .lupa{
                width:10px;
                height:10px;

            }

            td,th{
                border: 1px solid blue; 
                border-radius: 5px;
            }

            th{
                background-color:#353535;
                color: #fff;
                border-radius:10px;
            }

            .meio{
                background-image:url(img/fundo.jpg);
                background-repeat: no-repeat;
                background-size: 100%;
            }

            .imput{
                border-radius:5px;
                text-align: center;
            }
            .p{
                width:255px;
                bottom:600px;
                position:absolute;              
                color:#FFFFCC;
                text-align: center;
                font-size: 45px;
            }
        </style>

    </head>
    <body>
        <div  class="meio">
        
	
            <p class="p"></p>

            <div class="boxe">
                <br><br>
                <center><a href="menu.html"><img class="foto" src="img/home.png"  alt="menu" title="Inicio"/></a><br>
                    <br><br><br>
                    <form action="" method="post">                       
                        <img class="lupa" src="img/lupa.png"  alt="pesquisa" title="pesquisaer"/></a> <input class="imput" type="text" name="nome" placeholder="Digite o nome do livro"/> <input class="imput" type="submit" value="Buscar"/>       
                        <br><br> 


                    </form>
                    <%
                        request.setCharacterEncoding("utf8");

                        String nome = request.getParameter("nome");

                        String URL_CONEXAO = "jdbc:mysql://localhost/uninove_biblioteca";
                        String USUARIO = "root";
                        String SENHA = "";
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conexao = DriverManager.getConnection(URL_CONEXAO, USUARIO, SENHA);
                        PreparedStatement ps = conexao.prepareStatement("select * from livro where nome like '%" + nome + "%' ");
                        ResultSet resultSet = ps.executeQuery();

                        out.print("<table>");
                        out.print("<tr><th>Editar</th><th>Excluir</th><th>ID</th><th>NOME</th><th>AUTOR</th><th>IDIOMA</th><th>EDITORA</th><th>PAIS</th><th>GENERO</th></tr>");
                        while (resultSet.next()) {
                            out.print("<tr>");
                            out.print("<td><a href='cadastrar.jsp?id="
                                    + resultSet.getString("id") + "&nome="
                                    + resultSet.getString("nome") + "&autor="
                                    + resultSet.getString("autor") + "&idioma="
                                    + resultSet.getString("idioma") + "&editora="
                                    + resultSet.getString("editora") + "&pais="
                                    + resultSet.getString("pais") + "&genero="
                                    + resultSet.getString("genero") + "'>Editar</a> </td>");

                            out.print("<td><a href='excluir.jsp?id=" + resultSet.getString("id") + "'>Excluir</a> </td>");
                            out.print("<td>" + resultSet.getString("id") + "</td>");
                            out.print("<td>" + resultSet.getString("nome") + "</td>");
                            out.print("<td>" + resultSet.getString("autor") + "</td>");
                            out.print("<td>" + resultSet.getString("idioma") + "</td>");
                            out.print("<td>" + resultSet.getString("editora") + "</td>");
                            out.print("<td>" + resultSet.getString("pais") + "</td>");
                            out.print("<td>" + resultSet.getString("genero") + "</td>");

                            out.print("</tr>");
                        }
                        out.print("</table>");
                        conexao.close();
                    %>
            </div>
        </div>

    </body>
</html>
