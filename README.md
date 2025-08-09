# Microservice Architecture Java

Este repositório contém uma arquitetura de microserviços Java utilizando Spring Boot, Eureka, API Gateway e serviços de domínio.

## Estrutura

- `eureka-server`: Service Discovery com Spring Cloud Eureka.
- `api-gateway-service`: API Gateway para roteamento de requisições.
- `produto-service`: Serviço de produtos.
- `ticket-service`: Serviço de tickets.

## Como rodar localmente

1. Clone o repositório:
    git clone <url-do-repo>

2. Suba os serviços:
    - Com Docker Compose (recomendado):  
      `docker-compose up --build`
    - Manualmente:  
      Inicie primeiro o `eureka-server`, depois os demais serviços.

3. Acesse:
    - Eureka Dashboard: http://localhost:8761
    - API Gateway: http://localhost:8080

## Tecnologias

- Java 17+
- Spring Boot
- Spring Cloud Eureka
- Spring Cloud Gateway
- JPA/Hibernate
- H2/PostgreSQL (ajustável)
- Docker

## Documentação das APIs

Cada serviço expõe sua documentação Swagger em `/swagger-ui.html`.

## Contribuição

1. Fork este repositório
2. Crie uma branch: `git checkout -b feature/nome-da-feature`
3. Faça commit das suas alterações
4. Abra um Pull Request

---

## Melhorias Futuras

- Adicionar autenticação JWT
- Implementar testes de integração com Testcontainers
- Adicionar monitoramento com Prometheus e Grafana
- Configuração centralizada com Spring Cloud Config
