db.getCollection("memo2").find({})

db.memo2.find({})

db.memo2.find({office: "Wordware"}, {age:1, phone:1})

db.memo2.find({age: 1}, {office:1, name:1}).count()

db.memo2.insertOne({age: 200, name: "hong", office: "busan", phone: "011"})

db.memo2.find({})

db.memo2.updateOne({age: 2}, {$set: {office: "seoul"}})

db.memo2.find({$or: [{age: 2}, {office: "busan"}]})

db.memo2.deleteOne({age: 3})

db.memo2.find({age: 3})

db.memo2.updateOne({name: "Didi"}, {$set: {office: "ulsan"}})

db.memo2.find({name: "Didi"})

db.memo2.deleteMany({})

db.memo2.drop()

show collections





