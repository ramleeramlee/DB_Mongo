package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest_update2 {

	public static void main(String[] args) {
		// 1. 몽고db 프로그램에 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. 몽고db 프로그램에 연결 성공");
		// 2. shop2 db로 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 db로 연결 성공");
		
		// 3. member 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("member");
		System.out.println("3. member 컬렉션에 연결 성공");

		//update할 조건을 json(Document로 만들기)
		Document filter = new Document();
		filter.append("id", "friday");
		//update할 내용은 Bson(json)을 만들어서 변경할 내용 적는다
		Bson set = Updates.set("name", "winwin");
		Bson set2 = Updates.set("tel", "win010");
		
		List<Bson> list = new ArrayList<Bson>();
		list.add(set);
		list.add(set2);
		
		//list를 다시 json으로 만들어줘야 함
		Bson setts = Updates.combine(list); 
		
		collection.updateOne(filter, setts);
		System.out.println("4. updateOne 성공");
	}

}
