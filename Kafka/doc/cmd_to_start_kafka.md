cd /d/Development/Frameworks/kafka_2.12-0.11.0.0.tar
bin/windows/zookeeper-server-start.bat config/zookeeper.properties

cd /d/Development/Frameworks/kafka_2.12-0.11.0.0.tar
bin/windows/kafka-server-start.bat config/server.properties



bin/windows/kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test

bin/windows/kafka-console-producer.bat --broker-list localhost:9092 --topic test

bin/windows/kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning