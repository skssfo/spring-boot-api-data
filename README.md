# spring-boot-api-data
Spring boot samples with JPA
This project is a continuation of the sample project - https://github.com/skssfo/spring-boot-sample

# API
* In addition to the APIs in the first sample project referred above, the following APIs support adding courses to topics. The relationship between topic and course is OneToMany
* GET /topics/{topicId}/courses
* GET /topics/{topicId}/courses/{courseId}
* POST /topics/{topicId}/courses
* PUT /topics/{topicId}/courses/{courseId}
* DELETE /topics/{topicId}/courses/{courseId}

# Details
* There is an embedded Apache Derby DB in this project. It is used as the RDBMS. The JPA annotations in the model class dictates the mapping of the model objects to tables/columns in the DB. The org.springframework.data.repository.CrudRepository provides default methods to perform CRUD operations. Additional operations (example, to query based on the foreign key) can be defined in an interface (samples.course.CourseRepository in this case) which will be implemented by Spring framework.

# How to build
* mvn clean install - this will build the uber .jar as we have the spring boot maven plugin included in the pom.xml

# How to run
* The 'target' dir has the uber.jar file. 
* java -jar api-data-1.0-SNAPSHOT.jar - this will start the application.
