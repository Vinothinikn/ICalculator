package com.calculator.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveConfigWebInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(LoveBeanConfig.class);
		
		DispatcherServlet servlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic servletRegister = servletContext.addServlet("myDispatcherServlet", servlet);
		servletRegister.setLoadOnStartup(1);
		servletRegister.addMapping("/");
		

	}

}
