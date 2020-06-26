package com.my.poc.springremotinghttpinvokerconsumer;

import com.my.poc.httpinvokerclient.HelloWorldInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@Configuration
public class BeanConfig {

    @Value("${httpinvoker-service-remoting-url}")
    private String httpInvokerServiceRemotingUrl;

    @Bean
    public HttpInvokerProxyFactoryBean httpInvokerProxyFactoryBean() {
        HttpInvokerProxyFactoryBean proxy = new HttpInvokerProxyFactoryBean();
        proxy.setServiceInterface(HelloWorldInterface.class);
        proxy.setServiceUrl(httpInvokerServiceRemotingUrl);
        proxy.afterPropertiesSet();
        return proxy;
    }
}
