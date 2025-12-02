# Accessing Data in Pivotal GemFire with REST

Este projeto demonstra como criar uma aplicação **Spring Boot** que acessa dados armazenados no **Apache Geode (Pivotal GemFire)** através de uma interface **RESTful baseada em Hypermedia (HATEOAS)** usando **Spring Data REST**.

---

## 🚀 O que você vai construir
- Uma aplicação web em Spring que permite **criar e recuperar objetos `Pessoa`**.
- Os objetos são armazenados em um **In-Memory Data Grid (IMDG)** do Apache Geode.
- A API REST é exposta automaticamente pelo **Spring Data REST**, sem necessidade de escrever controladores.

---

## 🛠️ Tecnologias utilizadas
- **Spring Boot**
- **Spring Data REST**
- **Spring Data for Apache Geode**
- **Apache Geode / Pivotal GemFire**
- **Spring HATEOAS**

---

## 📦 Estrutura básica

### Entidade `Pessoa`
```java
@Entity
public class Pessoa {
    @Id @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
}
