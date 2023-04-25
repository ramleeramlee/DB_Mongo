db.getCollection("memo").find({})

db.memo.find({})

db.memo.find({name: "Tom", office: "seoul"}, {phone:1}).count() //and조건
db.memo.find({$or : [{name: "Tom", office: "seoul"}]}, {phone:1}).count() 
//or조건 {$or : [{조건키 : 값}, {조건키 : 값}] -> {$or : [json, json, json]}

db.memo.find({office:"busan"}, {_id:0, office:1, phone:1})
db.memo.find({office: {$not: /busan/}}, {_id:0, office:1, phone:1}).limit(3)

db.memo.deleteOne({office:"Wordware"})

db.memo.find({office:"Wordware"})

db.memo.updateMany({office:"seoul"}, {$set : {phone: "999"}})

db.memo.find({office:"seoul"}, {phone:1})

db.memo.deleteMany({})

db.memo.find({}).count()


