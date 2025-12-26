
---
## Öğrenci Bilgisi
Mıeraıhemaıtı Alınuer
030121077

## 🧪 Gerçekleştirilen Test Senaryoları

Projede iki adet otomatik test bulunmaktadır:

### 1️⃣ GET İsteği Testi

Aşağıdaki kontroller yapılmaktadır:

- HTTP **Status Code** kontrolü  
- **Response Body** doğrulaması  
- **Response süresi** kontrolü  

### 2️⃣ JSON Gövdeli POST İsteği Testi

Aşağıdaki kontroller yapılmaktadır:

- HTTP **Status Code** kontrolü  
- **Response Body** içeriğinin doğrulanması  
- **Response süresi** kontrolü  

Her iki testte de ayrıntılı **request & response logları** konsola yazdırılmaktadır.

---

## ⏱️ Loglama ve Performans Testi

Tüm testlerde:

- İstek ve cevaplar:
  ```java
  .log().all()
komutu ile ayrıntılı şekilde loglanmaktadır.

Her isteğin yanıt süresi ölçülmekte ve aşağıdaki sınırın altında olması beklenmektedir:

MAX_RESPONSE_TIME = 3000 ms



## 🌐 Test Edilen Servis

Projede test amaçlı geliştirilen aşağıdaki servis kullanılmıştır:

https://httpbin.org
