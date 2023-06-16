package com.bofa.demo.struts;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		System.out.println("   ***** ServletInitializer called...");
		return builder.sources(LegacyStrutsSpringBootApplication.class);
	}
}
