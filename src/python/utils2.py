import json
import re

import openpyxl


def fun(file, shift):
    file = "../../data/" + file+"/"+file + ".really.redos.unique.json"
    data = json.loads(open(file, encoding="utf_8").read())
    print(file + " " + str(len(data)))


# fun("java", 0)
fun("python", 1)
fun("js",2)
fun("csharp", 3)
fun("php", 4)
fun("perl", 5)

# fun("php")
