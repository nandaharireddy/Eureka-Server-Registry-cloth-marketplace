# eureka-server

Service registry for the cloth marketplace microservices project.

Every other service (`api-gateway`, `user-service`, `catalog-service`, `cart-service`,
`order-service`, `payment-service`, `vendor-service`) registers itself here on startup,
and looks up other services here instead of using hardcoded hostnames/ports.

## Run locally

```bash
mvn spring-boot:run
```

Then open the dashboard: http://localhost:8761
You should see a list of registered instances here once other services are running.

## Run via Docker

```bash
docker build -t eureka-server .
docker run -p 8761:8761 eureka-server
```

## Why this exists (for learning)

In a monolith, one part of the code calls another part directly — same JVM, same memory.
In microservices, `order-service` needs to call `payment-service` over the network, but it
shouldn't need to know payment-service's exact IP/port (which can change, especially with
multiple instances or container restarts).

Eureka solves this: each service registers itself under a logical name (e.g. `payment-service`),
and other services ask Eureka "where is payment-service right now?" instead of hardcoding an
address. This is called **service discovery**.

## Next in the sequence

This is the first of 8 repos. Next: `api-gateway`, then `user-service`.
