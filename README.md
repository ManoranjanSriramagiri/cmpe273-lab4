Server side 

1. mvn clean package

Run 3 different serservs:
2. java -jar target/server-0.0.1-SNAPSHOT.jar server config/server_A_config.yml'

3. java -jar target/server-0.0.1-SNAPSHOT.jar server config/server_B_config.yml

4. java -jar target/server-0.0.1-SNAPSHOT.jar server config/server_C_config.yml


Client Side
5. mvn clean package

6. java -jar target/client-0.0.1-SNAPSHOT.jar
