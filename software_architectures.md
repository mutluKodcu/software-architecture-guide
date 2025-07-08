# Yazılım Mimarileri

Bu belge, modern yazılım mimari desenlerinin kapsamlı açıklamalarını içerir.

## 1. Layered (n-tier) Architecture
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

## 2. Client / Onion Architecture
Bağımlılıklar merkeze doğru akar. Domain en içtedir.
```
[ Infrastructure ]
     ↓
[ Application ]
     ↓
[ Domain (Core) ]
```

## 3. Object-Oriented Architecture
Tüm sistem nesne, sınıf ve arayüzler ile modellenir.

## 4. Microkernel Architecture
Çekirdek sistem + eklentiler modeli.
```
[ Plugin ]
     ↓
[ Microkernel (Core) ]
```

## 5. Plug-In Architecture
Çekirdek yapıya işlev ekleyen bağımsız modüller.

## 6. Service-Oriented Architecture (SOA)
Servisler arası entegrasyona dayanır.
```
[ Client ] → [ Service Bus ] → [ Service A | Service B | Service C ]
```

## 7. Broker Architecture
İstemci ve sunucu arasında broker katmanı vardır.

## 8. Microservices Architecture
Bağımsız deploy edilebilir servisler.
```
[ API Gateway ]
     ↓
[ Service A ]  [ Service B ]  [ Service C ]
     ↓             ↓              ↓
[ DB A ]      [ DB B ]      [ DB C ]
```

## 9. Serverless (FaaS)
Kod sadece çağrıldığında çalışır. Örn: AWS Lambda

## 10. Space-Based Architecture
Veri ve iş yükü cluster içine dağıtılır.
```
[ Processing Unit ] ↔ [ Data Grid ] ↔ [ DB ]
```

## 11. Peer-to-Peer Architecture
Tüm node'lar eşit yetkilidir, merkezi sistem yoktur.

## 12. Domain-Driven Design (DDD)
İş alanı odaklı tasarım modeli.
```
[ UI ] → [ Application Service ] → [ Domain Model ] → [ Repository ]
```

## 13. Event-Driven Architecture
Olaylar üzerinden iletişim kurulması.
```
[ Producer ] → [ Event Bus ] → [ Consumer ]
```

## 14. Publish-Subscribe Pattern
Yayımlanan mesajlara abone olanlar erişir.

## 15. Model-View-Controller (MVC)
```
[ View ]
   ↑ ↓
[ Controller ]
   ↑ ↓
[ Model ]
```

## 16. Model-View-Presenter (MVP)
View pasiftir, tüm iş Presenter'da yapılır.

## 17. Interpreter Pattern
Kendi dili olan sistemleri yorumlar (SQL, Regex vs).

## 18. Primary-Secondary (Master-Slave)
Bir node yazarken diğerleri sadece okur.

## 19. Pipeline / Pipe-Filter
Veriler filtrelerden geçerek işlenir.
```
[ Source ] → [ Filter1 ] → [ Filter2 ] → [ Output ]
```

## 20. Orchestration Architecture
Servisleri yöneten merkezi bir orchestrator vardır.

## 21. Leadership Pattern
Cluster ortamında lider node seçimi yapar.

## 22. CQRS (Command Query Responsibility Segregation)
Okuma ve yazma yolları ayrıdır.
```
[ UI ]
  ↓
[ Command Handler ] → [ Write DB ]
[ Query Handler ] → [ Read DB ]
```

## 23. Repository Pattern
Veriye erişimi soyutlamak için kullanılır.

## 24. Data-Centric Architecture
Veri merkezi olarak konumlandırılır. Bütün yapı etrafında şekillenir.

# PlantUML Diyagramında Kullanılan Temel Kavramlar
- **component:** Yazılım bileşeni.  
- **package:** İlgili bileşenlerin gruplandığı kapsayıcı.  
- **actor:** Sistem dışından etkileşimde bulunan kullanıcı/sistem (Client, User vb.).  
- **Oklar (-->):** Bileşenler arası bağımlılık ve iletişim yönü.  
- **Etiketler (label):** İletişim türünü açıklar.

# Genel Notlar
- Yazılım mimarileri, sürdürülebilir, genişletilebilir ve bakımı kolay yazılımlar geliştirmek için kullanılır.  
- Proje ihtiyaçlarına göre uygun mimari seçilmelidir.  
- Çoğu zaman birden fazla mimari desen bir arada kullanılabilir.