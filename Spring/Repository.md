In Spring Boot, a Repository is a mechanism used to encapsulate storage, retrieval, and search behavior, typically for a database. 
It acts as an abstraction layer between your application's business logic and the data source, allowing you to manage domain objects without writing complex SQL



key repo interfaces are-

CrudRepository - Provides basic Create, Read, Update, and Delete operations like save(), findById(), and delete()
PagingAndSortingRepository: Extends CrudRepository to add methods for retrieving entities using pagination and sorting
JpaRepository - A JPA-specific extension that includes all features of the above, plus batch operations (e.g., saveAllAndFlush()) and flushing the persistence context



@Repository
A specialized Stereotype Annotation that marks the class as a Data Access Object (DAO). It enables exception translation,
which converts low-level database exceptions into Spring's high-level DataAccessException.

Its primary role is to handle the logic for accessing, managing, and persisting data in a database

Repository annotation have a special behavior, it automatically catches database errors and translates them into uniform Spring data access exceptions
This happens because when a class is marked as @repository, then spring turn on the feature called Data Access Exception Translation

explaining the problem - Different database technologies throw different, technology-specific exceptions when something goes wrong.

                         For example, if a database connection fails or a unique constraint is violated:
                         Hibernate might throw a JDBCConnectionException or ConstraintViolationException.
                         JDBC might throw a raw SQLException.
                         MongoDB might throw a MongoException
  To counter this problem, Spring wraps all the db exception into its own uniform hierarchy of unchecked exceptions, stores them at DataAccessException







SO overall the main use of Repository is that we can give it request and it will convert them to sql queries and fetch us the data we wanted. ANd it have other methods like findByEmail to search directly.
In short, a Repository stops you from having to write messy database code. You just ask for data, and it appears.
