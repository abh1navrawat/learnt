DAO stands for Data Access Object.It is a core structural design pattern that isolates the application's business logic from the persistence layer (the database).

It provides a abstract interface to perform Create, Read, Update, and Delete (CRUD) operations without exposing database-specific details.



+----------------+      +---------------+      +--------------------+
| Business Layer | ---> |  DAO Interface| ---> | DAO Implementation | ---> [ Database ]
+----------------+      +---------------+      +--------------------+



Core Components of the DAO Pattern

Business Logic (Client): Request data without needing to know how or where it is stored.

DAO Interface: Defines the abstract methods (like save(), findById(), delete()) available to the client.

DAO Implementation: Contains the concrete code (SQL queries, JPA commands, or API calls) to fetch or change data.

Data Transfer Object (DTO) / Entity: The simple data carrier object returned by or passed into the DAO.




Why Use a DAO?

Technology Agnostic: You can change your database from MySQL to MongoDB by updating only the DAO implementation; your business logic remains completely untouched.

Code Reusability: All database interactions for a specific data model are centralized in one file rather than scattered across multiple services.

Easier Testing: You can easily mock the DAO interface during unit testing to test business logic without connecting to a live database.





DAO vs. Spring Data Repositories

In modern Spring development, you rarely write manual DAO implementations. Instead, developers use Spring Data Repositories (like JpaRepository).

While a DAO typically maps directly to database tables and handles low-level queries, a Repository is a higher-level abstraction that sits closer to the business logic, dealing directly with domain objects.
