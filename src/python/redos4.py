import json
import os

source = "../../data/java/java.redos.clear.multiline.json"
file = '../../data/java/java.really.redos.unique.json'
data = []
redos = json.loads(open(file, encoding="utf_8").read())
d = dict()
for i in redos:
    pattern = i["pattern"]
    d[pattern] = i
print(len(redos))
print(len(d))
c = 0
for item in data:
    regexps = item["regexps"]
    for re in regexps:
        re["redos"] = "false"
        re["timeType"] = ""
        re["patternType"] = ""
        pattern = re["pattern"].replace("\n", "").replace("\r", "")
        if pattern in d.keys():
            if d[pattern]["redos"] == "Backtrack limit was exhausted":
                re["redos"] = "Backtrack limit was exhausted"
            else:
                re["redos"] = "true"
            re["timeType"] = d[pattern]["type"]
            re["patternType"] = d[pattern]["patternType"]
            c+=1
            print(c)

with open('../../data/java/java.really.redos.unique.json', 'w') as f:
    json.dump(data, f, indent=" ")
