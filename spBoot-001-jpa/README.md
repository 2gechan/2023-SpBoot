# Spring Boot JPA 프로젝트
- java Persistence API Project
- Spring Boot 에서는 Spring Data-JPA 프로젝트가 있다.
- ORM(Object-Relation Mapping) 방식의 DB 핸들링
- 기본 CRUD는 SQL을 거의 사용하지 않고, DB의 Table 생성부터 적용할 수 있다.
- JAVA의 DTO(VO) 데이터 크랠스에 `@Entity`, `@Table`을 설정하므로써 Java 데이터클래스가 자동으로 Table을 생성하게 할 수 있다.
- 또한 각 속성변수에는 여러가지 Annotation 들을 부착하여 DB 핸들링을 할 수 있다.