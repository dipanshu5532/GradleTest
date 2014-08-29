package com.target.mytest;

import java.net.UnknownHostException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

@Path("gradle")
public class TestClaass {

	@GET
	@Path("/hello")
public  String sayHello() {
		try {
			MongoClient client=new MongoClient();
			DB db= client.getDB("grocery");
			DBCollection collection=db.getCollection("test1");
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return "Hello World Using Gradle";
}

}
