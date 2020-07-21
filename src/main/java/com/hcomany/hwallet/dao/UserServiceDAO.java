package com.hcomany.hwallet.dao;

import com.hcomany.hwallet.pojo.UserDetails;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.HashMap;

import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserServiceDAO {

    HashMap<String,UserDetails> userDetailsList=new HashMap<>();
    
    public static final Logger logger = LoggerFactory.getLogger(UserServiceDAO.class);
	public static final String ConnectionStarted = "Database Connected";
	public static final String userTable = "HWalletUser";

    public UserDetails createUserDB(UserDetails user){
        userDetailsList.put(user.getId(),user);
        return user;
    }
    
    public UserDetails createUser(UserDetails user){
    	
    	HwalletDBConnector dbAccessor = new HwalletDBConnector();
		MongoDatabase mongoDatabase = dbAccessor.createDBConnection();
		MongoCollection collection = mongoDatabase.getCollection(userTable);
		logger.info(ConnectionStarted);
		Document document = new Document("_id", user.getId());
		document.append("firstName", user.getFirstName());
		document.append("lastName", user.getLastName());
		document.append("passCode", user.getPassword());
		document.append("address", user.getAddress());
		collection.insertOne(document);
		dbAccessor.closeDBConnection();
		
        return user;
    }


    public UserDetails getUser(String userID){

        return userDetailsList.get(userID);
    }

    public UserDetails validateUser(String userID,String password){

        UserDetails userDetails=userDetailsList.get(userID);
        if(userDetails.getPassword().equals(password)){
            return  userDetails;
        }
        return null;
    }


}
