# student-grading-demo

## Task 1
Create API to add new student in MySQL database.

__URL:__ `http://localhost:8080/student`

__Request Body__ (Use Postman to send request)
```json
{
  "rollNo": "13Bh",
  "name": "Bonny",
  "collegeName": "ABC College",
  "address": "vampire street, dairy house"
}
```
__Response__
```json
{
  "data": {
    "rollNo": "13Bh",
    "name": "Bonny",
    "collegeName": "ABC College",
    "address": "vampire street, dairy house"
  },
  "statusCode": 200
}
```



__Steps:__

 1. Add dependencies of `spring-data-jpa` and `mysql`
 2. Place mysql configuration like `host, port...` inside `application.properties`
 2. Create Student entity with properties `rollNo, name, collegName, address`
        - __roll no__ as primary key
 3. Create `StudentRespository` interface which extends `CrudRepository`
 4. Create `StudentService` and inside student service create method:
```java
public Student create(Student student) {
  //logic to save student in db
  return student
}
```
5. Use this method in `StudentController` to create new student


### Reference:

[Configure MySQL for Spring Boot](https://www.javadevjournal.com/spring-boot/spring-boot-mysql/)


__Note:__ 
1. No sql script. 
2. Exact response can be a excuse.
