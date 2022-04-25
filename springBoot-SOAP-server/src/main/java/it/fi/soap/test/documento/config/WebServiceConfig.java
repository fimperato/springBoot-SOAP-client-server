package it.fi.soap.test.documento.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.soap.addressing.server.AnnotationActionEndpointMapping;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
@ComponentScan(basePackages = "it.fi.soap.test")
public class WebServiceConfig extends WsConfigurerAdapter {

	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/*");
	}

	@Bean(name = "documentoDef")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema documentoDefSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("DocumentoDefPort");
		wsdl11Definition.setTargetNamespace("http://documento.wsdl.def.test.soap.fi.it/documentoDef");
		wsdl11Definition.setLocationUri("/ws/documento");
		wsdl11Definition.setSchema(documentoDefSchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema documentoDefSchema() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/documento/documentoSchema.xsd"));
	}

	@Bean(name="calculatorDef")
	public Wsdl11Definition wsdl11DefinitionA() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition.setWsdl(new ClassPathResource("wsdl/calculator-wsdl.asmx"));
		return wsdl11Definition;
	}

	@Bean
	public AnnotationActionEndpointMapping annotationActionEndpointMapping() {
		AnnotationActionEndpointMapping mapping = new AnnotationActionEndpointMapping();
		// add any interceptors here for features like logging
		return mapping;
	}

}
