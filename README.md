1. Integration testing is a type of testing to check if different pieces of the Code are working together in an intergarated enviroment and may also depend on external systems like database
   While Unit testing is the type of testing which checks a small piece of code independent of other code

   Exampe of Integrated testing 
  https://github.com/mozzy11/openmrs-module-webservices.rest/blob/021d468e75608f927109ab5d0992f5a1c1081c38/omod-1.12/src/test/java/org/openmrs/module/webservices/rest/web/v1_0/controller/openmrs1_12/OrderGroupController1_12Test.java#L34-L99


  2. Checked Exceptions are Exceptions Checked at Compile time , while Unchecked Exceptions are checked at Run time

  see  https://github.com/mozzy11/Test_Solution/blob/master/Exceptions/src/ExceptionsMain.java

  3. Databse replication is a technology for copying and distributing data and database objects from one database to another and then synchronizing between databases to maintain consistency and integrity of the data. 

  The way it differs from Sync2 is the While Database replication is done at the databse level , Sync2 is done at the class objects level 

  4. simple Aguler MVC  here https://github.com/mozzy11/Test_Solution/tree/master/Angular_MVC

  More Here  
  https://github.com/openmrs/openmrs-module-coreapps/commit/618262caad2cebff1ff8cc1773065f96740f468b

  5. ###  Benefits of Using Spring.

        *  Inversion Of Control (IOC)
        *  Aspect Oriented Programming (AOP)
        * Transaction Management
        *  Easy integration other frameworks
        *  Modularity

        Spring modules include Spring core, beans, context, expression language, AOP, Aspects, Instrumentation, JDBC, ORM, OXM, JMS, Transaction, Web, Servlet, Strut

6. Wrote a simple java apllication to do the basic functionality
   https://github.com/mozzy11/Test_Solution/tree/master/Employee_Mgt/src


7. Dependency injection is a pattern to allow your application to inject objects on the fly to classes that need them, without forcing those classes to be responsible for those objects. It allows your code to be more loosely coupled. 
 see  https://github.com/mozzy11/Test_Solution/tree/master/Dependence_Injection/src

8. AOP  see   https://github.com/mozzy11/Test_Solution/tree/master/AOP/src

9.  ### Advantages of Hibernate 

* It removes a lot of repetitive code from the JDBC API, and therefore, the code is easier to read, write, and support.

* Hibernate Query Language (HQL) is fully object-oriented and more close to the Java programming language comparing to SQL in JDBC. Also, HQL is a Database-independent query that allows you to switch between different databases easily.

* Hibernate supports caching, which improves performance.

* Lazy load that also improves performance.

* Hibernate supports JPA annotations, which means the code is portable to other ORM frameworks.
Hibernate has a connection pool.

* You do not need to handle exceptions.Hibernate allows database management (for example creating tables), JDBC can only work with existing DB tables.

* Hibernate supports inheritance, associations, and collections that are not available in the JDBC API.
 see https://github.com/mozzy11/Test_Solution/tree/master/Hibernate/src


10. 
###  Developed a module
https://github.com/mozzy11/Test_Solution/tree/master/OpenMRS_Module/patientdata

it can do the following , 
* Capture data through a Form called *patientVitalsTest* 
* Create A simpleListing Report called *Patient Vital Report*
* Create an Indicator Report called *Indicator Report*
* Return A list Of patients above 15 years both on a gsp and gsp. Acces the links on the Admin Page under the module Title
* Created a Resource *item* , you can acces it from the Rest Swagger Documentation
### NOTE : The module only runs on a minimum version 2.8 of reference Application

11   For Using webservices see the module, 
see Above module
### For More rest work 
https://github.com/openmrs/openmrs-module-webservices.rest/pull/393/files

https://github.com/openmrs/openmrs-module-webservices.rest/pull/392/files

https://github.com/openmrs/openmrs-module-webservices.rest/pull/394/files 


###  About Creating Atask , I didthe work below During the Hackathon 
https://github.com/openmrs/openmrs-module-webservices.rest/pull/417/files


