##Spring Boot Book Seller

## Endpoints

### Sign-up
```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
{
    "name": "ken1",
    "username": "kem1",
    "password": "pas1"
}
```

### Sign-in
```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 55

{
    "username": "ken1",
    "password": "ken1"
}
```

#### Make-admin
```
PUT /api/intenal/make-admin HTTP/1.1
Host: localhost:8080
Authorization: Berear InternalApiKey1234!
```

#### Save Book
```
POST /api/book HTTP/1.1
Host: localhost:8080
Authorization: Bearer ... admin
Content-Type: application/json
Content-Length: 114

{
    "title": "secondBookTherer",
    "price": 200,
    "description": "the 2nd book",
    "author": "ken"
}
```

#### Delete Book
```
DELETE /api/book/3 HTTP/1.1
Host: localhost:8080
Authorization: Bearer ... admin
```

#### Get all Books
```
GET /api/book HTTP/1.1
Host: localhost:8080
```

#### Save Purchase
```
POST /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ... user / admin
Content-Type: application/json
Content-Length: 58

{
    "userId": 3,
    "bookId": 1,
    "price": 100
}
```

#### Get User Purchases
```
GET /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ... user / admin
```