package com.hcomany.hwallet.dao;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class HwalletDBConnector {

	public static final Logger logger = LoggerFactory.getLogger(HwalletDBConnector.class);

	public MongoClient mongoClient;

	public MongoDatabase createDBConnection() {
		logger.info("Database connection creating");

		String uri = "mongodb+srv://admin:admin@grosumdb-qiymu.mongodb.net/admin";
		MongoClientURI clientURI = new MongoClientURI(uri);
		CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
				fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		mongoClient = new MongoClient(clientURI);
		MongoDatabase mongoDatabase = mongoClient.getDatabase("GrosumDB").withCodecRegistry(pojoCodecRegistry);
		return mongoDatabase;
	}

	public void closeDBConnection() {
		logger.info("Database connection closing");
		mongoClient.close();
	}
}
