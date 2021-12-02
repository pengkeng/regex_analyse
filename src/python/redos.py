import json
import os
import re

# path = "/Users/pqc/Desktop/result"
# files = os.listdir(path)
# regexes = open("../../data/redos/regex.txt", encoding="utf-8").readlines()
# data = list()
# for file in files:
#     print(file)
#     if "only_redos" in file:
#         index = (int(str(file).split("_")[0]) - 1)
#         file = os.path.join(path, file)
#         lines = open(file, encoding="utf-8").readlines()
#         for i in range(0, len(lines)):
#             print(i)
#             line = lines[i].rstrip("\n")
#             try:
#                 if line.startswith("id:"):
#                     d = dict()
#                     id = int(line.replace("id:", ""))
#                     # print(id)
#                     timetype = lines[i + 3].rstrip("\n")
#                     patterntype = lines[i + 6].rstrip("\n").replace("patternType:", "").strip(" ")
#                     d["id"] = index * 1000 + id
#                     d["timetype"] = timetype
#                     d["patterntype"] = patterntype
#                     data.append(d)
#             except:
#                 pass
# with open('../../data/redos/result.json', 'w') as f:
#     json.dump(data, f, indent=" ")

data = json.loads(open("../../data/python/python.clear.multiline.json", encoding="utf-8").read())
l = json.loads(open("../../data/redos/pattern_result.json", encoding="utf-8").read())
redos = set()
d = dict()
for item in l:
    pattern = item["pattern"]
    redos.add(pattern)
    d[pattern] = item

print(len(redos))
lll = list()
index = 0
for item in data:
    regexps = item["regexps"]
    ll = list()
    for re in regexps:
        re["redos"] = "false"
        re["timeType"] = ""
        re["patternType"] = ""
        pattern = re["pattern"].replace("\n", "\\n").replace("\r", "\\r")
        if pattern in redos:
            i = d[pattern]
            re["redos"] = "true"
            re["timeType"] = i["timetype"]
            re["patternType"] = i["patterntype"]
        ll.append(re)
    item["regexps"] = ll
    lll.append(item)

with open('../../data/python/python.redos.clear.multiline.json', 'w') as f:
    json.dump(lll, f, indent=" ")
