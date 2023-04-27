package com.multi.mongoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository //dao용 어노테이션(저장역할. db와 관련있음)
public class MemoDAO {

	@Autowired
	MongoTemplate mongo;
	
	public void list() {
		Query query = new Query();
		query.with(new Sort(Sort.Direction.DESC, "date")); //date항목으로 내림차순하는 조건
		mongo.find(query, Memo2VO.class, "memo");
	}
}
