import json
import re


def fun(file):
    output = file.replace(".json", ".unique.json")
    data = json.loads(open(file, encoding="utf-8").read())
    regexes = set()

    for item in data:
        newregex = list()
        for regex in item["regexps"]:
            pattern = regex["pattern"]
            if pattern not in regexes:
                newregex.append(regex)
            regexes.add(pattern)
        item["regexps"] = newregex
    with open(output, 'w') as f:
        json.dump(data, f, indent=" ")
    data = json.loads(open(output, encoding="utf-8").read())
    c = 0
    for item in data:
        c += len(item["regexps"])
    print(c)


# fun("../../data/java/java.clear.multiline.json")
# fun("../../data/perl/perl.clear.multiline.json")
# fun("../../data/php/php.clear.multiline.flag.json")
# fun("../../data/python/python.clear.multiline.json")
# fun("../../data/js/js.clear.dy.json")


# data = json.loads(open("../../data/python/python.clear.multiline.unique.json", encoding="utf-8").read())
# regexes = set()
#
# for item in data:
#     newregex = list()
#     for regex in item["regexps"]:
#         pattern = str(regex["pattern"])
#         regexes.add(pattern.replace('\n', "\\n").replace("\r", "\\r"))
#
# f = open("../../data/python/python.unique.txt", "w+", encoding="utf-8")
# for regex in regexes:
#     f.write(regex + "\n")
# f.close()
# print(len(regexes))
