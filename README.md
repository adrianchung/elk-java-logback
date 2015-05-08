elk-java-logback
----------------

This is an example that shows how to log from a Java application into the ELK
stack using a docker container.

To run this example:
    cd docker/
    ./build.sh
    ./run.sh

Note: Make sure you edit run.sh so that you're mounting the proper directories into your container.

To run the Java application:
    cd app/
    gradle run

To see see kibana: `http://docker-ip:9292`

To see entries in elasticache: `http://docker-ip:9200/_search?pretty`

