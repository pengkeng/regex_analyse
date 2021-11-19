import json
import re

file = "../../data/js/js.json"

data = json.loads(open(file, encoding="utf-8").read())
files = set()
pros = set()
res = list()
ress = list()
i = 0
max = 0
m = dict()
for item in data:
    newregex = list()
    for regex in item["regexps"]:
        pattern = regex["pattern"]
        # res.append(pattern)
        # ress.append(len(pattern))
        # max += len(pattern)
        if "Dynamic-Pattern " not in pattern:
            res.append(pattern)
            newregex.append(regex)
        # if pattern == "":
        #     print(pattern)
        # flags = ""
        # if re.fullmatch(("([/~@;%`#!|])[\\w\\W]*\\1(?!(.*(\\w).*(\\3).*))([gGmMsSiIxXuUAjJdDeE]*)"), pattern):
        #     p = str(pattern)[0]
        #     index = str(pattern).rfind(p)
        #     newpattern = pattern[1:index]
        #     flags = pattern[index + 1:]
        #     pattern = newpattern
        # regex["pattern"] = pattern
        # regex["flags"] = flags
        # newregex.append(regex)
        # file = item["filename"]
        # print(file)
        # if "\n" in pattern and pattern != '\n' and pattern != "\t":
        #     res.append(pattern)
        # if "\n" in pattern and pattern != '\n' and pattern != "\t" and "#" in pattern:
        #     ress.append(pattern)
            #     # pattern = "[\r\n]"
        #     if re.fullmatch(".*\[.*\\n.*].*", pattern):
        #         continue
        #     if re.fullmatch("[\\]\\[\\s\\|\\\\s?*\\(\\)^$]*", pattern):
        #         continue
        #     patterns = pattern.split("\n")
        #     s = ""
        #     print(pattern)
        #     for str in patterns:
        #         str = str.strip("\n\r\t ")
        #         print(str)
        #         str = re.sub("[^\\\\]# *[^#\\[\\]]*$", "", str)
        #         print(str)
        #         str = str.strip("\n\r\t ")
        #         s += str
        #     #
        #     i += 1
        #     regex["pattern"] = s
        #     if s != pattern:
        #         res.append(s)
    item["regexps"] = newregex
    # del item['project']
    # filename = item["filename"]
    # files.add(filename)
    # pro = filename.replace("D:/pqc/npm/extract/", "").split("/")[1]
    # pros.add(pro)
    re.ASCII
with open('../../data/js/js.clear.dy.json', 'w') as f:
    json.dump(data, f, indent=" ")

    re.search("\\d+","123sdfsdvd")

# re.fullmatch("[\n]*")
print(len(pros))
print(len(files))
print(len(res))
print(len(set(res)))

import numpy as np

# 均值
print(np.mean(ress))
# 最大值
print(np.max(ress))
# 中位数
print(np.median(ress))
# 返回众数
print(np.argmax(np.bincount(ress)))
