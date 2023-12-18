package com.rsachin.cricketmatch.configurations;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;

@Configuration
public class MongoConfig{

    @Value("${spring.data.mongodb.database}")
    private String DB_NAME;
    @Bean
    public MongoClient mongo(){
        ConnectionString connectionString=new ConnectionString("mongodb://127.0.0.1:27017/"+DB_NAME);
        MongoClientSettings mongoClientSettings=MongoClientSettings.builder().applyConnectionString(connectionString).build();
        return MongoClients.create(mongoClientSettings);

    }

    @Bean
    public MongoTemplate mongoTemplate(MongoDatabaseFactory factory, MappingMongoConverter converter) throws Exception{
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));
        return new MongoTemplate(factory,converter);
    }
}
