import json
import os

source = "../../data/java/java.clear.multiline.json"
data = json.loads(open(source, encoding="utf_8").read())

file = '../../data/java/java.redos.clear.multiline.json'
redos_data = json.loads(open(file, encoding="utf_8").read())

d = dict()
for item in data:
    regexps = item["regexps"]
    for re in regexps:
        pattern = re["pattern"].replace("\n", "").replace("\r", "")
        if pattern in d.keys():
            num = d[pattern] + 1
            d[pattern] = num
        else:
            d[pattern] = 1
redos = set()

for item in redos_data:
    regexps = item["regexps"]
    for re in regexps:
        pattern = re["pattern"].replace("\n", "").replace("\r", "")
        if re["redos"] == "true":
            redos.add(pattern)

c = 0
cr = 0
for item in d.keys():
    num = d[item]
    if num == 1:
        c += 1
        if item in redos:
            cr += 1

print(c)
print(cr)

# print(len(data))

# file = '../../data/java/java.really.redos.unique.json'
# data = []
# redos = json.loads(open(file, encoding="utf_8").read())
# d = dict()
# for i in redos:
#     pattern = i["pattern"]
#     d[pattern] = i
# print(len(redos))
# print(len(d))
# c = 0
# for item in data:
#     regexps = item["regexps"]
#     for re in regexps:
#         re["redos"] = "false"
#         re["timeType"] = ""
#         re["patternType"] = ""
#         pattern = re["pattern"].replace("\n", "").replace("\r", "")
#         if pattern in d.keys():
#             if d[pattern]["redos"] == "Backtrack limit was exhausted":
#                 re["redos"] = "Backtrack limit was exhausted"
#             else:
#                 re["redos"] = "true"
#             re["timeType"] = d[pattern]["type"]
#             re["patternType"] = d[pattern]["patternType"]
#             c+=1
#             print(c)
#
# with open('../../data/java/java.really.redos.unique.json', 'w') as f:
#     json.dump(data, f, indent=" ")
