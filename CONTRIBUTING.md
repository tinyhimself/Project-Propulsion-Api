### How to run project:

- Build project.
- Build docker
  * `docker build -t propulsionapi .`
- Run Docker image
  - `docker run -p 5000:8080 propulsionapi`

#### How to run both the application and database on the same network
- Create network
  * `docker network create propulsion_network`
- Show all the networks
  * ` docker network ls`
- Run database from docker file
  *  `docker build -t mssql .`
  *  `docker run -p 1433:1433 --name mssql --network propulsion_network -d mssql`
- Run application
  * `docker build -t propulsionapi .`
  * `docker run -p 5000:8080 --name propulsionapi --network propulsion_network -d propulsionapi`

