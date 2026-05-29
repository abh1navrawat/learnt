The Singleton pattern in Java is a creational design pattern that restricts a class to having exactly one instance per Java Virtual Machine (JVM). 

It provides a global access point to that single instance, making it ideal for managing shared resources like database connections, logging systems, or application configurations



To make a singleton class u need to follow 3 requirements-

  1) Private Constructor: Prevents other classes from instantiating the class using the new keyword.
  
  2) Private Static Variable: Holds the single instance of the class.
  
  3) Public Static Method: Commonly named getInstance(), this method returns the single instance, creating it if it doesn't already exist

## For modern applications, many developers use Spring Framework beans, which are singleton-scoped by default, removing the need for manual implementation


#### Common Implementation Methods

  1) Eager Initialization: The instance is created at class-loading time, even if it is never used.
     
         Pros: Simple, thread-safe by default.
         Cons: Can waste memory for heavyweight objects if they aren't needed.
     
  2) Lazy Initialization: The instance is created only when it is first requested via getInstance().
     
         Pros: Saves memory.
         Cons: The basic version is not thread-safe; multiple threads can accidentally create multiple instances.
  3) Thread-Safe Singleton (Synchronized Method): Adds the synchronized keyword to the getInstance() method.
     
         Pros: Thread-safe.
         Cons: Significant performance overhead because synchronization is used for every call, not just the first one.
  4) Double-Checked Locking: Reduces overhead by synchronizing only the first time the instance is created.
     
         Important: The instance variable must be declared as volatile to prevent memory reordering issues in a multi-threaded environment.
     
  5) Bill Pugh Singleton (Static Inner Class): Uses a static helper class that isn't loaded until the getInstance() method is called.
     
         Pros: Best of both worlds—it provides lazy initialization and is naturally thread-safe without the performance cost of synchronization.
     
  6) Enum Singleton: Defines a single constant within an enum.
      
         Pros: Most recommended approach for its simplicity. It handles thread safety, reflection, and serialization "breakage" automatically by JVM design.
         Cons: Does not support lazy initialization (it is eager)


      
