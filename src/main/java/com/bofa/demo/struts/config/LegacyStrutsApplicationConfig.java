package com.bofa.demo.struts.config;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import javax.servlet.Filter;
import javax.servlet.DispatcherType;
import java.util.Collections;

@Configuration
public class LegacyStrutsApplicationConfig implements WebMvcConfigurer{

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

/*
    @Bean
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/struts/**")
                .addResourceLocations(STRUTS_RESOURCE_LOCATIONS);
    }
*/

/*
    @Bean
    public FilterRegistrationBean<StrutsPrepareAndExecuteFilter> filterRegistrationBean() {
        FilterRegistrationBean<StrutsPrepareAndExecuteFilter> bean = new FilterRegistrationBean<>();
        StrutsPrepareAndExecuteFilter struts = new StrutsPrepareAndExecuteFilter();
        bean.setFilter(struts);
        bean.setUrlPatterns(Arrays.asList("/*"));
        bean.setName("StrutsPrepareAndExecuteFilter");
        bean.setOrder(1);
        //bean.setInitParameters(Collections.singletonMap("actionPackages", "com.bofa.demo.struts.action"));
        bean.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.FORWARD);
        return bean;
    }*/

 /*   //@Bean
    public FilterRegistrationBean<Filter> filterRegistration() {
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new StrutsPrepareAndExecuteFilter());
        bean.addUrlPatterns("/*");
        bean.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.FORWARD);
        bean.setName("StrutsPrepareAndExecuteFilter");
       // bean.setInitParameters(Collections.singletonMap("actionPackages", "com.bofa.demo.struts.action"));
       // bean.setInitParameters(Collections.singletonMap("struts.convention.action.packages", "com.bofa.demo.struts.action"));
        System.out.println("************************* REGISTRATION **************");
        return bean;
    }*/

/*    @Bean
    public FilterRegistrationBean someFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
       // registration.setFilter(new StrutsPrepareAndExecuteFilter());
        registration.addUrlPatterns("*.action");
        registration.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.FORWARD);
        registration.setName("StrutsPrepareAndExecuteFilter");
        return registration;
    }*/

/*    @Bean
    public FilterRegistrationBean<Filter> filterRegistration() {
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new StrutsPrepareAndExecuteFilter());
        bean.addUrlPatterns("*.html");
//        bean.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.FORWARD);
        bean.setName("StrutsPrepareAndExecuteFilter");
        return bean;
    }*/

/*    @Bean
    public FilterRegistrationBean<Filter> filterRegistrationBean() {
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<Filter>();
        StrutsPrepareAndExecuteFilter struts = new StrutsPrepareAndExecuteFilter();
        registrationBean.setFilter(struts);
        registrationBean.setUrlPatterns(Arrays.asList("/*", "*.action"));
        registrationBean.setName("StrutsPrepareAndExecuteFilter");
        registrationBean.setOrder(1);
        registrationBean.setInitParameters(Collections.singletonMap("actionPackages", "com.bofa.demo.struts.action"));
        registrationBean.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.FORWARD);

        return registrationBean;
    }*/
}