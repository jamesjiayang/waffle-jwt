james@DESKTOP-C1FBLIL:~$ curl -i -H "Content-Type: application/json" -X POST -d '{"username": "user1","password": "2113"}' http://localhost:8080/login
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJERVNLVE9QLUMxRkJMSUxcXHVzZXIxIiwiZXhwIjoxNTg1Njg4Mjg0fQ.PeJ13tGIGFgCCi6EVKHOh-hc6-rQs51OyW_dgIwIcWkdqQ-yuS76D3GcCZuCRi-kCFz4A1sExnUPEXj2QrzFIQ
X-Content-Type-Options: nosniff
X-XSS-Protection: 1; mode=block
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 0
Date: Sat, 21 Mar 2020 20:58:05 GMT

james@DESKTOP-C1FBLIL:~$ curl -H "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJERVNLVE9QLUMxRkJMSUxcXHVzZXIxIiwiZXhwIjoxNTg1Njg4Mjg0fQ.PeJ13tGIGFgCCi6EVKHOh-hc6-rQs51OyW_dgIwIcWkdqQ-yuS76D3GcCZuCRi-kCFz4A1sExnUPEXj2QrzFIQ" http://localhost:8080/greeting
Greetings from Spring Boot!

james@DESKTOP-C1FBLIL:~$ curl http://localhost:8080/greeting
{"timestamp":"2020-03-21T21:04:05.275+0000","status":403,"error":"Forbidden","message":"Access Denied","path":"/greeting"}
