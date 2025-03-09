Run projet: **./gradlew bootRun**

```
springboot-test
├─ gradle
│  └─ wrapper
│     ├─ gradle-wrapper.jar
│     └─ gradle-wrapper.properties
├─ gradlew
├─ gradlew.bat
└─ src
   ├─ main
   │  ├─ java
   │  │  └─ com
   │  │     └─ gravis
   │  │        └─ springboot_test
   │  │           ├─ SpringbootTestApplication.java
   │  │           ├─ controller
   │  │           │  └─ UserController.java
   │  │           ├─ dto
   │  │           │  ├─ BaseUserDTO.java
   │  │           │  ├─ UserCreationDTO.java
   │  │           │  └─ UserDTO.java
   │  │           ├─ exception
   │  │           │  ├─ GlobalExceptionHandler.java
   │  │           │  └─ ResourceNotFoundException.java
   │  │           ├─ model
   │  │           │  └─ User.java
   │  │           ├─ repository
   │  │           │  └─ UserRepository.java
   │  │           ├─ service
   │  │           │  ├─ UserService.java
   │  │           │  └─ UserServiceImpl.java
   │  │           └─ util
   │  │              └─ UserMapper.java
   │  └─ resources
   │     ├─ application.properties
   │     ├─ static
   │     └─ templates
   └─ test
      └─ java
         └─ com
            └─ test
               └─ springboot_test
                  └─ SpringbootTestApplicationTests.java

```