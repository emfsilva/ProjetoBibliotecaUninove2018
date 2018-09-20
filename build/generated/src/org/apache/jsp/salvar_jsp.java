package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class salvar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            request.setCharacterEncoding("utf8");

            String URL_CONEXAO = "jdbc:mysql://localhost/biblioteca";
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

            if (id != null) {
                ps = conexao.prepareStatement("update livro set nome=?, autor=?, idioma=?, editora=? pais=? genero=? where id=?");
                ps.setString(1, nome);
                ps.setString(2, autor);
                ps.setString(3, idioma);
                ps.setString(4, editora);
                ps.setString(5, pais);
                ps.setString(6, genero);
                ps.setInt(7, id);
                ps.executeUpdate();
            } else {
                ps = conexao.prepareStatement("insert into livro (nome, idioma, editora, pais, genero) values (?,?,?,?,?,?)");
                ps.setString(1, nome);
                ps.setString(2, autor);
                ps.setString(3, idioma);
                ps.setString(4, editora);
                ps.setString(5, pais);
                ps.setString(6, genero);
                ps.executeUpdate();
            }
        
      out.write("    \n");
      out.write("        Cadastrado com sucesso!\n");
      out.write("        <a href=\"listar.jsp\">Voltar a tela de listagem</a>\n");
      out.write("\n");
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
