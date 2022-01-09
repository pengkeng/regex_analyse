import json
import os

path = "../../redos/csharp"
source = "../../data/csharp/csharp.clear.unique.txt"
regexes = open(source, encoding="utf-8").readlines()

data = list()
for file in os.listdir(path):
    index = int(str(file).split("_")[0])
    print(index)
    subdata = json.loads(open(path + "/" + file, encoding="utf_8_sig").read())
    for item in subdata:
        if str(item["redos"]).strip(" ") == "true":
            id = (index - 1) * 1000 + int(item["id"])
            item["id"] = id
            item["pattern"] = regexes[id - 1][0:-1]
            data.append(item)

print(len(data))

with open('../../data/csharp/csharp.really.redos.unique.json', 'w') as f:
    json.dump(data, f, indent=" ")
print(len(regexes))
