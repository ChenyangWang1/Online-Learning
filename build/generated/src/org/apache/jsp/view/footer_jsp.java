package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("           /**********************************************************   页脚   ***********************************************************/\n");
      out.write("        .footer {\n");
      out.write("            position: relative;\n");
      out.write("            margin-top: 0px;\n");
      out.write("            background-image: linear-gradient(200deg,#9fbaa8, #31354c);\n");
      out.write("            height: 430px;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a {\n");
      out.write("            color: antiquewhite;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #logo1 {\n");
      out.write("            border-radius: 50px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #title {\n");
      out.write("            color: aliceblue;\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-family: initial;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #ad {\n");
      out.write("            color: aliceblue;\n");
      out.write("            font-size: 15px;\n");
      out.write("            font-family: initial;\n");
      out.write("            margin-left: 56px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #as {\n");
      out.write("            color: aliceblue;\n");
      out.write("            font-size: 15px;\n");
      out.write("            font-family: initial;\n");
      out.write("            margin-left: 56px;\n");
      out.write("            float: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("             </**********************************************************   页脚   ******************************8*****************************/>\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <center>\n");
      out.write("            <a href=\"\" style=\"font-size:30px;color:whitesmoke\">R Q E</a> &emsp;&emsp;\n");
      out.write("        </center>\n");
      out.write("        <hr>\n");
      out.write("        <a style=\"margin-left:40px;font-size: 20px;color:black;\" id=\"qiu\">About Us</a> &emsp;&emsp;\n");
      out.write("        <a style=\"margin-left:80px;font-size: 20px;color:black\" id=\"qiu\">Fast Access</a> &emsp;&emsp;\n");
      out.write("        <a style=\"margin-left:120px;font-size: 20px;color:black\" id=\"qiu\">Other Products</a> &emsp;&emsp;\n");
      out.write("        <a style=\"margin-left:450px;font-size: 25px;color:black;\" id=\"qiu\">Social Media</a>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <a href=\"\" style=\"margin-left: 20px;color:gainsboro;\">Product Introduction</a>&emsp;\n");
      out.write("        <a href=\"\" style=\"margin-left: 55px;color:gainsboro;\">HomePage</a>&emsp;\n");
      out.write("        <a href=\"\" style=\"margin-left: 170px;color:gainsboro;\">Download APP</a>&emsp;\n");
      out.write("        <a href=\"\" style=\"margin-left:300px\"><img src=\"http://localhost:8084/Project/Icon/QQ.png\" height=\"40\" width=\"40\" id=\"logo1\"></a> &emsp;\n");
      out.write("        <a href=\"\"><img src=\"http://localhost:8084/Project/Icon/WeChat.png\" height=\"40\" width=\"40\" id=\"logo1\"></a>&emsp;\n");
      out.write("        <a href=\"\"><img src=\"http://localhost:8084/Project/Icon/Facebook.png\" height=\"40\" width=\"40\" id=\"logo1\"></a>&emsp;\n");
      out.write("        <a href=\"\"><img src=\"http://localhost:8084/Project/Icon/WangYi.png\" height=\"40\" width=\"40\" id=\"logo1\"></a>&emsp;\n");
      out.write("        <a href=\"\"><img src=\"http://localhost:8084/Project/Icon/Twitter.png\" height=\"40\" width=\"40\" id=\"logo1\"></a>&emsp;\n");
      out.write("        <a href=\"\"><img src=\"http://localhost:8084/Project/Icon/Internet.png\" height=\"40\" width=\"40\" id=\"logo1\"></a>&emsp;\n");
      out.write("        <br>\n");
      out.write("        <a href=\"\" style=\"margin-left: 20px;color:gainsboro;\">Service Agreement</a>&emsp;\n");
      out.write("        <a href=\"\" style=\"margin-left: 68px;color:gainsboro;\">BestSell Courses</a>&emsp;\n");
      out.write("        <a href=\"\" style=\"margin-left: 130px;color:gainsboro;\">Wechat Applet</a>&emsp;\n");
      out.write("        <br>\n");
      out.write("        <a href=\"\" style=\"margin-left: 20px;color:gainsboro;\">Privacy Clause</a>&emsp;\n");
      out.write("        <br>\n");
      out.write("        <a style=\"margin-left:1130px\"><img src=\"http://localhost:8084/Project/Icon/logo.jpg\" style=\"border-radius: 0px;\" height=\"80\" width=\"180\"></a>\n");
      out.write("        <p id=\"ad\">Our RQE (Rui Qi Education) college provides online learning and consultation channels for students 24\n");
      out.write("            hours a day </p>\n");
      out.write("        <img src=\"http://localhost:8084/Project/Icon/Phonenumber.jpg\" height=\"20\" width=\"20\" id=\"as\">\n");
      out.write("        <a id=\"as\">(520)371-0044</a>&emsp;\n");
      out.write("        <img src=\"http://localhost:8084/Project/Icon/Email.jpg\" height=\"20\" width=\"20\" id=\"as\">\n");
      out.write("        <a id=\"as\"> 954931689@qq.com</a> &emsp;\n");
      out.write("        <img src=\"http://localhost:8084/Project/Icon/Adress.jpg\" height=\"20\" width=\"20\" id=\"as\">\n");
      out.write("        <a id=\"as\">Xi Xia District of Yinchuan, Ningxia, China</a>&emsp;<br>\n");
      out.write("        <hr>\n");
      out.write("        <p id=\"ad\" style=\"margin-left:500px\"> Online Learning System （RQE） &copy Copyright 2020</p>\n");
      out.write("      </div>\n");
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
