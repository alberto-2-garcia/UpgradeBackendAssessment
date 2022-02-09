# UpgradeBackendAssessment
Repository for Upgrade Backend Assessment

## Instructions

To run the web server, you'll need Docker installed and your `.env` file created in the root folder. The necessary environment variables are:

```
MYSQLDB_USER=
MYSQLDB_ROOT_PASSWORD=
MYSQLDB_DATABASE=upgrade_db
MYSQLDB_LOCAL_PORT=3307
MYSQLDB_DOCKER_PORT=3306
SPRING_LOCAL_PORT=8081
SPRING_DOCKER_PORT=8081
```

To run the application, you'll have to run the command `docker-compose up app`.
