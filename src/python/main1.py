import json
import re

file = "../../data/js/js.clear.dy.json"
file2 = "../../data/js/nest_js.txt"
file3 = "../../data/js/star_height_js.txt"

data = json.loads(open(file, encoding="utf-8").read())
files = set()
pros = set()
res = list()
i = 0
max = 0
m = dict()
for item in data:
    newregex = list()
    for regex in item["regexps"]:
        pattern = regex["pattern"]
        res.append(len(pattern))

import numpy as np

# 均值
print(np.mean(res))
# 最大值
print(np.max(res))
# 中位数
print(np.median(res))
# 返回众数
print(np.argmax(np.bincount(res)))

lines = open(file2, encoding="utf-8").readlines()
res.clear()
for line in lines:
    res.append(int(line.strip("\n")))

# 均值
print(np.mean(res))
# 最大值
print(np.max(res))
# 中位数
print(np.median(res))
# 返回众数
print(np.argmax(np.bincount(res)))

lines = open(file3, encoding="utf-8").readlines()
res.clear()
for line in lines:
    res.append(int(line.strip("\n")))

# 均值
print(np.mean(res))
# 最大值
print(np.max(res))
# 中位数
print(np.median(res))
# 返回众数
print(np.argmax(np.bincount(res)))
