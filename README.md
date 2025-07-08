# Software Architecture Guide

Modern yazılım mimarileri ve temel kavramlar hakkında kapsamlı bir özet sunmayı amaçlamaktadır. 
Yazılım mimari desenleri anlamak ve doğru mimariyi seçmek hedeflenmektedir.

---
## Proje Amacı

- Yazılım mimarilerini ve temel kavramlarını hızlıca öğrenmek isteyenler için referans oluşturmak.  
- Proje gereksinimlerine uygun mimariyi seçmeye yardımcı olmak.  
- Mimari desenler ve kavramları daha kolay kavramak için özet bilgi sunmak.

---
## Önemli Mimari Yapılar

- **Layered Architecture (Katmanlı Mimari)**  
- **Onion Architecture**  
- **Microkernel ve Plug-In Architecture**  
- **Service-Oriented Architecture (SOA)**  
- **Microservices Architecture**  
- **Domain-Driven Design (DDD)**  
- **Event-Driven Architecture**  
- **CQRS, Repository Pattern ve Diğer Tasarım Desenleri**

---

## İçindekiler

1. [Layered (n-tier) Architecture](https://github.com/mutluKodcu/software-architecture-guide/tree/main/layered-architecture-example) 
2. [Client / Onion Architecture](#2-client--onion-architecture)  
3. [Object-Oriented Architecture](#3-object-oriented-architecture)  
4. [Microkernel Architecture](#4-microkernel-architecture)  
5. [Plug-In Architecture](#5-plug-in-architecture)  
6. [Service-Oriented Architecture (SOA)](#6-service-oriented-architecture-soa)  
7. [Broker Architecture](#7-broker-architecture)  
8. [Microservices Architecture](#8-microservices-architecture)  
9. [Serverless (FaaS)](#9-serverless-faas)  
10. [Space-Based Architecture](#10-space-based-architecture)  
11. [Peer-to-Peer Architecture](#11-peer-to-peer-architecture)  
12. [Domain-Driven Design (DDD)](#12-domain-driven-design-ddd)  
13. [Event-Driven Architecture](#13-event-driven-architecture)  
14. [Publish-Subscribe Pattern](#14-publish-subscribe-pattern)  
15. [Model-View-Controller (MVC)](#15-model-view-controller-mvc)  
16. [Model-View-Presenter (MVP)](#16-model-view-presenter-mvp)  
17. [Interpreter Pattern](#17-interpreter-pattern)  
18. [Primary-Secondary (Master-Slave)](#18-primary-secondary-master-slave)  
19. [Pipeline / Pipe-Filter](#19-pipeline--pipe-filter)  
20. [Orchestration Architecture](#20-orchestration-architecture)  
21. [Leadership Pattern](#21-leadership-pattern)  
22. [CQRS (Command Query Responsibility Segregation)](#22-cqrs-command-query-responsibility-segregation)  
23. [Repository Pattern](#23-repository-pattern)  
24. [Data-Centric Architecture](#24-data-centric-architecture)  

---

### 1. Layered (n-tier) Architecture
Katmanlar halinde yapılandırılmış geleneksel mimaridir.
```
[ UI Layer ]
     ↓
[ Business Logic Layer ]
     ↓
[ Data Access Layer ]
     ↓
[ Database ]
```

### 2. Client / Onion Architecture
Bağımlılıklar merkeze doğru akar. Domain en içtedir.
```
[ Infrastructure ]
     ↓
[ Application ]
     ↓
[ Domain (Core) ]
```

### 3. Object-Oriented Architecture
Tüm sistem nesne, sınıf ve arayüzler ile modellenir.

### 4. Microkernel Architecture
Çekirdek sistem + eklentiler modeli.
```
[ Plugin ]
     ↓
[ Microkernel (Core) ]
```

### 5. Plug-In Architecture
Çekirdek yapıya işlev ekleyen bağımsız modüller.

### 6. Service-Oriented Architecture (SOA)
Servisler arası entegrasyona dayanır.
```
[ Client ] → [ Service Bus ] → [ Service A | Service B | Service C ]
```

### 7. Broker Architecture
İstemci ve sunucu arasında broker katmanı vardır.

### 8. Microservices Architecture
Bağımsız deploy edilebilir servisler.
```
[ API Gateway ]
     ↓
[ Service A ]  [ Service B ]  [ Service C ]
     ↓             ↓              ↓
[ DB A ]      [ DB B ]      [ DB C ]
```

### 9. Serverless (FaaS)
Kod sadece çağrıldığında çalışır. Örn: AWS Lambda

### 10. Space-Based Architecture
Veri ve iş yükü cluster içine dağıtılır.
```
[ Processing Unit ] ↔ [ Data Grid ] ↔ [ DB ]
```

### 11. Peer-to-Peer Architecture
Tüm node'lar eşit yetkilidir, merkezi sistem yoktur.

### 12. Domain-Driven Design (DDD)
İş alanı odaklı tasarım modeli.
```
[ UI ] → [ Application Service ] → [ Domain Model ] → [ Repository ]
```

### 13. Event-Driven Architecture
Olaylar üzerinden iletişim kurulması.
```
[ Producer ] → [ Event Bus ] → [ Consumer ]
```

### 14. Publish-Subscribe Pattern
Yayımlanan mesajlara abone olanlar erişir.

### 15. Model-View-Controller (MVC)
```
[ View ]
   ↑ ↓
[ Controller ]
   ↑ ↓
[ Model ]
```

### 16. Model-View-Presenter (MVP)
View pasiftir, tüm iş Presenter'da yapılır.

### 17. Interpreter Pattern
Kendi dili olan sistemleri yorumlar (SQL, Regex vs).

### 18. Primary-Secondary (Master-Slave)
Bir node yazarken diğerleri sadece okur.

### 19. Pipeline / Pipe-Filter
Veriler filtrelerden geçerek işlenir.
```
[ Source ] → [ Filter1 ] → [ Filter2 ] → [ Output ]
```

### 20. Orchestration Architecture
Servisleri yöneten merkezi bir orchestrator vardır.

### 21. Leadership Pattern
Cluster ortamında lider node seçimi yapar.

### 22. CQRS (Command Query Responsibility Segregation)
Okuma ve yazma yolları ayrıdır.
```
[ UI ]
  ↓
[ Command Handler ] → [ Write DB ]
[ Query Handler ] → [ Read DB ]
```

### 23. Repository Pattern
Veriye erişimi soyutlamak için kullanılır.

### 24. Data-Centric Architecture
Veri merkezi olarak konumlandırılır. Bütün yapı etrafında şekillenir.

---

## Teknolojiler

- Java 17+  
- Spring Boot 3+  
- Spring Data JPA (Hibernate)  
- PostgreSQL  
- Lombok  
- Maven 
- Docker (opsiyonel)
---

## Kurulum ve Çalıştırma

1. PostgreSQL veritabanını kurun ve aşağıdaki bilgileri güncelleyin:  
   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/mutlukodcu
   spring.datasource.username=mutlukodcu
   spring.datasource.password=mutlukodcu111
   ```
2. Git Clone:  
   ```bash
   git clone https://github.com/mutlukodcu/software-architecture-guide.git
   ```
3. Maven ile projeyi derleyin ve çalıştırın:  
   ```
   mvn clean install
   mvn spring-boot:run
   ```

---
