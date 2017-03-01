package org.gradle.examples.web;

import static org.junit.Assert.assertTrue; 
import static org.junit.Assert.fail;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

import org.gradle.examples.web.Servlet;

public class ServletTest extends Mockito{
	@Test
    public void testServlet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        StringWriter sw = new StringWriter();
        PrintWriter writer = new PrintWriter(sw);
        writer.print("hello, world");
        
        when(response.getWriter()).thenReturn(writer);
        new Servlet().doGet(request, response);
        assertTrue(sw.toString().contains("hello, world"));
        
	}

	
}
