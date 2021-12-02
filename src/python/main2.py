import json
import re

file = "../../data/python/python.clear.multiline.json"
# file2 = "../../data/js/nest_js.txt"
# file3 = "../../data/js/star_height_js.txt"

data = json.loads(open(file, encoding="utf-8").read())
files = set()
pros = set()
res = list()
i = 0
max = 0
# m = dict()
for item in data:
    for regex in item["regexps"]:
        if "funcName" in regex.keys():
            func = regex["funcName"]
            res.append(func)

m = set(res)
d = dict()

for func in res:
    if func in d.keys():
        d[func] = d[func] + 1
    else:
        d[func] = 1

print(set)
for key in d.keys():
    print(key + ":" + str(d[key]))
# for key in d.keys():
#     print(d[key])
