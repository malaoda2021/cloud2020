package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author malaoda
 * @create 2022-11-25 12:19
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customTouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_rote_atguigu",r ->r.path("/guonei")
                .uri("http://news.baidu.com/guoji")).build();


        return routes.build();
    }
}
