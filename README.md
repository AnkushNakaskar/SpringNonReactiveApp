# SpringNonReactiveApp
# SpringReactiveApp
`This project explain about how spring webflux work and how it better than normal blocking spring mvc.`
`This project is used in SpringReactiveApp `
* Spring WebFlux in detail
    * There is one API in current project as "http://localhost:9099/sleep/100"
    * In this API you can see the sleep for time. Also you can see the tomcat threads per request not getting more than 200
    * If you monitor the logs of API,You can see the thread count per request not getting more than 200 which is default for tomcat thread for blocking project.
        * In case of normal non reactive API,We have maximum 200 tomcat thread per request.
        
    * If you jemter file from and run SpringReactiveApp and see the result,Every request is getting successfull.
        * Spring reactive APP, handle load on the basis of (You can see the benefit in logs as thread are limited and see the thread incovation)
            * The key expected benefit of reactive and non-blocking is the ability to scale with a small, fixed number of threads and less memory
            * More info : https://docs.spring.io/spring/docs/current/spring-framework-reference/web-reactive.html#webflux-config
                * https://howtodoinjava.com/spring-webflux/spring-webflux-tutorial/
            
        * You can configure the  default the number of thread (Event loop thread),Default to number of processor.
        
