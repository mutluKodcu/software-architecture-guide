# Software Architecture Guide

Bu proje, modern yazılım mimarilerini ve tasarım desenlerini örnek uygulamalarla birlikte içeren kapsamlı bir rehberdir.

---

## İçerik

- **Layered Architecture (Katmanlı Mimari)**  
- **Onion Architecture**  
- **Microkernel ve Plug-In Architecture**  
- **Service-Oriented Architecture (SOA)**  
- **Microservices Architecture**  
- **Domain-Driven Design (DDD)**  
- **Event-Driven Architecture**  
- **CQRS, Repository Pattern ve Diğer Tasarım Desenleri**

---

## Örnek Uygulamalar

- Spring Boot kullanılarak hazırlanmış,  
- PostgreSQL veritabanı ile entegre,  
- Spring Data JPA ile veri erişimi,  
- Çoklu telefon tipi (EnumSet) ve e-posta destekli kullanıcı yönetimi,  
- REST API katmanı içeren,  
- Katmanlı mimari prensiplerine uygun projeler.

---

## Teknolojiler

- Java 17+  
- Spring Boot 3+  
- Spring Data JPA (Hibernate)  
- PostgreSQL  
- Lombok  
- Maven veya Gradle  
- Docker (opsiyonel)

---

## Kurulum ve Çalıştırma

1. PostgreSQL veritabanını kurun ve aşağıdaki bilgileri güncelleyin:  
   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/uyg4
   spring.datasource.username=dmtbkts
   spring.datasource.password=dmt111
   ```
2. Projeyi klonlayın:  
   ```bash
   git clone https://github.com/kullaniciadi/software-architecture-guide.git
   ```
3. Maven ile projeyi derleyin ve çalıştırın:  
   ```
   mvn clean install
   mvn spring-boot:run
   ```

---