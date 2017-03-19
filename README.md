# Requirements:
Create web services that allow all basic RESTful operations to manipulate a list of users.

# Application Structure :
## Source code located in src -> main -> java -> com -> manage:
* resources: contains Jersey RESTful Web Service classes that provides support for JAX-RS APIs.
* model: contains preliminary objects and data structure classes for the application.
* service: contains application services and the business logic classes.
* database: contains in memory data storage classes.
## Test cases are in:
* test folder

# Dependencies:
* tomcat
* maven
* jersey
* junit

# How to Build the Project from command line:
* cd {local directory}/userManager
* mvn clean install

# How to Run the Project from command line:
* make sure the build is ready
* mvn tomcat7:run
* call any of the exposed API listed in: "List of APIs exposed" section

# List of APIs exposed (postman collection: https://www.getpostman.com/collections/d711f56ad49e1bd8be61):
* listAll: http://localhost:8080/webapi/users
* getUser: http://localhost:8080/webapi/users/{userName}
* addUser: http://localhost:8080/webapi/users
* updateUser: http://localhost:8080/webapi/users/{updatedUserName}
* deleteUser: http://localhost:8080/webapi/users/{toBeDeletedUserName}







