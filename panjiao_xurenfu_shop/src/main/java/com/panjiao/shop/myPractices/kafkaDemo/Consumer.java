package com.panjiao.shop.myPractices.kafkaDemo;

/**
 * Created by xp
 * on 2019/2/15.
 */
public class Consumer {
    /*//定义topic
    private static final String topi="WO_DE_SHI_JIE";
    //定义去哪里接收消息
    private static final String BROKER_LIST="10.11.126.144:3306";
    //定义消费者
    private static KafkaConsumer<String,String> consumer=null;
    //初始化消费者
    static {
        Properties properties = initConfig();
        consumer = new KafkaConsumer<String, String>(properties);
    }
    //初始化配置
    private static Properties initConfig(){
        Properties properties = new Properties();
        //设置拿消息的地址
        properties.put("bootstrap.servers",BROKER_LIST);
        //设置groupid
        properties.put("group.id",0);
        //键与值的序列化
        properties.put("key.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("value.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
        properties.setProperty("enable.auto.commit", "true");
        properties.setProperty("auto.offset.reset", "earliest");
        return properties;
    }

    public static void main(String[] agrs){
        while (true){
            ConsumerRecords<String,String> records = consumer.poll(10);
            for (ConsumerRecord<String,String> record:records){
                System.out.println(record.toString());
            }
        }
    }*/
}
