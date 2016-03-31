package com.henry.carrentweb;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.ws.rs.Path;

import freemarker.template.*;
@WebServlet("/manage")
public class HelloServlet extends HttpServlet
{
    private Configuration cfg; 
    public void init() 
{
        cfg = new Configuration();
        cfg.setServletContextForTemplateLoading(getServletContext(), "WEB-INF/templates");
    }
    
    public void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
{        
        Map root = new HashMap();
        root.put("name", "John");
        CarService carservice = new CarService();
        List list = carservice.getAllCars();
        root.put("cars", list);
        Template t = cfg.getTemplate("test.ftl");        
        response.setContentType("text/html; charset=" + t.getEncoding());
        Writer out = response.getWriter();
        try
   {
            t.process(root, out);
        } 
   catch (TemplateException e)
   {
            throw new ServletException("Error!", e);
        }
    }
}