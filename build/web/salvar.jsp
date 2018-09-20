<%-- 
    Document   : salvar
    Created on : 26/04/2018, 08:28:40
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
        <meta http-equiv="refresh" content="3;URL=cadastrar.jsp">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("utf8");

            String URL_CONEXAO = "jdbc:mysql://localhost/uninove_biblioteca";
            String USUARIO = "root";
            String SENHA = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL_CONEXAO, USUARIO, SENHA);
            PreparedStatement ps = null;

            Integer id = null;
            if (request.getParameter("id") != null && !request.getParameter("id").equals("")) {
                id = Integer.valueOf(request.getParameter("id"));
            }
            String nome = request.getParameter("nome");
            String autor = request.getParameter("autor");
            String idioma = request.getParameter("idioma");
            String editora = request.getParameter("editora");
            String pais = request.getParameter("pais");
            String genero = request.getParameter("genero");

            if (id  != null) {
                ps = conexao.prepareStatement("update livro set nome=?,autor=?, idioma=?, editora=?,pais=?,genero=? where id=?");
                ps.setString(1, nome);
                ps.setString(2, autor);
                ps.setString(3, idioma);
                ps.setString(4, editora);
                ps.setString(5, pais);
                ps.setString(6, genero);
                ps.setInt(7, id);
                ps.executeUpdate();
            } else {
                ps = conexao.prepareStatement("insert into livro (nome,autor, idioma, editora, pais, genero) values (?,?,?,?,?,?)");
                ps.setString(1, nome);
                ps.setString(2, autor);
                ps.setString(3, idioma);
                ps.setString(4, editora);
                ps.setString(5, pais);
                ps.setString(6, genero);
                ps.executeUpdate();
            }
        %>    
        <span> Cadastrado com sucesso! Aguarde o redirecionamento ...</span>
        

    </body>
</html>
