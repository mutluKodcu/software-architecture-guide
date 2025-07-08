# Software Architecture Guide

Modern yazılım mimarileri ve temel kavramlar hakkında kapsamlı bir özet sunmayı amaçlamaktadır. 
Yazılım mimari desenleri anlamak ve doğru mimariyi seçmek hedeflenmektedir.

---

## İçindekiler

1. [Layered (n-tier) Architecture](#1-layered-n-tier-architecture)  
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

## Proje Amacı

- Yazılım mimarilerini ve temel kavramlarını hızlıca öğrenmek isteyenler için referans oluşturmak.  
- Proje gereksinimlerine uygun mimariyi seçmeye yardımcı olmak.  
- Mimari desenler ve kavramları daha kolay kavramak için özet bilgi sunmak.

---

## Kullanım

Bu dosyayı okuyarak veya kendi projelerinizde referans alarak yazılım mimarisi seçimi ve tasarımı yapabilirsiniz.  

---

