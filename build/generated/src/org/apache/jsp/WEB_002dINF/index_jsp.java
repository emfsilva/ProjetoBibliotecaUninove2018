package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastro Biblioteca</title>\n");
      out.write("        <!--\n");
      out.write("        Usando CSS externo ficaria assim:\n");
      out.write("        -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/listar.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <a href=\"cadastrar.jsp\">Cadastrar</a>\n");
      out.write("        <br><br><br>\n");
      out.write("        <form action=\"\" method=\"post\">                       \n");
      out.write("            Nome:<input type=\"text\" name=\"nome\"/>       \n");
      out.write("            <br><br>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Buscar\"/>        \n");
      out.write("            <br><br>\n");
      out.write("        </form>\n");
      out.write("        ");

            request.setCharacterEncoding("utf8");

            String nome = request.getParameter("nome");

            String URL_CONEXAO = "jdbc:mysql://localhost/biblioteca";
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

                out.print("<td><a href='excluir.jsp?ra=" + resultSet.getString("ra") + "'>excluir</a> </td>");
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
        
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
