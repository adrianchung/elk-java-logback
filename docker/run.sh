#!/bin/bash
MY_PATH=/Users/adrianchung/dev/java/elasticache-logstash-kibana/docker
docker run -d -p 9292:9292 -p 9200:9200 -p 4560:4560 -p 9300:9300 -v $MY_PATH/logstash:/opt/logstash/conf.d -v $MY_PATH/data:/data adrianchung/elk
