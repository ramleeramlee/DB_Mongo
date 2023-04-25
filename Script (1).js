use shop10

db.memo.find({}) //전체검색

db.memo.count({}) //전체카운트

db.memo.insertOne({
    "name": "apple",
})

db.createCollection("member")

db.member.stats()

db.member.insert({
    "name" : "hong",
    "age" : 100,
    "tel" : "010"
})

db.member.find({})

