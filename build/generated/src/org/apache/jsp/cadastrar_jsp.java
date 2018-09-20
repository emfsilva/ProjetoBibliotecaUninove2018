package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastro de Livros</title>\n");
      out.write("        <style>\n");
      out.write("            .meios {\n");
      out.write("                width: 100vw;\n");
      out.write("                height: 100vh;\n");
      out.write("                background: #6C7A89;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: row;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                background-image:url(img/fundo.jpg);\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: 100%;\n");
      out.write("            }\n");
      out.write("            .boxer {\n");
      out.write("                width: 500px;\n");
      out.write("                height: 550px;\n");
      out.write("                background: #fff;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                background:#FFFFCC;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                margin: 0px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .h1 {\n");
      out.write("                background:#6C7A89;\n");
      out.write("            }\n");
      out.write("            .foto{\n");
      out.write("                width:50px;\n");
      out.write("                height:50px;\n");
      out.write("            }\n");
      out.write("            .imput{\n");
      out.write("                border-radius: 5px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .p{\n");
      out.write("                width:255px;\n");
      out.write("                bottom:650px;\n");
      out.write("                position: absolute;              \n");
      out.write("                color:#FFFFCC;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 45px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("        ");

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


        
      out.write("                       \n");
      out.write("        <div class=\"meios\">\n");
      out.write("           <p class=\"p\">BIBLIOTECA</p>\n");
      out.write("            <div class=\"boxer\">\n");
      out.write("                <br>\n");
      out.write("                <center><form action=\"salvar.jsp\" method=\"get\" >\n");
      out.write("                        Codigo<br>\n");
      out.write("                        <input  class=\"imput\" style=\"background-color: #dddddd;border:1px solid black;\" type=\"text\" name=\"id\" size=\"40\" value=\"");
      out.print(id);
      out.write("\" readonly/><br><br>\n");
      out.write("                        Nome do livro<br>\n");
      out.write("                        <input class=\"imput\" required=\"\" type=\"text\" name=\"nome\" size=\"40\" placeholder=\"Digite o nome do livro\" value=\"");
      out.print(nome);
      out.write("\"/><br><br>\n");
      out.write("                        Autor<br>\n");
      out.write("                        <input class=\"imput\" required=\"\" type=\"text\" name=\"autor\" size=\"40\" placeholder=\"Digite o nome do autor\" value=\"");
      out.print(autor);
      out.write("\"/><br><br>\n");
      out.write("                        Idioma<br>\n");
      out.write("                        <input class=\"imput\" required=\"\" type=\"text\" name=\"idioma\" size=\"40\" placeholder=\"Digite o idioma de Original\" value=\"");
      out.print(idioma);
      out.write("\"/><br><br>\n");
      out.write("                        Editora<br>\n");
      out.write("                        <input class=\"imput\" required=\"\" type=\"text\" name=\"editora\" size=\"40\" placeholder=\"Digite o nome da editora\" value=\"");
      out.print(editora);
      out.write("\"/><br><br>\n");
      out.write("                        Pais<br>\n");
      out.write("                        <input class=\"imput\" required=\"\" type=\"text\" name=\"pais\" size=\"40\" placeholder=\"Digite o pais de origem\" value=\"");
      out.print(pais);
      out.write("\"/><br><br>\n");
      out.write("\n");
      out.write("                        Genero:<br>\n");
      out.write("                        <select required =\"\" class=\"imput\" name=\"genero\" ></div>\n");
      out.write("                           <option");
      out.print(genero1);
      out.write(" value=\"Selecione a opção\" >Selecione a opção</option>\n");
      out.write("                            <option ");
      out.print(genero1);
      out.write(" value=\"Baseado em fatos reais\">Baseado em fatos reais</option>\n");
      out.write("                            <option ");
      out.print(genero2);
      out.write(" value=\"Contos\">Contos</option>\n");
      out.write("                            <option ");
      out.print(genero3);
      out.write(" value=\"Crõnica\">Crônica</option>\n");
      out.write("                            <option ");
      out.print(genero4);
      out.write(" value=\"Erótico\">Erótico</option>\n");
      out.write("                            <option ");
      out.print(genero5);
      out.write(" value=\"Fantasia\">Fantasia</option>\n");
      out.write("                            <option ");
      out.print(genero6);
      out.write(" value=\"Ficção\">Ficção</option>\n");
      out.write("                            <option ");
      out.print(genero7);
      out.write(" value=\"Poesia\">Poesia</option>\n");
      out.write("                            <option ");
      out.print(genero8);
      out.write(" value=\"Quadrinhos\">Quadrinhos</option>\n");
      out.write("                            <option ");
      out.print(genero9);
      out.write(" value=\"Romance\">Romance</option>\n");
      out.write("                            <option ");
      out.print(genero10);
      out.write(" value=\"Tragédia\">Tragédia</option>\n");
      out.write("                        </select><br><br>\n");
      out.write("                        <input class=\"imput\" type=\"submit\" value=\"Enviar\"/>                \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    </form>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"index.html\"><img class=\"foto\" src=\"img/home.png\"  alt=\"menu\" title=\"Inicio\"/></a><br>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
