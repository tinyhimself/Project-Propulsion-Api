# Sgoloza's TODO List
## Add a Sql Server docker container.
1. Create a folder to store all the objects defined below (under src/test/)
2. Create a SQL script to create a table
3. Create a SQL script to insert preset data on the table
4. Create a sql script to create a proc that will get data from the above table
5. Create a dockerfile that does the following
   * Pull a mssql base image
   * Runs the scripts defined above to create the table and the proc

We can do the following together (maybe over a call)
* Create a Data Layer on the API to call the db
* Create a Service Layer on the API
* Wire up the service layer to the Controller 