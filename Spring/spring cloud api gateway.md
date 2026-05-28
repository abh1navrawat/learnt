needed for - microservices
use - work as a unified entry point for all the  API requests 


-----------------------features----------------------------------- 

Dynamic Routing: Forwards requests to the correct microservice.

Security & Authentication: Support for OAuth2, JWT, and role-based access

Rate limiting and monitoring: Prevents abuse of APIs and allows for logging.

Resilience features: Integration with circuit breakers such as Resilience4J


----------------------Spring Cloud Gateway Building Blocks------------------

The Spring Cloud Gateway depends on the three principal building blocks that increase the effectiveness with which requests are routed, processed, and filtered within the microservices architecture.
Such building blocks allow your API Gateway to scale and extend and to gain additional layers of security.


Routes - The directive to connect incoming requests with a downstream service in Spring Cloud Routing.
         Routes take the request to the actual microservice through the criteria specified.         (tells the url )
         A route comprises a destination URL, a predicate to apply as a condition, and some filters that make request modifications.


Predicate - A predicate is a condition that will check incoming requests against a rule of routing, allowing URL filters, request headers, query parameters, and much more.
            Predicates help determine which route will be picked to run for a given request.   (Works like an if statement)


Filters - Filters are used to modify request-and-response messages before leaving the Gateway. 
          There are 2 types of filters (pre-filters and post-filters)

          Pre-filters execute before a request is sent to the backend service (an example is doing authentication).
          Post-filters happen after a response is returned from a backend service (an example is logging or response modification).





Example - 

spring:
  application:
    name: api-gateway

#api-gateway config
  cloud:
    gateway:

      routes:
        - id: order-service
          uri: lb://ORDER-SERVICE

          predicates:
            - Path=/api/v1/orders/**

          filters:
            - StripPrefix=2
            - RedirectTo=302, http://codingshuttle.com

        - id: inventory-service
          uri: lb://INVENTORY-SERVICE

          predicates:
            - Path=/api/v1/inventory/**

          filters:
            - StripPrefix=2
            - AddRequestHeader=X-Custom-Header, ABCD

#eureka client config
eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka
  instance:
    prefer-ip-address: true

