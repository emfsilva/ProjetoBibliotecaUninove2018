<%-- 
    Document   : excluir
    Created on : 26/04/2018, 12:38:00
    Author     : Emerson F da Silva
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="refresh" content="3;URL=listar.jsp">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Biblioteca</title>
    
    </head>
    
    <body>

        <%
        request.setCharacterEncoding("utf8");
                     
        String id = request.getParameter("id");
        String URL_CONEXAO = "jdbc:mysql://localhost/uninove_biblioteca";
        String USUARIO = "root";
        String SENHA = "";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(URL_CONEXAO, USUARIO, SENHA);
        PreparedStatement ps = conexao.prepareStatement("delete from livro where id = '" + id + "' ");
        ps.execute();       

        %>

        <span>Deletado com sucesso! Aguarde redirecionamento ...</span>        
        
        

    </body>
</html>
