package com.libao.spark.kafka;

public class KafkaClientApp {
    public static void main(String[] args) {
        new KafkaProducer(KafkaProperties.TOPIC).start();
    }
}
