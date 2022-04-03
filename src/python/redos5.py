import json
import os

source = "../../data/java/java.redos.clear.multiline.json"
# file = '../../data/java/java.really.redos.unique.json'
data = json.loads(open(source, encoding="utf_8").read())
# redos = json.loads(open(file, encoding="utf_8").read())
# d = dict()
# for i in source:
#     pattern = i["pattern"]
#     # d[pattern] = i
print(len(data))
# print(len(d))
# c = 0
l = list()
for item in data:
    regexps = item["regexps"]
    for re in regexps:
        if re["redos"] == "true":
            l.append(re["pattern"])

print(len(l))
l = set(l)
print(len(l))

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
# #
# with open('../../data/php/php.really.redos.json', 'w') as f:
#     json.dump(data, f, indent=" ")
