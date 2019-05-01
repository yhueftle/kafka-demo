package com.corgistudios.kafka.kafkademo.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

/*This class lets us create topics through the program rather than the command line
e.g.
        $ bin/kafka-topics.sh --create \
        --zookeeper localhost:2181 \
        --replication-factor 1 --partitions 1 \
        --topic myTopicName
*/

@Configuration
public class KafkaTopicConfig {

    @Value(value = "${spring.kafka.bootstrap-servers}")
    private String kafkaPort;

    @Value(value = "${corgis.topic.name}")
    String corgisTopic;

    @Value(value = "${partitions.topic.name}")
    String partitionsTopic;

    @Value(value = "${filters.topic.name}")
    String filtersTopic;

    @Value(value = "${turtles.topic.name}")
    String turtleTopic;

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaPort);
        return new KafkaAdmin(configs);
    }

    @Bean
    public NewTopic topic1() {
        return new NewTopic("corgis", 1, (short) 1);
    }

    @Bean
    public NewTopic topic2() {
        return new NewTopic("partitions", 6, (short) 1);
    }

    @Bean
    public NewTopic topic3() {
        return new NewTopic("filters", 1, (short) 1);
    }

    @Bean
    public NewTopic topic4() {
        return new NewTopic("turtles", 3, (short) 1);
    }
}
