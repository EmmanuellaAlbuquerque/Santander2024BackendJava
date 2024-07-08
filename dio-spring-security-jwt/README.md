## Insomnia Resquests Examples

````java
---------------------------------------------------
--- CREATE USER ---
POST http://localhost:8080/users

BODY: {
	"name":"GLEYSON", 
 	"username":"glysns", 
 	"password":"jwt123",
 	"roles":["USERS"]
}

Response: NO BODY 200 OK

---------------------------------------------------
--- LOGIN ---
POST http://localhost:8080/login

BODY: {
 	"username":"glysns", 
 	"password":"jwt123"
}

Response: 
{
	"login": "glysns",
	"token": "Bearer eyJhbGciOiJIUzUxMiJ9.eyJpYXQiOjE3MjAzOTc5NTYsImV4cCI6MTcyMDQwMTU1NiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSUyJdfQ.CuARvEEC0tv75WYafnNuf-Vg1Bj9IBJJrSNA3HwaxRMtr9VCj5lGMT-axcYQ8s2_66MPya07JgOZ8SNpavjAGw"
}

GET http://localhost:8080/managers
HEADERS:
Key (Authorization): Bearer eyJhbGciOiJIUzUxMiJ9.eyJpYXQiOjE3MjAzOTc5NTYsImV4cCI6MTcyMDQwMTU1NiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSUyJdfQ.CuARvEEC0tv75WYafnNuf-Vg1Bj9IBJJrSNA3HwaxRMtr9VCj5lGMT-axcYQ8s2_66MPya07JgOZ8SNpavjAGw
Response: Authorized user - 200 OK

GET http://localhost:8080/users
HEADERS:
Key (Authorization): Bearer eyJhbGciOiJIUzUxMiJ9.eyJpYXQiOjE3MjAzOTc5NTYsImV4cCI6MTcyMDQwMTU1NiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSUyJdfQ.CuARvEEC0tv75WYafnNuf-Vg1Bj9IBJJrSNA3HwaxRMtr9VCj5lGMT-axcYQ8s2_66MPya07JgOZ8SNpavjAGw
Response: NO BODY - 403 Forbidden
````

````java
POST http://localhost:8080/users
BODY: {
	"name":"DIO", 
 	"username":"dio", 
 	"password":"dio",
 	"roles":["USERS", "MANAGERS"]
}



POST http://localhost:8080/login
BODY: {
 	"username": "dio", 
 	"password": "dio"
}

Response: 
{
	"login": "dio",
	"token": "Bearer eyJhbGciOiJIUzUxMiJ9.eyJpYXQiOjE3MjAzOTgzNDAsImV4cCI6MTcyMDQwMTk0MCwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSUyIsIlJPTEVfTUFOQUdFUlMiXX0.O7DKdFMWZLg9BP016mj777VTYx-rghc9_xcS0UsEyscXTQFa_iAjnGQVUHDZrabqRLM_hsmBzmr78xlHAAeqyQ"
}

GET http://localhost:8080/users
Response: Authorized user - 200 OK

GET http://localhost:8080/managers
Response: Authorized manager - 200 OK
````
