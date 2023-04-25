db.getCollection("memo").find({})

show databases

db.createCollection("member")

db.member.insert({"id": "hong", "pw": "1234", "name": "honggildong", "tel": "011"})

db.member.find({})

db.member.insertMany([
                        {"id":"hong2", "pw":"1234", "name":"honggildong", "tel":"011"},
                        {"id":"hong3", "pw":"1234", "name":"honggildong", "tel":"011"}

])

db.member.drop() //member컬렉션 제거

show collections

db.dropDatabase() //shop5제거

show dbs
