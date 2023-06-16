package com.bofa.demo.struts.config;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import java.util.Collections;

@Configuration
public class LegacyStrutsApplicationConfig implements WebMvcConfigurer {

    private static final String[] STRUTS_RESOURCE_LOCATIONS = {"classpath:/template/"};

    @Bean
    public FilterRegistrationBean<Filter> filterRegistration() {
        System.out.println("   ***** About to register StrutsPrepareAndExecuteFilter ...");
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new StrutsPrepareAndExecuteFilter());
        registration.addUrlPatterns("*.html");
        registration.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.FORWARD);
        registration.setInitParameters(Collections.singletonMap("actionPackages", "com.bofa.demo.struts.action"));
        registration.setInitParameters(Collections.singletonMap("devMode", "true"));
        registration.setName("LegacyStrutsApplicationRegistration");
        System.out.println("   ***** StrutsPrepareAndExecuteFilter registration completed!");
        return registration;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/struts/**")
                .addResourceLocations(STRUTS_RESOURCE_LOCATIONS);
    }
}