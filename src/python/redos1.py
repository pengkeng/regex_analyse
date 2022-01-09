import json
import os
import re


def fun(file):
    data = json.loads(open(file, encoding="utf-8").read())
    redos = 0
    d = dict()
    d["BT_LIMIT"] = 0
    for item in data:
        regexps = item["regexps"]
        for re in regexps:
            if re["redos"] == "true":
                redos += 1
                timetype = re["timeType"]
                if timetype in d:
                    d[timetype] = d[timetype] + 1
                else:
                    d[timetype] = 1
                patternType = re["patternType"]
                if "SLQ" in patternType:
                    patternType = "SLQ"
                elif "POA" in patternType:
                    patternType = "POA"
                elif "EOD" in patternType:
                    patternType = "EOD"
                elif "NQ" in patternType:
                    patternType = "NQ"
                elif "EOA" in patternType:
                    patternType = "EOA"
                if patternType in d:
                    d[patternType] = d[patternType] + 1
                else:
                    d[patternType] = 1
            elif re["redos"] == "Backtrack limit was exhausted" :
                if "BT_LIMIT" in d:
                    d["BT_LIMIT"] = d["BT_LIMIT"] + 1
                else:
                    d["BT_LIMIT"] = 1
    print(d.keys())
    print(redos)
    print(d["EXPONENT"])
    print(d["POLYNOMIAL"])
    print(d["NQ"])
    print(d["EOA"])
    print(d["EOD"])
    print(d["POA"])
    print(d["SLQ"])
    print(d["BT_LIMIT"])
    # print(d.keys())
    print(file)


# fun("../../data/csharp/csharp.really.redos.json")
# fun("../../data/python/python.really.redos.json")
fun("../../data/perl/perl.really.redos.json")
# fun("../../data/php/php.really.redos.json")
# fun("../../data/js/js.really.redos.json")
