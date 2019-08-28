cd /Users/liqiang/Documents/SourceTree/spring_cloud/eurekaserver
mvn clean install
cd /Users/liqiang/Documents/SourceTree/spring_cloud/user
mvn clean install
cd /Users/liqiang/Documents/SourceTree/spring_cloud/api
mvn clean install
cd /Users/liqiang/Documents/SourceTree/spring_cloud/manager
mvn clean install

java -jar /Users/liqiang/Documents/SourceTree/spring_cloud/eurekaserver/target/eurekaserver-1.0-SNAPSHOT.jar
java -jar /Users/liqiang/Documents/SourceTree/spring_cloud/api/target/api-1.0-SNAPSHOT
java -jar /Users/liqiang/Documents/SourceTree/spring_cloud/user/target/user-1.0-SNAPSHOT.jar
java -jar /Users/liqiang/Documents/SourceTree/spring_cloud/manager/target/manager-1.0-SNAPSHOT.jar