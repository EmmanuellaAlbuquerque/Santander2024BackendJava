## DIO Spring Security

### Basic Auth > 
````shell
GET http://localhost:8080/users
username: user
password: user123
Result: 200 OK
Body: Authorized user

GET http://localhost:8080/managers
username: user
password: user123
Result: 403 Forbidden
Body: {
	"timestamp": "2024-07-07T21:19:50.885+00:00",
	"status": 403,
	"error": "Forbidden",
	"path": "/managers"
}

GET http://localhost:8080/managers
username: admin
password: master123
Result: 200 OK
Body: Authorized manager
````
