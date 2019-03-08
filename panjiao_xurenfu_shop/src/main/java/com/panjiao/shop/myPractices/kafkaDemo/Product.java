package com.panjiao.shop.myPractices.kafkaDemo;

/**
 * Created by xp
 * on 2019/2/15.
 */
public class Product {
   /* //要发布消息主题
    private static final String topic="WO_DE_SHI_JIE";
    //要发送到哪个消息服务
    private static final String BRIKER="10.11.126.144:3306";
    //定义消息的生产者（發送者）
    private static  KafkaProducer<String,String> PRODUCER=null;

    //初始化生产者
    static {
        Properties config = initConfig();
        PRODUCER=new KafkaProducer<String, String>(config);
    }
    //初始化配置

    private static Properties initConfig(){
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,BRIKER);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());
        return properties;
    }

    public static void  main(String[] agrs) throws InterruptedException{
        //新建消息实体
        ProducerRecord<String,String> record=null;
        for (int i=0;i<100;i++){
            record=new ProducerRecord<String, String>(topic,"value"+(int)10*(Math.random()));
            //发送消息
            PRODUCER.send(record, new Callback() {
                @Override
                public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                    if (null!=e){
                        System.out.println("发送有误");
                    }else {
                        System.out.println(recordMetadata.toString());
                    }
                }
            });
        }
        PRODUCER.close();

    }
*/
}
